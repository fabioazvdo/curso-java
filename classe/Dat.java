package classe;

public class Dat {

    int dia;
    String mes;
    int ano;

    Dat(){
        //dia = 1;
        //mes = "Janeiro";
        //ano = 1970;
        this(1, "Janeiro", 1970);
    }
    Dat(int dia, String mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada(){

        return String.format("%d/%s/%d\n", dia, mes, ano);
    }
}
