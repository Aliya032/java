import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("D:\\Java\\Inspanner\\src\\input.txt");
            out = new FileOutputStream("output.txt");
            int c ;
            while ((c = in.read())  != -1) {
                out.write(c);
            }
        } catch (Exception e) {
            System.out.println("exception is:" + e);
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out!= null) {
                out.close();
            }
        }
    }
}
