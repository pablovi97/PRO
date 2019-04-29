package com.pablo.TresEnRaya;

import android.annotation.SuppressLint;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    pruebaCanvas canvas;
    TresenRaya tresenRaya;
    TextView txv;
    Button btn;
    MediaPlayer clip1;
    MediaPlayer clip2;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        canvas = (pruebaCanvas) findViewById(R.id.canvas);
        txv = (TextView) findViewById(R.id.txa);
        btn = (Button) findViewById(R.id.btn);
        tresenRaya = new TresenRaya();
        clip1 = MediaPlayer.create(this, R.raw.clip1);
        clip2 = MediaPlayer.create(this, R.raw.clip2);
        canvas.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                float posx = event.getX();
                float posy = event.getY();
                clip1.start();
                System.out.println("posx" + posx);
                System.out.println("posy" + posy);
                establecerCirculo(posx, posy);
                canvas.posX = posx;
                canvas.posY = posy;
                canvas.invalidate();
                return false;
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tresenRaya.reinciar();
                txv.setText("Tic-Tac-Toe");
                canvas.dibujarOen01 = false;
                canvas.dibujarOen00 = false;
                canvas.dibujarOen02 = false;
                canvas.dibujarXen00 = false;
                canvas.dibujarXen01 = false;
                canvas.dibujarXen02 = false;
                canvas.dibujarXen10 = false;
                canvas.dibujarXen11 = false;
                canvas.dibujarXen12 = false;
                canvas.dibujarOen10 = false;
                canvas.dibujarOen11 = false;
                canvas.dibujarOen12 = false;
                canvas.dibujarOen20 = false;
                canvas.dibujarOen21 = false;
                canvas.dibujarOen22 = false;
                canvas.dibujarXen21 = false;
                canvas.dibujarXen20 = false;
                canvas.dibujarXen22 = false;
                canvas.Bajada = false;
                canvas.VerticalIzquierda = false;
                canvas.VerticalDerecha = false;
                canvas.VerticalCentro = false;
                canvas.HorizontalSuperior = false;
                canvas.HorizontalMedio = false;
                canvas.HorizontalInferior = false;
                canvas.Subida = false;
                clip2.start();
                canvas.invalidate();
                tresenRaya.paso = 0;
            }
        });


    }


    public void establecerCirculo(float x, float y) {
        if (x > 700 && y > 700) {
            if (tresenRaya.introducirX(2, 2) == false) {


                System.out.println("_______________");
                tresenRaya.verMatriz();
                System.out.println("\n");
                canvas.dibujarOen22 = true;
                resultado();
                txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                if (!tresenRaya.enJuego) {
                    establecerX();
                    txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                    resultado();

                    System.out.println("X:" + tresenRaya.x + " y:" + tresenRaya.y);
                }

            } else {
                txv.setText("esa posicion esta ocupada");
            }

            System.out.println("X:" + tresenRaya.x + " y:" + tresenRaya.y);

        } else if (x > 700 && y < 190) {
            if (tresenRaya.introducirX(0, 2) == false) {


                System.out.println("_______________");
                tresenRaya.verMatriz();
                canvas.dibujarOen02 = true;
                System.out.println("\n");
                resultado();
                txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                if (!tresenRaya.enJuego) {
                    establecerX();
                    txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                    resultado();

                    System.out.println("X:" + tresenRaya.x + " y:" + tresenRaya.y);
                }
                System.out.println("X:" + tresenRaya.x + " y:" + tresenRaya.y);
            } else {
                txv.setText("esa posicion esta ocupada");
            }

        } else if (x < 198 && y < 198) {
            if (tresenRaya.introducirX(0, 0) == false) {


                System.out.println("_______________");
                tresenRaya.verMatriz();
                System.out.println("\n");

                canvas.dibujarOen00 = true;
                resultado();

                txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                if (!tresenRaya.enJuego) {
                    establecerX();
                    txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                    resultado();

                    System.out.println("X:" + tresenRaya.x + " y:" + tresenRaya.y);
                }

                System.out.println("X:" + tresenRaya.x + " y:" + tresenRaya.y);
            } else {
                txv.setText("esa posicion esta ocupada");
            }

        } else if (x < 200 && y > 700) {
            if (tresenRaya.introducirX(2, 0) == false) {


                System.out.println("_______________");
                tresenRaya.verMatriz();

                System.out.println("\n");
                canvas.dibujarOen20 = true;
                resultado();
                txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                if (!tresenRaya.enJuego) {
                    establecerX();
                    txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                    resultado();

                    System.out.println("X:" + tresenRaya.x + " y:" + tresenRaya.y);
                }
                System.out.println("X:" + tresenRaya.x + " y:" + tresenRaya.y);
            } else {
                txv.setText("esa posicion esta ocupada");
            }

        } else if (x > 380 && x < 550 && y > 700) {
            if (tresenRaya.introducirX(2, 1) == false) {


                System.out.println("_______________");
                tresenRaya.verMatriz();
                System.out.println("\n");
                canvas.dibujarOen21 = true;
                resultado();
                txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                if (!tresenRaya.enJuego) {
                    establecerX();
                    txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                    resultado();

                    System.out.println("X:" + tresenRaya.x + " y:" + tresenRaya.y);
                }
            } else {
                txv.setText("esa posicion esta ocupada");
            }
        } else if (x > 700 && y > 350 && y < 600) {
            if (tresenRaya.introducirX(1, 2) == false) {


                System.out.println("_______________");
                tresenRaya.verMatriz();
                canvas.dibujarOen12 = true;
                System.out.println("\n");
                resultado();
                txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                if (!tresenRaya.enJuego) {
                    establecerX();
                    txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                    resultado();

                    System.out.println("X:" + tresenRaya.x + " y:" + tresenRaya.y);

                }
            } else {
                txv.setText("esa posicion esta ocupada");
            }
        } else if (x < 700 && x > 300 && y < 350) {
            if (tresenRaya.introducirX(0, 1) == false) {


                System.out.println("_______________");
                tresenRaya.verMatriz();
                canvas.dibujarOen01 = true;
                System.out.println("\n");
                resultado();
                txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                if (!tresenRaya.enJuego) {
                    establecerX();
                    txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                    resultado();

                    System.out.println("X:" + tresenRaya.x + " y:" + tresenRaya.y);
                }
            } else {
                txv.setText("esa posicion esta ocupada");
            }
        } else if (y < 600 && y > 280 && x < 200) {
            if (tresenRaya.introducirX(1, 0) == false) {


                System.out.println("_______________");
                tresenRaya.verMatriz();
                canvas.dibujarOen10 = true;
                System.out.println("\n");
                resultado();
                txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                if (!tresenRaya.enJuego) {
                    establecerX();
                    txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                    resultado();

                    System.out.println("X:" + tresenRaya.x + " y:" + tresenRaya.y);

                }
            } else {
                txv.setText("esa posicion esta ocupada");
            }


        } else if (x > 200 && x < 700 && y > 300 && y < 600) {
            if (tresenRaya.introducirX(1, 1) == false) {


                System.out.println("_______________");
                tresenRaya.verMatriz();
                canvas.dibujarOen11 = true;
                System.out.println("\n");
                resultado();
                txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                if (!tresenRaya.enJuego) {
                    establecerX();
                    txv.setText(tresenRaya.result() + "\n" + tresenRaya.juego());
                    resultado();
                }


                System.out.println("X:" + tresenRaya.x + " y:" + tresenRaya.y);

            } else {
                txv.setText("esa posicion esta ocupada");

            }
        }

    }

    public void resultado() {
        tresenRaya.result();


        if (tresenRaya.stats == estadosGanar.Bajada) {
            canvas.Bajada = true;
        } else if (tresenRaya.stats == estadosGanar.Subida) {
            canvas.Subida = true;
        } else if (tresenRaya.stats == estadosGanar.HorizontalInferior) {
            canvas.HorizontalInferior = true;
        } else if (tresenRaya.stats == estadosGanar.HorizontalMedio) {
            canvas.HorizontalMedio = true;
        } else if (tresenRaya.stats == estadosGanar.HorizontalSuperior) {
            canvas.HorizontalSuperior = true;
        } else if (tresenRaya.stats == estadosGanar.VerticalCentro) {
            canvas.VerticalCentro = true;
        } else if (tresenRaya.stats == estadosGanar.VerticalDerecha) {
            canvas.VerticalDerecha = true;
        } else if (tresenRaya.stats == estadosGanar.VerticalIzquierda) {
            canvas.VerticalIzquierda = true;
        }
    }

    public void establecerX() {
        if (tresenRaya.paso < 9) {
            resultado();
            tresenRaya.turnoMaquina();
            if (tresenRaya.x == 1 && tresenRaya.y == 1) {
                canvas.dibujarXen11 = true;
            } else if (tresenRaya.x == 1 && tresenRaya.y == 0) {
                canvas.dibujarXen10 = true;
            } else if (tresenRaya.x == 0 && tresenRaya.y == 0) {
                canvas.dibujarXen00 = true;
            } else if (tresenRaya.x == 1 && tresenRaya.y == 2) {
                canvas.dibujarXen12 = true;
            } else if (tresenRaya.x == 0 && tresenRaya.y == 1) {
                canvas.dibujarXen01 = true;
            } else if (tresenRaya.x == 0 && tresenRaya.y == 2) {
                canvas.dibujarXen02 = true;
            } else if (tresenRaya.x == 2 && tresenRaya.y == 0) {
                canvas.dibujarXen20 = true;
            } else if (tresenRaya.x == 2 && tresenRaya.y == 1) {
                canvas.dibujarXen21 = true;
            } else if (tresenRaya.x == 2 && tresenRaya.y == 2) {
                canvas.dibujarXen22 = true;
            }
        }else{
          
            tresenRaya.enJuego=true;

        }
    }


}
