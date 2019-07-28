package xapi4j.core.beans;

import xapi4j.core.enums.ScanTypeEnum;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 扫描配置
 *
 * @author ：gxr
 */
public class ScanConfigBean implements Serializable {
    /**
     * 扫描JAR文件
     */
    private String scanJarFile;
    /**
     * 扫描包名称
     */
    private String scanPackageName;
    /**
     * 源码目录
     */
    private String sourceCodeDir;
    /**
     * 扫描接口类型
     */
    private List<ScanTypeEnum> scanTypeEnums = new ArrayList<>();


    //region get set

    /**
     * 获取 扫描JAR文件
     *
     * @return scanJarFile 扫描JAR文件
     */
    public String getScanJarFile() {
        return this.scanJarFile;
    }

    /**
     * 设置 扫描JAR文件
     *
     * @param scanJarFile 扫描JAR文件
     */
    public void setScanJarFile(String scanJarFile) {
        this.scanJarFile = scanJarFile;
    }

    /**
     * 获取 扫描包名称
     *
     * @return scanPackageName 扫描包名称
     */
    public String getScanPackageName() {
        return this.scanPackageName;
    }

    /**
     * 设置 扫描包名称
     *
     * @param scanPackageName 扫描包名称
     */
    public void setScanPackageName(String scanPackageName) {
        this.scanPackageName = scanPackageName;
    }

    /**
     * 获取 源码目录
     *
     * @return sourceCodeDir 源码目录
     */
    public String getSourceCodeDir() {
        return this.sourceCodeDir;
    }

    /**
     * 设置 源码目录
     *
     * @param sourceCodeDir 源码目录
     */
    public void setSourceCodeDir(String sourceCodeDir) {
        this.sourceCodeDir = sourceCodeDir;
    }

    /**
     * 获取 扫描接口类型
     *
     * @return scanTypeEnums 扫描接口类型
     */
    public List<ScanTypeEnum> getScanTypeEnums() {
        return this.scanTypeEnums;
    }

    /**
     * 设置 扫描接口类型
     *
     * @param scanTypeEnums 扫描接口类型
     */
    public void setScanTypeEnums(List<ScanTypeEnum> scanTypeEnums) {
        this.scanTypeEnums = scanTypeEnums;
    }

    //endregion
}
