package io.github.juanqui1989.estadosMp3;


import io.github.juanqui1989.Mp3;

public class Seleccion implements  Modo{

  private Mp3 mp3;

  public Seleccion(Mp3 mp3) {
    this.mp3 = mp3;
  }

  public String reproducir(int numeroCancion) {
    mp3.seleccionarCancion(numeroCancion);
    mp3.setModo(mp3.getReproduccion());
    return mp3.getCancionEnReproduccion().reproducir();
  }

  public String pausar() {

    return "todavia no se selecciono cancion a reproducir";
  }

  public void parar() {

  }
}
