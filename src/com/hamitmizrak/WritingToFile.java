package com.hamitmizrak;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class WritingToFile {
    String path = "C:\\yuksek\\output.txt";
    String str = "";
    public void write(){
        List<String> temp = ReadingFile.fileReader();
        List<Journal> journals;
        for(String s: temp){
            journals = createJournal(s);
            for(Journal journal: journals){
                try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))){
                    bufferedWriter.newLine();
                    bufferedWriter.write(journal.toString());
                    System.out.println(journal.toString());
                    bufferedWriter.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private List<Journal> createJournal(String s) {
        List<Journal> journals = new ArrayList<>();
        Journal journal;
        StringTokenizer st;
            StringTokenizer st2 = new StringTokenizer(s,"\t");
            int id = Integer.parseInt(st2.nextToken());
            String name = st2.nextToken();
            String title = (st2.nextToken());
            str = st2.nextToken();
            int year = (Integer.parseInt(st2.nextToken()));
            String jAbstract = (st2.nextToken());
            String keywords = (st2.nextToken());
            String doi = (st2.nextToken());
            st = new StringTokenizer(str,",");
            while (st.hasMoreTokens()){
                journal = new Journal(id, name, title, st.nextToken(), year, jAbstract, keywords, doi);
                journals.add(journal);
            }
        return journals;
    }
}
