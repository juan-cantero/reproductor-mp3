package io.github.juanqui1989.estadosMp3;

import io.github.juanqui1989.Mp3;

public class Pausa implements Modo{
  private Mp3 mp3;

  public Pausa(Mp3 mp3) {
    this.mp3 = mp3;
  }


  public String reproducir(int numeroCancion) {
    return mp3.getCancionEnReproduccion().reproducir();
  }

  public String pausar() {
    return "ya esta en pausa";
  }

  public void parar() {
    mp3.setModo(mp3.getSeleccion());
  }
}
