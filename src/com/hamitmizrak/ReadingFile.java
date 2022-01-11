package com.hamitmizrak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadingFile {

    public static List<String> fileReader() {
        List<String> lines = new ArrayList<>();
        String str ="", temp ="";
        String path = "C:\\yuksek\\input.txt";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            bufferedReader.readLine();
            while ((str = bufferedReader.readLine()) != null) {
                if (!str.equals("")) {
                    if (Character.isDigit(str.charAt(0))) {
                        lines.add(str);
                    } else {
                        temp = lines.get(lines.size() - 1);
                        lines.set(lines.size() - 1, temp + " " + str);
                    }
                    } else {
                    temp = lines.get(lines.size() - 1);
                    lines.set(lines.size() - 1, temp + " " + bufferedReader.readLine());
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }

}
