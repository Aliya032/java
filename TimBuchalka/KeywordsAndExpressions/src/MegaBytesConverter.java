public class MegaBytesConverter {
    // write code here
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }
        int mb = kiloBytes / 1024;
        int kb = kiloBytes %1024;
        System.out.println(kiloBytes+" KB = "+mb + " MB and "+ kb+ " KB");
    }
}

