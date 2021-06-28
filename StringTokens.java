public class StringTokens {
    public static void main(String[] args) {
        String s = null;
        if(s != null || s != "" || s.length() > 0){
            String[] split = s.trim().split("[\\s!,?._'@\\s]+");
            System.out.println(split.length);
            for (String s1 : split) {
                System.out.println(s1);
            }
        } else {
            System.out.println(0);
        }

    }
}
