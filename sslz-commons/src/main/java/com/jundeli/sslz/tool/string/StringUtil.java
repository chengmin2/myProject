package com.jundeli.sslz.tool.string;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: string工具类
 * @date 2017年10月19日 下午5:01
 * @address: 四川成都
 */
public final class StringUtil {
    /**
     * 判断字符串是否是为
     *
     * @param str 需要验证的字符串
     * @return 返回true表示字符串为空
     */
    public static boolean isEmpty(String str) {
        return str == null || "null".equals(str) || "".equals(str);
    }

    /**
     * 判断字符串数组是否是为
     *
     * @param str 需要验证的字符串
     * @return 返回true表示字符串为空
     */
    public static boolean isEmpty(String[] str) {
        return str == null || str.length < 1;
    }

    private StringUtil() {
        throw new UnsupportedOperationException("这是一个工具类不能实例化");
    }
}