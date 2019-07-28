import org.xapi4j.core.beans.ScanConfigBean;
import org.xapi4j.core.enums.ScanTypeEnum;

import java.util.ArrayList;

/**
 * @author ：gxr
 * @date ：2019-07-28 19:51
 */
public class mainTest {
    private static ScanConfigBean getScanConfigBean() {
        ScanConfigBean scanConfigBean = new ScanConfigBean();
        scanConfigBean.setScanJarFile("/Users/gaorui/IdeaProjects/xapi4j-test/target/test-0.0.1-SNAPSHOT.jar");
        scanConfigBean.setScanPackageName("xapi4j.test");
        scanConfigBean.setSourceCodeDir("/Users/gaorui/IdeaProjects/xapi4j-test/src/main/java/xapi4j/test");
        ArrayList<ScanTypeEnum> scanTypeEnums = new ArrayList<>();
        scanTypeEnums.add(ScanTypeEnum.CONTROLLER);
        scanTypeEnums.add(ScanTypeEnum.SERVICE);
        scanTypeEnums.add(ScanTypeEnum.DUBBO);
        scanConfigBean.setScanTypeEnums(scanTypeEnums);
        return scanConfigBean;
    }
    public static void main(String[] args) {
        ScanConfigBean scanConfigBean = getScanConfigBean();


        System.out.println("main test");
    }
}
