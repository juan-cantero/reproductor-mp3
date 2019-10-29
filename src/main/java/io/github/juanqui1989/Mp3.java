package io.github.juanqui1989;

import io.github.juanqui1989.estadosMp3.Modo;
import io.github.juanqui1989.estadosMp3.Pausa;
import io.github.juanqui1989.estadosMp3.Reproduccion;
import io.github.juanqui1989.estadosMp3.Seleccion;

import java.util.ArrayList;
import java.util.List;

public class Mp3 {
  private List<Cancion> canciones;
  private Cancion cancionEnReproduccion;
  private Seleccion seleccion;
  private Pausa pausa;
  private Reproduccion reproduccion;
  private Modo modo;

  public Mp3() {
    canciones = new ArrayList<Cancion>();
    seleccion = new Seleccion(this);
    pausa = new Pausa(this);
    reproduccion = new Reproduccion(this);
    modo = seleccion;
  }

  public void cargarCancion(Cancion cancion) {
    canciones.add(cancion);
  }

  public void seleccionarCancion(int numero) {
    cancionEnReproduccion =  canciones.get(numero);
  }

  public Cancion getCancionEnReproduccion() {
    return cancionEnReproduccion;
  }

  public void setModo(Modo modo) {
    this.modo = modo;
  }

  public Seleccion getSeleccion() {
    return seleccion;
  }

  public Pausa getPausa() {
    return pausa;
  }

  public Reproduccion getReproduccion() {
    return reproduccion;
  }

  public Modo getModo() {
    return modo;
  }

  public String reproducir(int numeroCancion) {
    return modo.reproducir(numeroCancion);
  };

  public String pausar() {
    return modo.pausar();
  };

  public void parar() {
    modo.parar();
  };

}
