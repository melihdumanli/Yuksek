package com.hamitmizrak;


public class Main {
    public static void main(String[] args) {
        WritingToFile writingToFile = new WritingToFile();
        try {
            writingToFile.write();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
