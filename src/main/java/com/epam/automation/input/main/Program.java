package com.epam.automation.input.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        String path = args [0];
        File file = new File(path);
        File fileForPrint = new File("d:/Java/collections/collections/src/main/java/com/epam/automation/input/main/structureFile");
        if (file.exists()) {
            if (file.isDirectory()) {
                PrintWriter pw = new PrintWriter(fileForPrint);
                pw.println(file.getName());
                writeStructure(file, pw, 0);
                pw.close();
            } else {
                FileReader fr = new FileReader(path);
                Scanner sc = new Scanner(fr);
                readFile(fr, sc);
                sc.close();
            }
        }
    }

    public static void writeStructure(File file, PrintWriter pw, int level) {
        File[] structure = file.listFiles();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < structure.length; i++) {
            if (structure[i].isDirectory()) {
                pw.println(("|---" + addSpaces(level, sb) + structure[i].getName()));
                writeStructure(structure[i], pw, level + 1);
            } else if (!structure[i].isDirectory() && level == 0) {
                pw.println(("|  *" + sb + structure[i].getName()));
            } else {
                pw.println(("|   " + sb + structure[i].getName()));
            }
        }
    }

    public static StringBuilder addSpaces(int level, StringBuilder sb) {
        for (int i = 0; i < level * 4; i++) {
            sb.append(" ");
        }
        return sb;
    }

    public static void readFile(FileReader fr, Scanner sc) {
        String line = "";
        String lineForTrim = "";
        double sumOfLinesLength = 0;
        double averageLengthOfLines = 0;
        double amountOfFolders = 0;
        double amountOfFiles = 0;
        double amountOfFilesNotInFolders = 0;
        double averageValueOfFilesInFolders = 0;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (line.startsWith("| ")) {
                amountOfFiles++;

            } else if (line.startsWith("|-")) {
                amountOfFolders++;
            }
            if (line.startsWith("|  *")) {
                amountOfFilesNotInFolders++;
            }
            if (line.startsWith("| ")) {
                lineForTrim = line.replaceAll("\\s+", "");
                lineForTrim = lineForTrim.replace("*", "");
                lineForTrim = lineForTrim.replace("|", "");
                sumOfLinesLength += lineForTrim.length();
            }
        }
        if (amountOfFolders != 0) {
            averageValueOfFilesInFolders = (amountOfFiles - amountOfFilesNotInFolders) / amountOfFolders;
        } else {
            averageValueOfFilesInFolders = 0;
        }
        if (amountOfFiles !=0) {
            averageLengthOfLines = sumOfLinesLength/amountOfFiles;
        }
        else {
            averageLengthOfLines = 0;
        }
        System.out.println("Amount of folders: " + amountOfFolders);
        System.out.println("Amount of files: " + amountOfFiles);
        System.out.println("Average value of files in folders: " + averageValueOfFilesInFolders);
        System.out.println("Average length of files: " + averageLengthOfLines);
    }
}

