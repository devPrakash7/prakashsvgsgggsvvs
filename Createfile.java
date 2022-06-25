import java.io.File;
import java.io.IOException;

public class Createfile {
    public static void main(String[] args) throws IOException {
        File f = new File("c:\\users\\prakashkumarsamant\\desktop\\java\\Lc.txt");
            
            try{

                if(f.createNewFile()){

                System.out.println("create new file");
            }
            else{
                System.out.println("file already exit");
            }
        }
        catch(IOException i){

            System.out.println(" createNewFile");
        }
    }
}
