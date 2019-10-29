package io.github.juanqui1989.estadosMp3;

import io.github.juanqui1989.Mp3;

public class Reproduccion implements Modo {
  private Mp3 mp3;

  public Reproduccion(Mp3 mp3) {
    this.mp3 = mp3;
  }


  public String reproducir(int numeroCancion) {
    return "reproduciendo " + mp3.getCancionEnReproduccion().getNombre();
  }

  public String pausar() {
     mp3.setModo(mp3.getPausa());
     return "cancion en pausa";
  }

  public void parar() {
    mp3.setModo(mp3.getSeleccion());
  }
}
