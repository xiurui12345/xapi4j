package xapi4j;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import xapi4j.core.common.EnumUtils;
import xapi4j.core.enums.HttpMethodEnum;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("xapi4j-JAVA文档生成器");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(600);
        primaryStage.show();

        HttpMethodEnum enumByCode = EnumUtils.getEnumByCode(HttpMethodEnum.class, HttpMethodEnum.GET);
        HttpMethodEnum enumByCode2 = EnumUtils.getEnumByCode(HttpMethodEnum.class, HttpMethodEnum.GET.getCode());
        HttpMethodEnum enumByCode3 = EnumUtils.getEnumByCode(HttpMethodEnum.class, "");

    }


    public static void main(String[] args) {
        launch(args);
    }
}
