package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio {
    
      // http://localhost:8080/
      @GetMapping("/")
      public String greet() {
          return "Proyecto Springboot de Álvaro y Yago";
      }


      //http.//localhost/adjetivos/{xxxx}
      @GetMapping("/adjetivos/{nombre}")
      public String count(@PathVariable String nombre){

        String n = nombre;
        char sel;
		 n = n.toLowerCase();
         ArrayList<String> letras = new ArrayList<String>();
         char[]arr = n.toCharArray();
	        for(int i = 0; i < arr.length; i++) {
               sel = arr[i];

                switch (sel) {
                    case 'a':
                        letras.add("A: Afable");
                        break;
                    case 'b':
                        letras.add("B: Buen@");
                    case 'c':
                        letras.add("C: Cuidados@");
                    case 'd':
                        letras.add("D: Delicad@");
                    case 'e':
                        letras.add( "E: Espectacular");
                        break;
                    case 'f':
                        letras.add("F: Formidable");
                        break;
                    case 'g':
                        letras.add("G: Guap@");
                        break;
                    case 'h':
                        letras.add("H: Hábil");
                        break;
                    case 'i':
                        letras.add("I: Inteligente");
                        break;
                    case 'j':
                        letras.add("J: Juguetón/a");
                        break;
                    case 'k':
                        letras.add("K: Kafkiano");
                        break;
                    case 'l':
                        letras.add("L: Ligón/a");
                        break;
                    case 'm':
                        letras.add("M: Maños@");
                        break;
                    case 'n':
                        letras.add("N: Notable");
                        break;
                    case 'o':
                        letras.add("O: Orgullos@");
                        break;
                    case 'p':
                        letras.add("P: Poderos@");
                        break;
                    case 'q':
                        letras.add("Q: Querid@");
                        break;
                    case 'r':
                        letras.add("R: Respetad@");
                        break;
                    case 's':
                        letras.add("S: Sosegad@");
                        break;
                    case 't':
                        letras.add("T: Tranquil@");
                        break;
                    case 'u':
                        letras.add("U: Únic@");
                        break;
                    case 'v':
                        letras.add("V: Valiente");
                        break;
                    case 'w':
                        letras.add("W: Why are you so cute?");
                        break;
                    case 'x':
                        letras.add("X: Xenial");
                        break;
                    case 'y':
                        letras.add("Y: You <3");
                        break;
                    case 'z':
                        letras.add("Z: Zalamer@");
                        break;
                    default:
                        break;
                }
                
	        }
            return letras.toString();
      }
    }
