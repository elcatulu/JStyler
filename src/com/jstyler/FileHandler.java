package com.jstyler;

import java.io.*;

/**
 * FileHandler is a utility class for working with text files.
 * It provides methods for creating, saving, reading, and editing files.
 *
 * Methods:
 * - createAndSaveFile: Creates a file with the specified name and writes content to it.
 * - readFile: Reads the content of a file and returns it as a string.
 * - editAndSaveFile: Edits the content of an existing file by saving new content to it.
 */
public class FileHandler {

    public void createAndSaveFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public void editAndSaveFile(String fileName, String newContent) {
        createAndSaveFile(fileName, newContent);
    }
}
