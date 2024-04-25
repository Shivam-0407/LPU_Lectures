package FileHandling;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //            InputStreamReader isr = new InputStreamReader(System.in);
//            System.out.println("type in your letters");
//            int letters = isr.read();
//            while(isr.ready()){
//                System.out.println(letters);
//                letters = isr.read();
//            }
////            isr.close();
//            System.out.println();
//            FileReader fr = new FileReader("sample.txt");
//            int letters = fr.read();
//            while(fr.ready()){
//                System.out.println((char)letters);
//                letters = fr.read();
//            }
//            fr.close();
//            System.out.println();



            try{
//           BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
//          while(br.ready()){
//              System.out.println(br.readLine());
//           OutputStream os = System.out;
//           os.write(🌻); // it's exceeding the range

//           OutputStreamWriter osw = new OutputStreamWriter(System.out);
//           osw.write("Hey class");
//           osw.write(97);
//           osw.write('A');
//           osw.write('\n');
//           char [] arr = "Hi class how r u".toCharArray();
//           osw.write(arr);
//           osw.flush();
//          try(  BufferedWriter bw = new BufferedWriter(new FileWriter("sample3.txt",true))){
//              bw.write("This is Buffered Writer Speaking Over n out!!");
//              bw.write("\nCongratulations u've passed this exam with flying colors");

                // created a new file
                File new_file = new File("sample-4.txt");
                new_file.createNewFile();
          }catch (IOException e){
           System.out.println(e.getMessage());
       }
//       }catch (IOException e){
//           System.out.println(e.getMessage());
//       }

        // write in the file
        try{
            FileWriter fw  = new FileWriter("sample-4.txt");
            fw.write("करत करत अभ्यास के, जड़मति होत सुजान\n" +
                    "रसरी आवत जात ते, सिल पर परत निसान");
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        //read from the file
        try{
            BufferedReader br = new BufferedReader(new FileReader("sample-4.txt"));
            while(br.ready()) {
                System.out.println(br.readLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //delete
        try{
            File fo = new File("random-expt.txt");
            fo.createNewFile();
            if(fo.delete()){
                System.out.println("The file that u created is deleted successfully ");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
