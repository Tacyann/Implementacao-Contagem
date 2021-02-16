package exercicio1.src;

import java.util.Arrays;
import java.util.Scanner;

public class exercicioI {
 
    public static void main(String[] args) {
        System.out.println("Vetores");
        int numero = 0, cont, i;
        int indice = 0;
        int vet1[] = {0, 0, 0, 0, 0, 0};
        int vet2[] = {0, 0, 0, 0, 0, 0};
        int vet3[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


 //Gerar 6 numeros aleatorios
//DEVEM ESTAR ENTRE 1 E 60 ALEATORIOS
//Vamos sortear 6 números de 0 até 60 sem repetição
// NÃO PODE HAVER NUMEROS REPETIDOS
for(cont = 0; cont < 6; cont ++ ) {
    numero = (int)(1 + Math.random() * 60);
    vet1[cont] = numero;
    if (vet1[cont] == numero) {
        for(i = 0; i< 6; i ++) {
            
            numero = (int)(1 + Math.random() * 60);
            vet1[cont] = numero;
            
                
        }	
        
    }else {
        break;
    }
    
}
    
System.out.println("\nPrimeiro Vetor: ");
        
for (int dezena : vet1) {
    
    System.out.printf(" %d ", dezena);

}

// EXIBIR EM ORDEM CRESCENTE
Arrays.sort(vet1);
System.out.println("\nExibição Ordenada do Primeiro Vetor : ");
for(int dezena : vet1) {
    System.out.printf(" %d ", dezena);
}

//Segundo Vetor
for(cont = 0; cont < 6; cont ++ ) {
    numero = (int)(1 + Math.random() * 60);
    vet2[cont] = numero;
    if (vet2[cont] == numero) {
        for(i = 0; i< 6; i ++) {
            
            numero = (int)(1 + Math.random() * 60);
            vet2[cont] = numero;
                           
        }	
        
    }else {
        break;
    }
    
}
System.out.println("\nSegundo Vetor: ");
        
for (int dezena : vet2) {
    
    System.out.printf(" %d ", dezena);

}

// EXIBIR EM ORDEM CRESCENTE
Arrays.sort(vet2);
System.out.println("\nExibição Ordenada do Segundo Vetor : ");
for(int dezena : vet2) {
    System.out.printf(" %d ", dezena);
}

//Terceiro Vetor
vet3 = new int[vet1.length + vet2.length];

//fazendo o preechimento
for (i = 0; i < vet1.length; i++)
{
    vet3[indice] = vet1[i];
    indice++;
}

for ( i = 0; i < vet2.length; i++)
{
    vet3[indice] = vet2[i];
    indice++;
}


 //exibe o terceiro vetor preenchido com os dois anteriores
 System.out.print("\nTerceiro Vetor: ");
 for ( i = 0; i < vet3.length; i++){
Arrays.sort(vet3);
 System.out.print(vet3[i]+", ");
 }
    }
}