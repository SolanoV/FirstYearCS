package fop.filesampling;

import java.util.*;
import java.io.*;

public class OutputFile {
    static Scanner inputFile;
    static PrintWriter outputFile;
    static FileWriter writer;
    static String rowData;
    static File file;
    static String fileName;
    static int lineNumber=1;
    static BufferedReader reader;
    static int lineLength=0;
    static int wordCount=0;
    public static void main(String[] args) throws IOException, InterruptedException {
        openFile();
        processFile();
        closeFile();

    }
    public static void openFile() throws IOException {
        try {
            file = new File("../FileSampling/SampleText.txt");
            writer=new FileWriter(file, true);
            inputFile=new Scanner(new FileReader("../FileSampling/SampleText.txt"));
            outputFile=new PrintWriter("../FileSampling/SampleOutputText.txt");

        }catch(FileNotFoundException e) {

        }
    }
    public static void processFile() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        appendToFile(file, "This little light of mine, I'm gonna let it shine");
        while(((line = br.readLine()) != null)&&lineNumber<3) {
            fileName="SampleText.txt";
            rowData=inputFile.nextLine();
            outputFile.println("\""+rowData+"\"");
            System.out.println("\""+rowData+"\"");

            lineLength += getLineLength(fileName, lineNumber);
            outputFile.println("length: "+lineLength);
            System.out.println("length: "+lineLength);
            outputFile.println("path: "+file.getAbsolutePath());
            System.out.println("path: "+file.getAbsolutePath());
            wordCount += getWordCount(fileName, lineNumber);
            outputFile.println("Word Count: " + wordCount);
            System.out.println("Word Count: " + wordCount);
            lineNumber++;
            outputFile.println();
            outputFile.println();

        }
            /*fileName="SampleText.txt";
			rowData=inputFile.nextLine();
			System.out.println("\""+rowData+"\"");
			System.out.println("length: "+file.length());
			System.out.println("path: "+file.getAbsolutePath());
			int lineLength = getLineLength(fileName, lineNumber);
            System.out.println("Length of line: " + lineLength);
            lineNumber++;
            System.out.println();
            String appendedText = "This little light of mine, I'm gonna let it shine";
            appendToFile(file, appendedText);
            System.out.println("\"" + appendedText + "\"");
            System.out.println("length: " + file.length());
            System.out.println("path: " + file.getAbsolutePath());
            int appendedLineLength = getLineLength(fileName, lineNumber);
            System.out.println("Length of Line: " + appendedLineLength);
            System.out.println();*/

    }
    public static void closeFile() throws IOException{
        inputFile.close();
        outputFile.close();
        writer.close();

    }
    public static int getWordCount(String fileName, int lineNumber) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int currentLineNumber = 1;
        String line;
        while ((line = reader.readLine()) != null) {
            if (currentLineNumber == lineNumber) {
                reader.close();
                String[] words = line.split("\\s+");
                return words.length;
            }
            currentLineNumber++;
        }
        reader.close();
        throw new IllegalArgumentException("Line number " + lineNumber + " does not exist in the file");
    }
    public static int getLineLength(String fileName, int lineNumber) throws IOException {
        reader = new BufferedReader(new FileReader(fileName));
        int currentLineNumber = 1;
        String line;
        while ((line = reader.readLine()) != null) {
            if (currentLineNumber == lineNumber) {
                reader.close();
                return line.length();
            }
            currentLineNumber++;
        }
        reader.close();
        throw new IllegalArgumentException("Line number " + lineNumber + " does not exist in the file");
    }
    public static void appendToFile(File file, String text) throws IOException {
        FileWriter writer = new FileWriter(file, true);
        writer.append("\n" + text);
        writer.close();
    }
    //MADE BY VINZ EULO A. SOLANO

}

