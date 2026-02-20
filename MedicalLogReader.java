/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package qali.medicallogreader;

/**
 *
 * @author QARAN TRAVEL
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MedicalLogReader {

    public static void main(String[] args) {

        File medicalLogFile = new File("medicalLog.txt");
        FileReader reader = null;

        try {
            reader = new FileReader(medicalLogFile);
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("\nFile closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
