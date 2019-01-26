/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pablo
 */
public class Practica10 {
    /*
    Práctica 10: Obtener una expresión regular que de coincidencia ( mediante find() ) de las
cadenas ( y no de las otras) a), b), c), d), h), i)
a)abcc**
b)aBbcaR**
c)abbbcPrr*
d)abbbbcCC**
e)aabbbbcCC
f)aBbrc
g)aabcc
h)abBbc*
i)abbBBc*
    */
    
   
            public static void main(String[] args) {
                 Pattern p = Pattern.compile("^a[B,b]{1,4}[c,C]{1,3}[a]?([P]|[r,R]){0,3}");
    Matcher m = p.matcher("abcc ");
  Matcher g = p.matcher("aBbcaR ");
  Matcher j = p.matcher("abbbcPrr  ");
  Matcher l = p.matcher(" abbbbcCC");
  Matcher k = p.matcher(" aabbbbcCC ");
  Matcher t = p.matcher(" aBbrc ");
  Matcher q = p.matcher("aabcc  ");
  Matcher a = p.matcher("abBbc");
  Matcher s = p.matcher("abbBBc");
    
           
            System.out.println("a)abcc :" + m.find());
            System.out.println("b)aBbcaR :" + g.find());
            System.out.println("c)abbbcPrr :" + j.find());
            System.out.println("d)abbbbcCC :" + l.find());
            System.out.println("e)aabbbbcCC :" + k.find());
            System.out.println("f)aBbrc :" + t.find());
            System.out.println("g)aabcc :" + q.find());
            System.out.println("h)abBbc :" + a.find());
            System.out.println("i)abbBBc :" + s.find());
          
        
        
    }
    
}
