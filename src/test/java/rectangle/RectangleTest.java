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

    @Test
    public void testPiremeterOfRectangle() {
        Rectangle rectangle = new Rectangle(9, 8);
        double expected = 34;

        double actual = rectangle.getPerimeter();
        assertEquals(expected, actual);
    }

    @Test
    public void testAnotherSize() {
        Rectangle rectangle = new Rectangle(4, 40);
        double expectedArea = 160;
        double expectedPiremeter = 88;
        String expectedDisplay = "Rectangle{width = 4.0, height = 40.0}";

        double actualArea = rectangle.getArea();
        double actualPiremeter = rectangle.getPerimeter();
        String actualDisplay = rectangle.display();

        assertEquals(expectedArea, actualArea);
        assertEquals(expectedPiremeter, actualPiremeter);
        assertEquals(expectedDisplay, actualDisplay);
    }
}