public class Split {
    public static void main(String[] args){
        String s = "potato apple lemon";

        String[] vect = s.split(" "); //o parametro dessa função é o separador

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
