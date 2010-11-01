import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class OracleCipher {
    private static final int BLOCKSIZE = 8;
    private byte[] iv;
    private List<byte[]> ciphers;

    public OracleCipher() {
        iv = new byte[BLOCKSIZE];
        ciphers = new LinkedList<byte[]>();
    }

    /*
     * Decrypt file content
     */
    public String Decrypt(String filePath) {
        InitParams(filePath);
        return "";
    }

    /*
     * DEBUG ONLY
     */
    private void Print(String title, String text) {
        System.out.println(title + text);
    }

    /*
     * Initialize IV and cipher blocks from file
     */
    private void InitParams(String filePath) {
        FileInputStream fs = null;

        // Get file
        try { fs = new FileInputStream(filePath); }
        catch (FileNotFoundException ex) { }

        // Read IV, Ciphers and close
        try {
            fs.read(iv);
            byte[] cipher = new byte[BLOCKSIZE];
            while (fs.read(cipher) != -1) {
                ciphers.add(cipher);
                cipher = new byte[BLOCKSIZE];
            }
            fs.close();
        }
        catch (IOException ex) { }
    }
}