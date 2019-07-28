package xapi4j.core.enums;

/**
 * 扫描类型
 *
 * @author ：gxr
 */
public enum ScanTypeEnum implements BaseEnum<String> {
    /**
     * 控制器
     */
    CONTROLLER("CONTROLLER", "控制器"),
    /**
     * 服务层
     */
    SERVICE("SERVICE", "服务层"),
    /**
     * Dubbo
     */
    DUBBO("DUBBO", "Dubbo"),
    ;

    ScanTypeEnum(String code, String name) {
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
