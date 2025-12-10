package fop.filesampling;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class SampleTextOutput {
    static int count;
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(new File("../FileSampling/SampleText.txt"));
            while ((count=fileReader.read()) != -1){
                System.out.print((char)count);
            }
            fileReader.close();
        }catch(IOException e){

        }
    }
}