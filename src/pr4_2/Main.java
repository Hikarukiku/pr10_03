package pr4_2;

import java.io.*;

/**
 * Created by admin on 10.03.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
            /*try (InputStream is = new FileInputStream("");) {
                while (true) {
                    int c = is.read();
                    if(c<0) break;
                    System.out.println();

                }
            }
        */

        /*try (InputStream is = new BufferedInputStream(new FileInputStream(""))){
            is.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try (InputStream is = new BufferedInputStream(new FileInputStream("1.txt")); OutputStream os = new BufferedOutputStream(new FileOutputStream("2.txt"))){
            while (true){
                int c = is.read();
                if(c<0) break;
                os.write(c);
            }
        }
    }
}
