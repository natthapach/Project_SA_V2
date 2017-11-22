import controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import views.WarehouseController;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{
        MainController controller = new MainController();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/warehouse.fxml"));
        AnchorPane mainLayout = loader.load();
        WarehouseController marketingController = loader.getController();
        marketingController.setController(controller);

        primaryStage.setTitle("Warehouse");
        primaryStage.setScene(new Scene(mainLayout, 774, 582));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
