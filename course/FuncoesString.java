

public class FuncoesString{
    public static void main(String[] args){
        String original = "abcde FGHIJ ABC abc DEFG ";

        String s01 = original.toLowerCase(); //transforma em caracteres minusculos
        String s02 = original.toUpperCase(); //transforma em caracteres maiusculos
        String s03 = original.trim(); //elimina os espaços nos cantos da string
        String s04 = original.substring(2); //recebe um numero como parametro e faz uma nova string a partir da posição desse numero.
        String s05 = original.substring(2, 9); //recebe dois parametros para criar uma nova string pegando da posição do primeiro parametro até a posição do ultimo parametro
        String s06 = original.replace('a', 'x'); //troca todos os carateres iguais ao primeiro parametro para o do segundo parametro
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc"); //mostra a primeira ocorrencia da substring informada
        int j = original.lastIndexOf("bc");//mostra a ultima ocorrencia da substring informada
        
        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
    }
}