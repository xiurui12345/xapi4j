package xapi4j.core.common;

import xapi4j.core.enums.BaseEnum;

import java.util.EnumSet;

/**
 * 枚举工具类
 *
 * @author ：gxr
 */
public class EnumUtils {
    /**
     * 通过枚举code获取枚举对象
     * @param tClass
     * @param code
     * @param <T>
     * @param <Enum>
     * @return
     */
    public static <T extends BaseEnum, Enum> T getEnumByCode(Class<T> tClass, Object code) {
        T[] enumConstants = tClass.getEnumConstants();
        for (T enumConstant : enumConstants) {
            if (enumConstant.getCode().equals(code)) {
                return enumConstant;
            }
        }
        return null;
    }
}
