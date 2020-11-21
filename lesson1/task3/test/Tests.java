import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Task task = new Task("name", "surname", 26, "I can");
    Assert.assertEquals("My name is name surname I am 26 years old "
            + "I learn Java because I can", task.toString());
  }
}