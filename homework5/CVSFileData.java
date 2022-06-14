package homework5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CVSFileData {
    private String[] header;
    private int colCount;
    private int rowCount;

    private int[][] data;
    private File file;

    public CVSFileData (File file) {
        this.file = file;
        readData();
    }

    private void readData()  {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String headerLine = reader.readLine();
            header = headerLine.split(";");
            colCount = header.length;

            ArrayList<int[]> rows = new ArrayList<>();
            String line = reader.readLine();
            while (line != null) {

                String[] rowStringValues = line.split(";");
                int[] rowIntValues = new int[colCount];
                for (int i = 0; i< colCount; i++){
                    rowIntValues[i] = Integer.parseInt(rowStringValues[i]);
                }
                rows.add(rowIntValues);
                line = reader.readLine();
            }

            rowCount = rows.size();

            data = new int[rowCount][colCount];
            for (int i = 0; i < rowCount; i++) {
                data[i] = rows.get(i);
            }

        } catch (IOException e) {
            System.out.println("Cannot read the file");
        }
    }

    public void writeData() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            String headerLine;
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < colCount; i++) {
                builder.append(header[i]);
                if (i < colCount - 1) {
                    builder.append(";");
                }
            }
            headerLine = builder.toString();
            writer.write(headerLine);
            writer.newLine();

            for (int i = 0; i < rowCount; i++) {
                builder = new StringBuilder();
                for (int j = 0; j < colCount; j++) {
                    builder.append(data[i][j]);
                    if (j < colCount - 1) {
                        builder.append(";");
                    }
                }
                String newLine = builder.toString();
                writer.write(newLine);
                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Cannot write to the file!");
        }
    }

    public void printData() {
        for (int i = 0; i < colCount; i++) {
            System.out.print(header[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void sortData() {
        for (int i = 0; i < rowCount; i++) {
            Arrays.sort(data[i]);
        }
    }
}
