package PartesArmadura;

import Entity.Armadura;

public class Guantes { // extends Armadura 
    
    protected int energia;

    public Guantes() {
        this.energia = 10;
    }

//    public Guantes(int energia, String colorPrimario, String colorSecundario, String nivelDeResistencia, int nivelDeSalud, int bateria) {
//        super(colorPrimario, colorSecundario, nivelDeResistencia, nivelDeSalud, bateria);
//        this.energia = energia;
//    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public String getNivelDeResistencia() {
        return nivelDeResistencia;
    }

    public void setNivelDeResistencia(String nivelDeResistencia) {
        this.nivelDeResistencia = nivelDeResistencia;
    }

    public int getNivelDeSalud() {
        return nivelDeSalud;
    }

    public void setNivelDeSalud(int nivelDeSalud) {
        this.nivelDeSalud = nivelDeSalud;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Guantes{" + "energia=" + energia + '}';
    }
    
    
    
}

//Las armaduras de Stark se encuentran definidas por un color primario y un color secundario. Se
//encuentran compuestas de dos propulsored, uno en cada bota; y dos repulsores, uno en cada
//guante (los repulsores se utilizan también como armas). Tony los utiliza en su conjunto para volar.

//Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal
//consumiendo el triple de la energía establecida para las botas y el doble para los guantes.

//Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.