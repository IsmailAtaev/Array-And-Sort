package com.ataev.file;

import java.io.*;

public class WorkFile {
    public static void main(String argv[]){
        try{
            File file =  new File("personArr.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);
            writer.write("aaa\n");
            writer.write("bbb\n");
            writer.write("ccc\n");
            writer.write("ddd\n");
            writer.flush();
            writer.close();

        }catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}


class isma {
    public static void main(String argv[]) throws FileNotFoundException {
        try (FileReader reader = new FileReader("personArr.txt")) {
            BufferedReader reader1 = new BufferedReader(reader);
            StringBuffer ss;
            while (reader1.ready()) {
           //     ss += reader1.readLine().toString();
                System.out.println(reader1.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}