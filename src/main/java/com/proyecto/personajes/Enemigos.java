package com.proyecto.personajes;

public class Enemigos extends Personajes{
    public String nombre;

    public Enemigos(float vida, float ataque, float velAtaque, float mana, float nivel, String nombre) {
        super(vida, ataque, velAtaque, mana, nivel);
        this.nombre = nombre;
    }

    public Enemigos() {

    }

    public void enemigoBasico(int num){
        switch (num){
            case 1:
                nombre= "Soldado de Godrick";
                setAtaque(30);
                setVida(1000);
                setMana(300);
                setNivel(1);
                setVelAtaque(3);
                break;
            default:

        }
    }

    @Override
    public String toString() {
        return
        " Nombre: " + nombre +"\n"+
        " Vida: " + getVida()+"\n"+
        " Ataque: " + getAtaque()+"\n"+
        " Velocidad de ataque: " + getVelAtaque()+"\n"+
        " Nivel: " + getNivel()
        ;
    }
}
