package org.xapi4j.core.enums;

/**
 * 枚举借口
 *
 * @author ：gxr
 */
public interface BaseEnum<codeT> {
    /**
     * set code
     * @param code
     */
    void setCode(codeT code);

    /**
     * get code
     * @return
     */
    codeT getCode();

    /**
     * set name
     * @param name
     */
    void setName(String name);

    /**
     * get name
     * @return
     */
    String getName();

}
