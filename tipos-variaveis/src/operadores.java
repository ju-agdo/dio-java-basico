public class operadores {
  public static void main (String [] args ) {
    String nomeCompleto = "Juliana" + "Barroso" ;

    System.out.println(nomeCompleto);

    int numero = 5;

    System.out.println(numero) ;

    numero = - numero ;

    System.out.println(numero) ;
    
    numero = numero * -1 ;  

    System.out.println(numero) ;

    //Operadores de condição ternário

    int a, b;
    a = 5 ;
    b = 6 ;

      String resultado = a==b ? "verdadeiro" : "falso";

      System.err.println(resultado);

      //essa é uma expressão booleana, no lugar do verdadeiro ou falso pode colocar também 1 ou 0

      //Operadores relacionais

      int numeroUm = 1;
      int numeroDois = 2;

      boolean simNao = numeroUm == numeroDois;

      System.out.println("numeroUm é igual ao numeroDois ?" + simNao);

      boolean diferenteSimNao = numeroUm != numeroDois;

      System.out.println("numeroUm é diferente ao numeroDois ?" + diferenteSimNao);

  }
}
