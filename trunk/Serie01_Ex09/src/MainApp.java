public class MainApp {
    private static final String FILENAME = "C:\\Users\\Nemesis\\Documents\\ISEL\\EIC\\SI\\Serie01_Ex09\\vaudenay\\crypto.bin";

    public static void main(String[] args) {
        OracleCipher agent = new OracleCipher();
        String content = null;

        content = agent.Decrypt(FILENAME);
        System.out.println("Plain text: " + content);
    }
}