package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ConfigReader {

    public static String path = "src\\main\\resources\\excluded.txt";

    public static Set<String> readExcluded() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String         line = null;

        Set<String> set = new HashSet<>();

        try {
            while((line = reader.readLine()) != null) {
                if (line.startsWith("IFC")) set.add(line);
            }

            return set;
        } finally {
            reader.close();
        }
    }

}
