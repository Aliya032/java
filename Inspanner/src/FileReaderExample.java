import java.io.*;
public class FileReaderExample {
    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try
        {
            in = new FileReader("D:\\Java\\Inspanner\\src\\ArabicInputFile.txt");
            out = new FileWriter("ArabicOutputFile.txt");
            int c;
            while ((c = in.read()) != -1)
            {
                out.write(c);
            }
        }
        finally
        {
            if (in != null)
            {
                in.close();
            }
            if (out != null)
            {

                out.close();
            } } } }