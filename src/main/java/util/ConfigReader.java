package util;

import model.InverseInfo;
import rule.ColorSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConfigReader {

    public static String path = "src\\main\\resources\\excluded.txt";
    public static String inversePath = "src\\main\\resources\\inverse.txt";
    public static String colorPath = "src\\main\\resources\\colors.txt";

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

    public static Set<InverseInfo> readInverseConfig() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inversePath));
        String         line = null;

        Set<InverseInfo> set = new HashSet<>();

        try {
            while((line = reader.readLine()) != null) {
                String[] subs = line.split(" ");
                InverseInfo info = new InverseInfo(subs[0], subs[1], subs[2], subs[3], subs[4]);
                set.add(info);
            }

            return set;
        } finally {
            reader.close();
        }
    }

    public static List<ColorSystem> readColorConfig() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(colorPath));
        String         line = null;

        List<ColorSystem> list = new ArrayList<>();

        try {
            while((line = reader.readLine()) != null) {
                String[] subs = line.split(" ");
                int red = Integer.parseInt(subs[1]);
                int green = Integer.parseInt(subs[2]);
                int blue = Integer.parseInt(subs[3]);
                ColorSystem info = new ColorSystem(subs[0],red, green, blue);
                list.add(info);
            }

            return list;
        } finally {
            reader.close();
        }
    }

}
