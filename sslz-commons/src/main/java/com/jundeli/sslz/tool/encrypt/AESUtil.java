package com.jundeli.sslz.tool.encrypt;


import com.jundeli.sslz.tool.string.StringUtil;
import org.springframework.util.Base64Utils;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: AES加密解密
 * @date 2018年05月10日 下午2:27
 * @address: 四川成都
 */
public final class AESUtil {

    private AESUtil() {
        throw new UnsupportedOperationException("这是一个工具类不能实例化");
    }

    /**
     * 使用AES
     */
    private static final String ALGORITHM = "AES";
    /**
     * 密钥
     */
    private final static String KEY = "8495e441a6d6409d8e0f0fc39cd83b6e";
    /**
     * 偏移量
     */
    private final static int OFFSET = 16;
    /**
     * 转换器
     */
    private final static String TRANSFORMATION = "AES/CBC/PKCS5Padding";

    /**
     * 加密
     *
     * @param content 需要加密的内容
     * @return 返回加密后的
     */
    public static String encryptBase64(String content) {
        try {
            SecretKeySpec skey = new SecretKeySpec(AESUtil.KEY.getBytes(StandardCharsets.UTF_8), ALGORITHM);
            IvParameterSpec iv = new IvParameterSpec(AESUtil.KEY.getBytes(StandardCharsets.UTF_8), 0, OFFSET);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            byte[] byteContent = content.getBytes(StandardCharsets.UTF_8);
            // 初始化
            cipher.init(Cipher.ENCRYPT_MODE, skey, iv);
            byte[] result = cipher.doFinal(byteContent);
            // 编码  加密
            return Base64.getEncoder().encodeToString(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * AES（256）解密
     *
     * @param content 待解密内容
     * @return 解密之后
     */
    public static String decryptBase64(String content) {
        try {
            SecretKeySpec skey = new SecretKeySpec(AESUtil.KEY.getBytes(StandardCharsets.UTF_8), ALGORITHM);
            IvParameterSpec iv = new IvParameterSpec(AESUtil.KEY.getBytes(StandardCharsets.UTF_8), 0, OFFSET);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            // 初始化
            cipher.init(Cipher.DECRYPT_MODE, skey, iv);
            byte[] result = cipher.doFinal(Base64.getDecoder().decode(content));
            // 解密
            return new String(result, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 键
     *
     * @return 返回键
     */
    public static String getKey() {
        KeyGenerator keyGenerator;
        try {
            keyGenerator = KeyGenerator.getInstance(ALGORITHM);
            SecureRandom secureRandom = new SecureRandom();
            int keySize = 256;
            keyGenerator.init(keySize, secureRandom);
            SecretKey aesKey = keyGenerator.generateKey();
            return Base64.getEncoder().encodeToString(aesKey.getEncoded());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 加密
     *
     * @param content 要加密的值
     * @return 返回加密好的字符串
     */
    public static String aesEncryption(String content) {
        if (!StringUtil.isEmpty(content)) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(Base64Utils.decodeFromString(KEY), ALGORITHM);
                Cipher cipher = Cipher.getInstance(ALGORITHM);
                cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
                byte[] bytes = cipher.doFinal(content.getBytes(StandardCharsets.UTF_8));
                StringBuilder hex = new StringBuilder();
                for (byte aByte : bytes) {
                    int h = aByte & 0XFF;
                    if (h < 16) {
                        hex.append("0");
                    }
                    hex.append(Integer.toHexString(h));
                }
                return hex.toString();
            } catch (NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String aesDecryption(String content) {
        if (!StringUtil.isEmpty(content)) {


            try {
                int length = content.length() >> 1;
                byte[] data = new byte[length];
                for (int i = 0; i < length; i++) {
                    int n = i << 1;
                    int height = Integer.valueOf(content.substring(n, n + 1), 16);
                    int low = Integer.valueOf(content.substring(n + 1, n + 2), 16);
                    data[i] = (byte) (height * 16 + low);
                }
                SecretKeySpec secretKeySpec = new SecretKeySpec(Base64Utils.decodeFromString(KEY), ALGORITHM);
                Cipher cipher = Cipher.getInstance(ALGORITHM);
                cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
                byte[] bytes = cipher.doFinal(data);
                return new String(bytes, StandardCharsets.UTF_8);
            } catch (NoSuchAlgorithmException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
