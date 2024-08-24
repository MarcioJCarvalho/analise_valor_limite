
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

  @Test
  public void testCashbackAt100Bronze() {

    double cashback = SimuladorCashBack.calculaCashBack(100.00, "Bronze");
    assertEquals(5.0, cashback, 0.01);
  }

  @Test
  public void testCashbackJustBelow100Bronze() {
    double cashback = SimuladorCashBack.calculaCashBack(99.99, "Bronze");
    assertEquals(4.99, cashback, 0.01);
  }

  @Test
  public void testCashbackJustAbove100Bronze() {
    double cashback = SimuladorCashBack.calculaCashBack(100.01, "Bronze");
    assertEquals(10.00, cashback, 0.01);
  }

  @Test
  public void testCashbackAt100Prata() {
    double cashback = SimuladorCashBack.calculaCashBack(100, "Prata");
    assertEquals(10.0, cashback, 0.01);
  }

  @Test
  public void testCashbackJustBelow100Prata() {
    double cashback = SimuladorCashBack.calculaCashBack(99.99, "Prata");
    assertEquals(9.99, cashback, 0.01);
  }

  @Test
  public void testCashbackJustAbove100Prata() {
    double cashback = SimuladorCashBack.calculaCashBack(100.01, "Prata");
    assertEquals(15.0, cashback, 0.01);
  }

  @Test
  public void testCashbackAt100Ouro() {
    double cashback = SimuladorCashBack.calculaCashBack(100, "Ouro");
    assertEquals(15.0, cashback, 0.01);
  }

  @Test
  public void testCashbackJustBelow100Ouro() {
    double cashback = SimuladorCashBack.calculaCashBack(99.99, "Ouro");
    assertEquals(14.99, cashback, 0.01);
  }

  @Test
  public void testCashbackJustAbove100Ouro() {
    double cashback = SimuladorCashBack.calculaCashBack(100.01, "Ouro");
    assertEquals(20.0, cashback, 0.01);
  }

  @Test
  public void testCashbackAt500Bronze() {
    double cashback = SimuladorCashBack.calculaCashBack(500, "Bronze");
    assertEquals(50.0, cashback, 0.01);
  }

  @Test
  public void testCashbackJustBelow500Bronze() {
    double cashback = SimuladorCashBack.calculaCashBack(499.99, "Bronze");
    assertEquals(49.99, cashback, 0.01);
  }

  @Test
  public void testCashbackJustAbove500Bronze() {
    double cashback = SimuladorCashBack.calculaCashBack(500.01, "Bronze");
    assertEquals(75.0, cashback, 0.01);
  }

  @Test
  public void testCashbackAt500Prata() {
    double cashback = SimuladorCashBack.calculaCashBack(500, "Prata");
    assertEquals(75.0, cashback, 0.01);
  }

  @Test
  public void testCashbackJustBelow500Prata() {
    double cashback = SimuladorCashBack.calculaCashBack(499.99, "Prata");
    assertEquals(74.99, cashback, 0.01);
  }

  @Test
  public void testCashbackJustAbove500Prata() {
    double cashback = SimuladorCashBack.calculaCashBack(500.01, "Prata");
    assertEquals(100.0, cashback, 0.01);
  }

  @Test
  public void testCashbackAt500Ouro() {
    double cashback = SimuladorCashBack.calculaCashBack(500, "Ouro");
    assertEquals(100.0, cashback, 0.01);
  }

  @Test
  public void testCashbackJustBelow500Ouro() {
    double cashback = SimuladorCashBack.calculaCashBack(499.99, "Ouro");
    assertEquals(99.99, cashback, 0.01);
  }

  @Test
  public void testCashbackJustAbove500Ouro() {
    double cashback = SimuladorCashBack.calculaCashBack(500.01, "Ouro");
    assertEquals(125.0, cashback, 0.01);
  }
}
