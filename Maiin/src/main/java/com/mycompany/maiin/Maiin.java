/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maiin;
import static com.mycompany.maiin.TorreDeHanoi_Recursividade.contador;
import static com.mycompany.maiin.TorreDeHanoi_Recursividade.hanoi;
import java.util.Scanner;
/**
 *
 * @author 55649
 */
public class Maiin {

    public static void main(String[] args) {
        int numeroDiscos;
        double tempoInicial;

        // Entrada para numero de discos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de discos: ");
        numeroDiscos = entrada.nextInt();

        // executa a funcao da torre de hanoi juntamente com o calculo do tempo decorrido da mesma
        tempoInicial = System.currentTimeMillis();
        hanoi(numeroDiscos, 1, 3, 2);

        // Saida do tempo gasto e da quantidade de movimentos da torre de hanoi
        System.out.println("Tempo gasto: " + (System.currentTimeMillis()-tempoInicial)/1000 + " segundos!");
        System.out.println("Total de " +contador+ " movimentos!");
    }
}
