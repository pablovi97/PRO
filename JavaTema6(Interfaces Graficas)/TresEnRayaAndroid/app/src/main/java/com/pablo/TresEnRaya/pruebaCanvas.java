package com.pablo.TresEnRaya;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;


public class pruebaCanvas extends View {

    public pruebaCanvas(Context context) {
        super(context);
        init();
    }

    public pruebaCanvas(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    Paint pincelGris;
    Paint pincelAmarillo;
    Paint pincelNegro;
    Paint pincelAzul;
    Paint pincelRojo;

    float posX = -1;
    float posY = -1;
    boolean dibujarXen00;

    boolean dibujarOen00;

    boolean dibujarXen01;

    boolean dibujarOen01;

    boolean dibujarXen02;

    boolean dibujarOen02;

    boolean dibujarXen10;
    boolean dibujarXen11;
    boolean dibujarXen12;
    boolean dibujarXen20;
    boolean dibujarXen21;
    boolean dibujarXen22;

    boolean dibujarOen10;
    boolean dibujarOen11;
    boolean dibujarOen12;
    boolean dibujarOen20;
    boolean dibujarOen21;
    boolean dibujarOen22;


    boolean Bajada;

    boolean Subida;

    boolean HorizontalInferior;

    boolean HorizontalMedio;

    boolean HorizontalSuperior;

    boolean VerticalCentro;

    boolean VerticalDerecha;

    boolean VerticalIzquierda;


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        int ancho = canvas.getWidth();
        int largo = canvas.getHeight();
        canvas.drawRect(0, 0, ancho, largo, pincelGris);
        canvas.drawLine(0, 300, ancho, 300, pincelNegro);
        canvas.drawLine(0, 600, ancho, 600, pincelNegro);
        canvas.drawLine(300, 0, 300, largo, pincelNegro);
        canvas.drawLine(600, 0, 600, largo, pincelNegro);



        if(Bajada){
            canvas.drawLine(50, 50, 780, 780, pincelRojo);
        }
        if(Subida){
            canvas.drawLine(50, 800, 780, 150, pincelRojo);
        }

        if(HorizontalInferior){
            canvas.drawLine(50, 740, 850, 740, pincelRojo);
        }
        if(HorizontalSuperior){
            canvas.drawLine(50, 150, 850, 150, pincelRojo);
        }
        if(HorizontalMedio){
            canvas.drawLine(50, 450, 850, 450, pincelRojo);
        }

        if(VerticalIzquierda){
            canvas.drawLine(150, 50, 150, 800, pincelRojo);
        }
        if(VerticalCentro){
            canvas.drawLine(450, 50, 450, 800, pincelRojo);
        }
        if(VerticalDerecha){
            canvas.drawLine(750, 50, 750, 800, pincelRojo);
        }

        if (dibujarXen00) {
            canvas.drawLine(50, 50, 180, 180, pincelAzul);
            canvas.drawLine(50, 180, 180, 50, pincelAzul);

        }
        if (dibujarOen00) {

            canvas.drawCircle(150, 150, 100, pincelAmarillo);
        }


        if (dibujarXen01) {

            canvas.drawLine(400, 50, 500, 180, pincelAzul);
            canvas.drawLine(400, 180, 500, 50, pincelAzul);

        }

        if (dibujarOen01) {

            canvas.drawCircle(450, 150, 100, pincelAmarillo);

        }

        if (dibujarXen02) {
            canvas.drawLine(650, 50, 780, 180, pincelAzul);
            canvas.drawLine(650, 180, 780, 50, pincelAzul);
        }


        if (dibujarXen10) {
            canvas.drawLine(50, 350, 180, 480, pincelAzul);
            canvas.drawLine(50, 480, 180, 350, pincelAzul);
        }
        if (dibujarXen11) {
            canvas.drawLine(400, 350, 500, 480, pincelAzul);
            canvas.drawLine(400, 480, 500, 350, pincelAzul);
        }
        if (dibujarXen12) {
            canvas.drawLine(650, 350, 780, 480, pincelAzul);
            canvas.drawLine(650, 480, 780, 350, pincelAzul);
        }


        if (dibujarXen20) {
            canvas.drawLine(50, 700, 180, 800, pincelAzul);
            canvas.drawLine(50, 800, 180, 700, pincelAzul);
        }
        if (dibujarXen21) {
            canvas.drawLine(400, 700, 500, 800, pincelAzul);
            canvas.drawLine(400, 800, 500, 700, pincelAzul);
        }
        if (dibujarXen22) {
            canvas.drawLine(650, 700, 780, 800, pincelAzul);
            canvas.drawLine(650, 800, 780, 700, pincelAzul);
        }


        if (dibujarOen02) {
            canvas.drawCircle(750, 150, 100, pincelAmarillo);

        }
        if (dibujarOen10) {
            canvas.drawCircle(150, 450, 100, pincelAmarillo);

        }
        if (dibujarOen11) {
            canvas.drawCircle(450, 450, 100, pincelAmarillo);
        }
        if (dibujarOen12) {
            canvas.drawCircle(750, 450, 100, pincelAmarillo);

        }
        if (dibujarOen20) {
            canvas.drawCircle(150, 750, 100, pincelAmarillo);
        }
        if (dibujarOen21) {
            canvas.drawCircle(450, 750, 100, pincelAmarillo);
        }
        if (dibujarOen22) {
            canvas.drawCircle(750, 750, 100, pincelAmarillo);
        }


    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public pruebaCanvas(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }


    public void init() {


        pincelGris = new Paint();
        pincelGris.setColor(Color.GRAY);
        pincelGris.setStrokeWidth(15);

        pincelAmarillo = new Paint();
        pincelAmarillo.setColor(Color.YELLOW);
        pincelAmarillo.setStrokeWidth(10);
        pincelAmarillo.setStyle(Paint.Style.STROKE);

        pincelNegro = new Paint();
        pincelNegro.setColor(Color.BLACK);
        pincelNegro.setStrokeWidth(15);
        pincelNegro.setStyle(Paint.Style.STROKE);

        pincelAzul = new Paint();

        pincelAzul.setColor(Color.BLUE);
        pincelAzul.setStrokeWidth(15);
        pincelAzul.setStyle(Paint.Style.STROKE);

        pincelRojo = new Paint();

        pincelRojo.setColor(Color.RED);
        pincelRojo.setStrokeWidth(15);
        pincelRojo.setStyle(Paint.Style.STROKE);



    }
}
