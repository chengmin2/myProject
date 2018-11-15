package com.jundeli.sslz.tool.protocol;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 错误信息描述
 * @date 2018年03月27日  上午11:13
 * @address: 四川成都
 */
public final class ErrorProtocol {
    private ErrorProtocol() {
    }

    public static final ResultProtocol E_400 = ResultProtocol.builder().code(400).success(false).message("参数不能为空").build();
    public static final ResultProtocol E_401 = ResultProtocol.builder().code(401).success(false).message("没有验证信息或者验证失败").build();
    public static final ResultProtocol E_403 = ResultProtocol.builder().code(403).success(false).message("请求被被拒绝").build();
    public static final ResultProtocol E_404 = ResultProtocol.builder().code(404).success(false).message("资源不存在").build();
    public static final ResultProtocol E_405 = ResultProtocol.builder().code(405).success(false).message("请求中指定的方法不被允许").build();
    public static final ResultProtocol E_406 = ResultProtocol.builder().code(406).success(false).message("服务器生成的响应无法被客户端所接受").build();
    public static final ResultProtocol E_407 = ResultProtocol.builder().code(407).success(false).message("用户必须首先使用代理服务器进行验证，这样请求才会被处理").build();
    public static final ResultProtocol E_408 = ResultProtocol.builder().code(408).success(false).message("请求超出了服务器的等待时间").build();
    public static final ResultProtocol E_409 = ResultProtocol.builder().code(409).success(false).message("服务器在完成请求时发生冲突").build();
    public static final ResultProtocol E_413 = ResultProtocol.builder().code(413).success(false).message("请求实体过大").build();
    public static final ResultProtocol E_423 = ResultProtocol.builder().code(423).success(false).message("超过访问次数,当前资源被锁定").build();
    public static final ResultProtocol E_429 = ResultProtocol.builder().code(429).success(false).message("过多的请求").build();
    public static final ResultProtocol E_500 = ResultProtocol.builder().code(500).success(false).message("内部服务错误").build();
    public static final ResultProtocol E_503 = ResultProtocol.builder().code(503).success(false).message("服务不可用").build();
    public static final ResultProtocol E_504 = ResultProtocol.builder().code(504).success(false).message("网关超时").build();
}
