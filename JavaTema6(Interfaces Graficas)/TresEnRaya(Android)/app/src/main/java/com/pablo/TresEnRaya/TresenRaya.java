/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablo.TresEnRaya;

import java.util.Random;

/**
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
enum estadosGanar {
    HorizontalSuperior,
    HorizontalMedio,
    HorizontalInferior,
    VerticalIzquierda,
    VerticalCentro,
    VerticalDerecha,
    Bajada,
    Subida,
    zero,
}

public class TresenRaya {

    private int[][] matriz = {{-3, -3, -3}, {-3, -3, -3}, {-3, -3, -3}};

    private final int jugador = 1;
    private final int maquina = 0;
    estadosGanar stats;
    boolean enJuego = false;
    int x;
    int y;

    public boolean introducirX(int x, int y) {
        paso++;
        boolean res = false;
        if (matriz[x][y] == -3) {
            matriz[x][y] = 1;
        } else if (matriz[x][y] == 1) {
            res = true;
        } else if (matriz[x][y] == 0) {
            res = true;
            System.out.println("la maquina ha introducido en esa posicion");
        }
        return res;
    }
int paso;
    public void turnoMaquina() {
paso++;
        Random rnd = new Random();
        x = rnd.nextInt(3) - 0;
        y = rnd.nextInt(3) - 0;


        if (matriz[x][y] == 0) {
            boolean pivot = false;
            do {
                x = rnd.nextInt(3) - 0;
                y = rnd.nextInt(3) - 0;
                if (matriz[x][y] == -3) {
                    matriz[x][y] = 0;
                    pivot = true;
                }

            } while (!pivot);

        } else if (matriz[x][y] == 1) {
            do {
                x = rnd.nextInt(2) - 0;
                y = rnd.nextInt(2) - 0;
                if (matriz[x][y] == 0) {
                    boolean pivot = false;
                    do {
                        x = rnd.nextInt(3) - 0;
                        y = rnd.nextInt(3) - 0;
                        if (matriz[x][y] == -3) {
                            matriz[x][y] = 0;
                            pivot = true;
                        }

                    } while (!pivot);
                } else if (matriz[x][y] == -3) {
                    matriz[x][y] = 0;
                }

            } while (matriz[x][y] == 1);

        } else if (matriz[x][y] == -3) {
            matriz[x][y] = 0;
        }


    }

    public String juego() {
        String texto = "";
        if (enJuego == false) {
            texto = "en juego...!";
        } else {
            texto = "Partida finalizada!";
        }
        return texto;
    }

    public void verMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            int[] is = matriz[i];
            for (int j = 0; j < is.length; j++) {
                System.out.print(is[j]);

            }
            System.out.println("\n");
        }

    }

    public void reinciar() {
        for (int i = 0; i < matriz.length; i++) {
            int[] is = matriz[i];
            for (int j = 0; j < is.length; j++) {
                is[j] = -3;

            }
        }
        enJuego = false;
        stats = estadosGanar.zero;
    }

    public String result() {
        String res = "";
        if (matriz[0][0] + matriz[0][1] + matriz[0][2] == 3 || matriz[0][0] + matriz[0][1] + matriz[0][2] == 0) {

            if (matriz[0][0] + matriz[0][1] + matriz[0][2] == 3) {

                res = "has ganado en horizontal superior";
            } else {

                res = "la maquina ha ganado en horizontal superior";
            }
            stats = estadosGanar.HorizontalSuperior;

            enJuego = true;


        } else if (matriz[0][0] + matriz[1][0] + matriz[2][0] == 3 || matriz[0][0] + matriz[1][0] + matriz[2][0] == 0) {

            if (matriz[0][0] + matriz[1][0] + matriz[2][0] == 3) {

                res = "has ganado en vertical izquierda";
            } else {

                res = "la maquina ha ganado en vertical izquierda";
            }
            stats = estadosGanar.VerticalIzquierda;
            enJuego = true;

        } else if (matriz[0][1] + matriz[1][1] + matriz[2][1] == 3 || matriz[0][1] + matriz[1][1] + matriz[2][1] == 0) {

            if (matriz[0][1] + matriz[1][1] + matriz[2][1] == 3) {

                res = "has ganado en vertical centro";
            } else {

                res = "la maquina ha ganado en vertical centro";
            }
            stats = estadosGanar.VerticalCentro;
            enJuego = true;


        } else if (matriz[0][2] + matriz[1][2] + matriz[2][2] == 3 || matriz[0][2] + matriz[1][2] + matriz[2][2] == 0) {

            if (matriz[0][2] + matriz[1][2] + matriz[2][2] == 3) {

                res = "has ganado en vertical derecha";
            } else {

                res = "la maquina ha ganado en vertical derecha";
            }
            stats = estadosGanar.VerticalDerecha;
            enJuego = true;

        } else if (matriz[1][0] + matriz[1][1] + matriz[1][2] == 3 || matriz[1][0] + matriz[1][1] + matriz[1][2] == 0) {

            if (matriz[1][0] + matriz[1][1] + matriz[1][2] == 3) {

                res = "has ganado en horizontal medio";
            } else {

                res = "la maquina ha ganado en horizontal medio";
            }
            stats = estadosGanar.HorizontalMedio;
            enJuego = true;

        } else if (matriz[2][0] + matriz[2][1] + matriz[2][2] == 3 || matriz[2][0] + matriz[2][1] + matriz[2][2] == 0) {

            if (matriz[2][0] + matriz[2][1] + matriz[2][2] == 3) {

                res = " has ganado en horizontal inferior";
            } else {

                res = " la maquina ha ganado en horizontal inferior";
            }
            stats = estadosGanar.HorizontalInferior;
            enJuego = true;

        } else if (matriz[0][0] + matriz[1][1] + matriz[2][2] == 3 || matriz[0][0] + matriz[1][1] + matriz[2][2] == 0) {

            if (matriz[0][0] + matriz[1][1] + matriz[2][2] == 3) {

                res = "has ganado en bajada";
            } else {

                res = "la maquina ha ganado en bajada";
            }
            stats = estadosGanar.Bajada;
            enJuego = true;


        } else if (matriz[0][2] + matriz[1][1] + matriz[2][0] == 3 || matriz[0][2] + matriz[1][1] + matriz[2][0] == 0) {


            if (matriz[0][2] + matriz[1][1] + matriz[2][0] == 3) {

                res = "has ganado en subida";
            } else {

                res = "la maquina ha ganado en subida";
            }
            stats = estadosGanar.Subida;
            res = "ha ganado en subida";
            enJuego = true;


        }
        return res;

    }
}

