public class ResultadoEscolar3 {
    public static void main(String[] args) {
       //exemplo de operador ternário 
        int nota = 10;
        
        /*String resultado = nota>=7? "Aprovado" : "Reprovado";
        System.out.println(resultado);*/
        String resultado = nota>=7? "Aprovado" : nota >=5 && nota<7? "Prova de Recuperação" : "Reprovado";
        System.out.println(resultado); 

    }
}
