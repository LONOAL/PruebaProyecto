package com.proyecto.Npcs;

public class Damian extends NPCs{
    public static String metodo1Damian() {
        nombre="Damian Blood";
        profesion="Guerrero";
        int opcionnDialog = (int) (Math.random() * 3 + 1);
        switch (opcionnDialog) {
            case 1:
                dialogo=(" Te encuentras con un hombre adulto con una armadura. \n" +
                        " El hombre te dice: \n" +
                        " Hola, soy Damian Blood soy el encargado de patrullar la zona, en que puedo ayudarte?\n");

            case 2:
                dialogo=(" Observas ante ti un hombre. \n" +
                        " El hombre, con una voz bastante grave te comenta: \n" +
                        " Buenas viajero, soy Damian Blood, el encargado de defender la zona, necesitas algo?\n");

            case 3:
                dialogo=(" Un guerrero adulto aparece ante ti. \n" +
                        " El guerrero te cuenta :\n" +
                        " Buenas forastero, soy Damian Blood, el guerrero, no deberias andar por aquí, es peligroso, precisas algo?\n");


        }
        return dialogo;
    }
    public static void metodo2Damian() {
        int opcion1ButtonD = (int) (Math.random() * 2 + 1);
        switch (opcion1ButtonD) {
            case 1:
                // haces un duelo contra él, te hace 100 de daño pero ganas 4 puntos de experiencia.
                break;
            case 2:
               // te regala una de sus armas, un arma exclusiva.
        }
        int opcion2ButtonD = (int) (Math.random() * 2 + 1);
        switch (opcion2ButtonD) {
            case 1:
                //le das una gran runa y te da una reliquia exclusiva que te da golpe doble(puedes atacar dos veces por turno)
                break;
            case 2:
                //te da una reliquia aleatoria
                break;
        }
        int opcion3ButtonD = (int) (Math.random() * 2 + 1);
        switch (opcion3ButtonD) {
            case 1:
                //entrenas solo y ganas +2 a repartir en tus estadisticas y 1 de experiencia.
                break;
            case 2:
                //entrenas con él y ganas +4 a repartir en tus estadisticas.
                break;
        }

    }
}