package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Alfavit {
    public static void alfavitAndNum(){
        try (FileWriter fileWriter = new FileWriter("alfavit.txt")){
            for (char i = 'A'; i<='Z'; i++){
                String a = i+""+Character.toLowerCase(i);
                fileWriter.append(a+"\n");
            }
            for (char j = '0'; j <= '9'; j++) {
                fileWriter.append(j+"\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader fileReader = new FileReader("alfavit.txt")){
            Scanner scanner = new Scanner(fileReader);
            int a = 1;
            while (scanner.hasNextLine()){
                System.out.println(a+": "+scanner.nextLine());
                a++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
