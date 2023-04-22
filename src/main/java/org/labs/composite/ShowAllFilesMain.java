package org.labs.composite;

import java.io.File;

public class ShowAllFilesMain {

    public static String level = "";

    public static void main(String[] args) {
       showAllDirectory("C:\\workarea");
    }

    public static void showAllDirectory(String path){
        File directory = new File(path);
        File[] files = directory.listFiles();

        for(File file : files){
            if(file.isFile()){
                System.out.println(level + file.getName());
            }else if(file.isDirectory()){
                System.out.println(level + file.getName());
                level += "------";
                showAllDirectory(file.getAbsolutePath());
                level = level.substring(0, level.lastIndexOf("------"));
            }
        }
    }
}
