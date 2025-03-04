package classe;

public class Dateste {
    public static void main(String[] args) {

        Dat data1 = new Dat();
        data1.dia = 17;
        data1.mes = "Março";
        data1.ano = 1995;

        Dat data2 = new Dat();
        data2.dia = 6;
        data2.mes = "Janeiro";
        data2.ano = 2024;

        System.out.printf("%d/%s/%d\n", data1.dia, data1.mes, data1.ano);
        System.out.printf("%d/%s/%d\n", data2.dia, data2.mes, data2.ano);



    }
}
