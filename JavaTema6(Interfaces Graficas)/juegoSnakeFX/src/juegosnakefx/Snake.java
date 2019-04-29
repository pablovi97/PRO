/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosnakefx;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Snake {

    //Punto cabeza;
    static ArrayList<Snake> cuerpo = new ArrayList<>();

    // Snake[] body = new Snake[10];
    Punto puntosMov;
    Punto movAnterior;

    public Snake(Punto p) {
        //cuerpo = new ArrayList<>();
        puntosMov = p;
    }
    int vertebra = 0;

    public Snake(Punto p, int vert) {
        puntosMov = p;
        this.vertebra = vert;
    }

    public void agrandarSnake(int num) {
        int cont = num;
        // cuerpo.add(bod);
        for (int j = 0; j < 3; j++) {
            Punto puntoNuevo = new Punto(-100 * j, -100 + j);
            cuerpo.add(new Snake(puntoNuevo, cont + 1));
            cont++;
        }
        

        System.out.println("agrandar SNAKE!");

    }

    public void moverSnake(Punto pos) {
        /*  
        if (cuerpo.size() > 0) {
            cuerpo.remove(cuerpo.size() - 1);
            cuerpo.add(new Punto(cabeza.x, cabeza.y));
int i=1;
            cuerpo.stream().filter(p -> p instanceof Punto).map(p -> (Punto) p).forEach(p -> {
     
                if (p.x < 0) {
                    p.x = cabeza.x-10;
                    p.y = cabeza.y-10;
                }

            });
        }
   
        for (Punto punto : cuerpo) {

             punto.x = cabeza.x;
            punto.y = cabeza.y;
        }
      
         */
        movAnterior = puntosMov;
        puntosMov = pos;

        if (vertebra + 1 < this.cuerpo.size()) {
            this.cuerpo.get(vertebra + 1).moverSnake(movAnterior);
        }
    }

    /*
      ArrayList<Punto> vertebras = new ArrayList<>();
    Punto anterior;
    
    public Snake(){
        
    }

    
    

    public void agrandarSnake(Punto pos) {
        
        if(vertebras.isEmpty()){
           anterior = pos;
        }else{
            vertebras.add(pos);
        }
        
    }
  

    public void mover() {
  
            for (int i = 1; i < vertebras.size(); i++) {

                anterior.copiarPosicion(vertebras.get(i));

                anterior = vertebras.get(i);

            }
        

    }
     */
}
