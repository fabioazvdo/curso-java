package classe;

public class Dateste {
    public static void main(String[] args) {

        Dat data1 = new Dat(6, "Janeiro", 2024);

        Dat data2 = new Dat();

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());





    }
}
