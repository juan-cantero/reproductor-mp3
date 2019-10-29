import io.github.juanqui1989.Cancion;
import io.github.juanqui1989.Mp3;
import io.github.juanqui1989.estadosMp3.Pausa;
import io.github.juanqui1989.estadosMp3.Reproduccion;
import io.github.juanqui1989.estadosMp3.Seleccion;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mp3ModoSeleccionTest {
  Mp3 mp3;
  Cancion cancion1;


  @BeforeTest
  public void setUp() {
    mp3 = new Mp3();
    cancion1 = new Cancion("my friend");
    mp3.cargarCancion(cancion1);



  }

  @Test
  public void reproducir() {
    String cancionEsperada = mp3.reproducir(0);
    Assert.assertEquals("reproduciendo my friend",cancionEsperada);
  }

  @Test
  public void pausar() {
    String pausa = mp3.pausar();
    Assert.assertEquals("todavia no se selecciono cancion a reproducir",pausa);
  }
}
