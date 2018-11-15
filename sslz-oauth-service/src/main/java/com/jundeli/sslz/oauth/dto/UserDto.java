package com.jundeli.sslz.oauth.dto;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用途
 * @date 2018年10月09日  下午4:57
 * @address: 四川成都
 */
public class UserDto {
    private String userId;
    private String username;
    private String password;
    private String token;
    private String roleName;
    private String verificationCode;
    private int accountStatus;
    private String phone;

    public UserDto() {

    }

    private UserDto(Builder builder) {
        setUserId(builder.userId);
        setUsername(builder.username);
        setPassword(builder.password);
        setToken(builder.token);
        setRoleName(builder.roleName);
        setVerificationCode(builder.verificationCode);
        setAccountStatus(builder.accountStatus);
        setPhone(builder.phone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public int getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static final class Builder {
        private String userId;
        private String username;
        private String password;
        private String token;
        private String roleName;
        private String verificationCode;
        private int accountStatus;
        private String phone;

        private Builder() {
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder verificationCode(String verificationCode) {
            this.verificationCode = verificationCode;
            return this;
        }

        public Builder accountStatus(int accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserDto build() {
            return new UserDto(this);
        }
    }
}
