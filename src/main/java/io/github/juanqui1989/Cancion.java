package io.github.juanqui1989;

public class Cancion {
  private String nombre;

  public Cancion(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public String reproducir() {
    return "reproduciendo " + getNombre();
  }

  public String pausar() {
    return "cancion " + getNombre() + " en pausa";
  }



}
