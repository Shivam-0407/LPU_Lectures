package FileHandling;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
//        try{
//            InputStreamReader isr = new InputStreamReader(System.in);
//            System.out.println("Enter few letters : ");
//            int letter = isr.read();
//            while (isr.ready()){
//                System.out.println((char)letter);
//                letter = isr.read();
//            }

        // Object -> Reader -> InputStreamReader -> FileReader

//            FileReader fr = new FileReader("sample.txt");
//            int letter = fr.read();
//            while (fr.ready()){
//                System.out.println((char)letter);
//                letter = fr.read();
//            }
//            fr.close();

//            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
////            System.out.println("You typed : "+br.readLine());
//            while(br.ready()){
//                System.out.println(br.readLine());
//            }

//            OutputStreamWriter osw = new OutputStreamWriter(System.out);
//            osw.write("Hello how r u");
//            osw.write('\n');
//            osw.write(98);
//            osw.write('A');
//
//           char []arr = "character array".toCharArray();
//            osw.write(arr);
//            osw.flush();

//            OutputStream os = System.out;
//            os.write(98);
//            os.flush();
        // we are going to use a resource for writing into a file
//            try(FileWriter fw =new FileWriter("group2.txt",true);){
        // Writer -> OutputStreamWriter -> FileWriter
//            try(BufferedWriter bw = new BufferedWriter(new FileWriter("group2.txt",true));){
//                bw.write("Hi");
//                bw.write("\nThis is how an appended text look like 🌻");
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
        // File Class
        // create a new file
//        try {
//            File fi = new File("G2.txt");
//            fi.createNewFile();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        // write in a file
//        try {
//            FileWriter fw = new FileWriter("G2.txt", true);
//            fw.write("Congrats u r now writing in the file");
//            fw.write(" \nकरत करत अभ्यास के जड़मति होत सुजान।\n" +
//                    "रसरी आवत जात ते सिल पर परत निसान।।");
//
//            fw.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        // reading from a file
        try {
            BufferedReader br  = new BufferedReader(new FileReader("G2.txt"));
            while(br.ready()){
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Delete a file
        try{
            File fi = new File("file_to_be_deleted.txt");
            fi.createNewFile();
            if(fi.delete()){
                System.out.println("File is deleted successfully");
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
