// Nome do projeto: Numeros Primos (Java)
// Linguagem: Java
// Utilizações: Listas, Variáveis e Repetições
// Autor: Rafael Lua - rafaellua13


import java.util.Scanner;   // Importar Input do usuário (Scanner)
import java.util.ArrayList; // Permitir operação com Listas


class Main {
  public static void main(String[] args) {
    int cont = 0;
    ArrayList divisores = new ArrayList();
    
    // Realizar input do usuário
    System.out.println("\n\n\nDigite o numero:");
    Scanner numero = new Scanner(System.in); // Abrir Scanner
    String calc = numero.nextLine();         // A proxima linha digitada sera considerada como Input inteiro

    int var = Integer.parseInt(calc);
      
    numero.close();                   // Fechar Scanner

    for(int x = 1; x <= var; x++){         
      
      float realVar = (float) var;   // Devido ao Java, é necessário transformar o numero em float para poder dividi-lo e obter um numero float

      float y = (realVar/x);         // Dividir para obter um resultado float


      int y2 = (int) y;              // Transformar em inteiro o resultado float (sim, vai haver propositalmente a perda do decimal)


      if (y == y2){ // Comparar o numero inteiro ao numero float.
        cont += 1;  // Se forem iguais, será considerado um divisor, e será adicionado na lista divisores
        divisores.add(x);

      }

    }

    if (cont <= 2){  // Se o numero de divisores for 2 ou menor (no caso, 1 e o proprio número), será considerado primo
      System.out.println("Primo!");

    }
    else{
      System.out.println("Não Primo! Possui " + cont + " divisores."); // Caso tenha mais divisores, sera considerado não primo
    }

     // Mostrar lista de divisores
     System.out.println("\nDivisores:");
     for(int a = 0; a < divisores.size(); a++){
       System.out.println(divisores.get(a));
     
     }  
  }
}


