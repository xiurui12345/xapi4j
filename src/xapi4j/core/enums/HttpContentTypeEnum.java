package xapi4j.core.enums;

/**
 * HTTP请求内容类型
 *
 * @author ：gxr
 */
public enum HttpContentTypeEnum implements BaseEnum<String> {
    /**
     * 表单方式
     */
    APPLICATION_X_WWW_FORM_URLENCODED("APPLICATION/X-WWW-FORM-URLENCODED", "表单方式"),
    /**
     * 文件方式
     */
    MULTIPART_FORM_DATA("MULTIPART/FORM-DATA", "文件方式"),
    /**
     * Json方式
     */
    APPLICATION_JSON("APPLICATION/JSON", "Json方式"),
    /**
     * 未知方式
     */
    UNKNOWN("UNKNOWN", "未知方式"),
    ;

    HttpContentTypeEnum(String code, String name) {
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
