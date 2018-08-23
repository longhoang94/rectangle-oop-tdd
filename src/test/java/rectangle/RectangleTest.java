package rectangle;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {
    @Test
    public void testAreaOfRectangle() {
        Rectangle rectangle = new Rectangle(3, 4);
        double expected = 12;

        double actual = rectangle.getArea();
        assertEquals(expected, actual);
    }

    @Test
    public void testDisplayOfRectangle() {
        Rectangle rectangle = new Rectangle(5, 6);
        String expected = "Rectangle{width = 5.0, height = 6.0}";
        String actual = rectangle.display();

        assertEquals(expected, actual);
    }
}