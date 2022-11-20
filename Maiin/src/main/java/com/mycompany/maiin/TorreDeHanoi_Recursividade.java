/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maiin;

/**
 *
 * @author 55649
 */
public class TorreDeHanoi_Recursividade {
    //Variavel de contar movimentos dos discos
    static int contador =0;

    // Funcao que executa o calculo total da torre de hanoi
    static void hanoi(int numeroDiscos, int pinoInicial, int pinoFinal, int pinoAuxiliar) {
        if (numeroDiscos > 0) {

            hanoi(numeroDiscos - 1, pinoInicial, pinoAuxiliar, pinoFinal); //pino inicial para pino Auxiliar

            //System.out.println(pinoInicial + " -> " + pinoFinal); // Movimento do inicial para final
            contador+=1;                                          //contador de movimentos

            hanoi(numeroDiscos - 1, pinoAuxiliar, pinoFinal, pinoInicial); //pino Auxiliar para o pino Final

        }
    }
}
