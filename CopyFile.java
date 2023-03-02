import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CopyFile {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader("test2.txt"));
        PrintWriter pr = new PrintWriter(new FileWriter("test3.txt",true));
        String data = br.readLine();
        while(data!=null){
            pr.println(data);
            data = br.readLine();
        }
        data = br1.readLine();
        while(data!=null){
            pr.println(data);
            data = br1.readLine();
        }
        pr.flush();
        pr.close();
        br.close();
        br.close();
    }
}
