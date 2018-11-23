package com.jundeli.sslz.order;



import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;

public class HttpUtil {

    public  static void  main(String[] args) throws JSONException, SocketTimeoutException {
       String result =  //executePostMethod("http://192.168.13.17:8081/order/getOrderList2",new JSONObject("{userId:1}"));
               executeGetMethod("http://192.168.13.17:8081/order/getOrderList2","userId=1");
       JSONObject object = new JSONObject(result);
       System.out.println("测试接口");
    }
    public static String executeGetMethod(String path, String authorization) {
        String response = "";
        try {
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestProperty("Authorization", "Basic " + authorization);
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.connect();

            // 获得返回值
            InputStream in = connection.getInputStream();
            response = getResponse(in);

            connection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    public static String executePostMethod(String path, JSONObject param) throws SocketTimeoutException {
        String paramStr = param.toString();
        String response = "";
        try {
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setUseCaches(false);
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setRequestProperty("Charset", "UTF-8");
            connection.setRequestProperty("Content-Length", String.valueOf(paramStr.length()));
            connection.setRequestProperty("Content-Type", "application/json");
            connection.connect();

            DataOutputStream out = new DataOutputStream(connection.getOutputStream());
            // 写入请求的字符串
            out.writeBytes("userId=1");
            out.flush();
            out.close();

            // 获得返回值
            InputStream in = connection.getInputStream();
            response = getResponse(in);

            connection.disconnect();
        } catch (SocketTimeoutException e) {
            throw e;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    private static String getResponse(InputStream in) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder builder = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return builder.toString();
    }
}
