import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;

public class CsvManagerImpl {

    public static void saveToStorage(Task taskDetails) {
        try {
            String outputFilePath = "./storage.csv";
            BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(outputFilePath), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            try (CSVPrinter csvPrinter = CSVFormat.newFormat('|')
                    .withRecordSeparator('\n')
                    .print(bufferedWriter)) {
                csvPrinter.printRecord(taskDetails);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayTasksInCSVFile() throws IOException {
        try {
            String[] HEADERS = { "author", "title"};
            Reader reader = new FileReader("./storage.csv");
            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withHeader(HEADERS)
                    .withFirstRecordAsHeader()
                    .parse(reader);
            for (CSVRecord record : records) {
                String author = record.get("author");
                String title = record.get("title");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
