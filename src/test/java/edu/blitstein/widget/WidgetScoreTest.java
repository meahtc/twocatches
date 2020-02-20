package edu.blitstein.widget;

import edu.blitstein.exception.DivideByZeroException;
import edu.blitstein.exception.NegativeNumberException;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class WidgetScoreTest {
    WidgetScore widgetScore;

    @Before
    public void setUp() throws Exception {
        widgetScore = new WidgetScore();
    }

    @Test
    public void testInputWidgetsNormal() throws NegativeNumberException {
        widgetScore.inputWidgets(3);
        assertEquals(3, widgetScore.getWidgets());
    }

    @Test(expected = NegativeNumberException.class)
    public void testInputWidgetsNegative() throws NegativeNumberException {
        widgetScore.inputWidgets(-1);
    }

    @Test
    public void testInputDefective() throws NegativeNumberException {
        widgetScore.inputDefective(7);
        assertEquals(7, widgetScore.getDefective());
    }

    @Test(expected = NegativeNumberException.class)
    public void testInputDefectiveNegative() throws NegativeNumberException {
        widgetScore.inputDefective(-1);
    }

    @Test
    public void testRatioHappy() throws DivideByZeroException {
        widgetScore.setWidgets(6);
        widgetScore.setDefective(3);
        assertEquals(2.0, widgetScore.ratio(), 0.001);
    }

    @Test(expected = DivideByZeroException.class)
    public void testRatioSad() throws DivideByZeroException {
        widgetScore.setWidgets(6);
        widgetScore.setDefective(0);
        widgetScore.ratio();
    }
}