package com.jundeli.sslz.tool.protocol;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用于service通用返回给控制器的消息
 * @date 2017年09月20日 下午12:29
 * @address: 四川成都
 */
public class ResultProtocol {
    /**
     * 返回的数据
     */
    private Object data;
    /**
     * 成功还是失败
     */
    private boolean success = false;
    /**
     * 返回的消息
     */
    private String message;
    /**
     * 状态码
     */
    private int code = 200;

    public ResultProtocol() {

    }

    ResultProtocol(Builder builder) {
        setData(builder.data);
        setSuccess(builder.success);
        setMessage(builder.message);
        setCode(builder.code);

    }

    public static Builder builder() {
        return new Builder();
    }

    public <T> T getData() {
        return (T) data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static class Builder {
        /**
         * 返回的数据
         */
        private Object data;
        /**
         * 成功还是失败
         */
        private boolean success = false;
        /**
         * 返回的消息
         */
        private String message;
        /**
         * 状态码
         */
        private int code = 200;

        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder code(int code) {
            this.code = code;
            return this;
        }

        Builder() {
        }

        public ResultProtocol build() {
            return new ResultProtocol(this);
        }

    }

}
