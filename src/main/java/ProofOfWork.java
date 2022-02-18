import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class ProofOfWork {

    /* *** *** *** HELPER FUNCTIONS *** *** *** */
    static MessageDigest msgdig;

    static {
        try {
            msgdig = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException exc) {
            exc.printStackTrace();
        }
    }

    /**
     * Create an sha256 hash of the string representation of the number n and return the hash as a byte array.
     * @param n A number
     * @return the sha256 hash of the string representation of n as byte array
     */
    public static byte[] sha256(long n) {

        return msgdig.digest(String.format("%d",n).getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Turns an array of bytes into a String of 0s and 1s
     * @param bs The byte array
     * @return A String consisting only of '0' and '1'.
     */
    public static String byteArrayToBitString(byte[] bs) {
        StringBuilder out = new StringBuilder();
        for(byte b:bs) {
            out.append(String.format("%8s",Integer.toBinaryString(b & 0xFF)));
        }
        return out.toString().replace(' ', '0');

    }

    /* *** *** *** *** *** *** *** *** *** ***  */

    public static int numberOfLeadingZeros(String s) {
        s = s.trim();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if(ch == '0') {
                count++;
            }
            else {
                break;
            }

        }
        return count;
    }

    // Find a number n such that sha256(n) starts with x zeros (ie. the first x bytes are all zero)
    public static long proofOfWork(int x) {
        Random rnd = new Random();
        String str = "";
        long mylong = rnd.nextLong();
        for (int i = 0; i <= x; i++) {
            str += "0";
        }
        while (!byteArrayToBitString(sha256(mylong)).startsWith(str)){
           mylong =  rnd.nextLong();
        }
        return mylong;


    }

    public static boolean verify(long n, int x) {
        byte[] byteArray = sha256(n);
        String byteString = Arrays.toString(byteArray);
        int leadingzeros = numberOfLeadingZeros(byteString);

        return leadingzeros == x;
    }

    public static void main(String[] args) {
        long n = proofOfWork(5);
        System.out.println(n);
        System.out.println(byteArrayToBitString(sha256(n)));
        System.out.println(verify(n, 5));
    }

}
