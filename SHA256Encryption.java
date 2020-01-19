package hackerrank;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256Encryption {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "K1t4fo0V";

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte messageDigest[] = md.digest(s.getBytes(StandardCharsets.UTF_8));

            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < messageDigest.length; i++) {
                String hex = Integer.toHexString(0xff & messageDigest[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            System.out.println(hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }



}
