public class OrdemInversa {

    public static void main(String[] args) {

        Integer a = new Integer(12);
        String b = a.toString();
        String c = "";

        for (int i=b.length(); i > 0; i--) {
            c += b.substring(i - 1, i);
        }

        System.out.println("numero invertido:" + c);
    }
}

