public class ResultadoEscolar2 {
    public static void main(String[] args) {
        //Exemplo de condicional encadeada
        int nota = 6;
        if(nota>=7)
            System.out.println("Aprovado");
        else if(nota>=5 && nota<7)
            System.out.println("Prova Recuperação");//Sempre retorna true or false
        else
            System.out.println("Reprovado");
    }
}
