import java.io.*;
import java.io.File;

import java.io.FileReader;


public class Main {
    public static void main(String[] args) {

        File file =new File("aayush.txt");

        try {
            file.createNewFile();
            System.out.println("******The file is create a successfully*****");
        } catch (IOException e) {
            System.out.println("*****Couldn't create a file sorry!******");
            throw new RuntimeException(e);
        }

        //Write in the file
        try {
            FileWriter  fileWriter = new FileWriter(file);
            System.out.println("File can be written successfully!");
            fileWriter.write("Writing in a file 1\n");
            fileWriter.write("Writing in a file 2\n");
            fileWriter.write("Writing in a file 3\n");
            fileWriter.write("Writing in a file 4\n");
            fileWriter.write("Writing in a file 5\n");

            fileWriter.close();
            System.out.println("Written successfully in the file!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//Reading from a file

        try{
            FileReader fileReader= new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String aayush;
            while((aayush = bufferedReader.readLine()) != null){
                System.out.println(aayush);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        try {
//            FileReader fileReader=new FileReader(file);
//            //until the value of file.read() value isn't -1
//            int character= fileReader.read();
//            while (character !=-1){
//                System.out.print((char)character);
//                character = fileReader.read();
//            }
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}