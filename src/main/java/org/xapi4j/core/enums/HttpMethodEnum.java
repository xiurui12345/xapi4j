package org.xapi4j.core.enums;

/**
 * HTTP请求方式
 *
 * @author ：gxr
 */
public enum HttpMethodEnum implements BaseEnum<String> {
    /**
     * get请求
     */
    GET("GET", "get请求"),
    /**
     * post请求
     */
    POST("POST", "post请求"),
    /**
     * put请求
     */
    PUT("PUT", "put请求"),
    /**
     * delete请求
     */
    DELETE("DELETE", "delete请求"),
    /**
     * patch请求
     */
    PATCH("PATCH", "patch请求"),
    /**
     * 未知请求（对应接口类型一般为SERVICE或DUBBO）
     */
    UNKNOWN("UNKNOWN", "未知请求"),
    ;

    HttpMethodEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    private String code;
    private String name;

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
