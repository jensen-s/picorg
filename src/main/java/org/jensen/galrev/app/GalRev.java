package org.jensen.galrev.app;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jensen.galrev.ui.MainView;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 * Created by jensen on 09.04.15.
 */
public class GalRev extends Application{

    private static final Logger logger = LogManager.getLogger(GalRev.class);


    @Override
    public void start(Stage primaryStage) throws Exception {
        logger.info("Application starting: " + AppInfo.getFullApplicationName());
        Parent root = MainView.load();
        primaryStage.setTitle(AppInfo.getFullApplicationName());
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(GalRev.class);
    }
}