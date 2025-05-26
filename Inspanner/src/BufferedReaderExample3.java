import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Java\\Inspanner\\src\\LongInputForBufferedReaderExample3.txt");
        BufferedReader b = new BufferedReader(fr);
        String str;
        while ((str = b.readLine())!= null){
            System.out.println(str);
        }
        b.close();
    }
}
