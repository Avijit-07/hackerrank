package hackerrank;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5Encryption {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.next();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte messageDigest[] = md.digest(s.getBytes());

            BigInteger bigInt = new BigInteger(1, messageDigest);

            String encryptedValue = bigInt.toString(16);
            while (encryptedValue.length() < 32){
                encryptedValue = "0" + encryptedValue;
            }
            System.out.println(encryptedValue);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
