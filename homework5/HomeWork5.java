package homework5;

import java.io.File;

public class HomeWork5 {
    public static void main(String[] args) {
        File file = new File("resources/TestFile.cvs");
        System.out.println(file.getAbsolutePath());

        CVSFileData appData = new CVSFileData(file);

        //print original
        appData.printData();

        //modify
        appData.sortData();

        //print new
        appData.printData();

        //write sorted data
        appData.writeData();
    }
}
