import menus.Menu;
import operations.FileOperations;
import operations.FileOperationsImpl;

import java.io.File;

public class Driver {

    public static void main(String[] args) {
        /*
            using the resources folder for convenience
         */
        String directoryPath = "src"+ File.separator+"main"+File.separator+"resources";

        Menu menu = new Menu(new FileOperations(directoryPath));
        menu.displayMainMenu();

        /*
            For the alternative implementation, use this instead
         */

        //Menu menuAlternative = new Menu(new FileOperationsImpl(directoryPath));
        //menuAlternative.displayMainMenu();
    }
}
