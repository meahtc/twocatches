package edu.blitstein.widget;

import edu.blitstein.exception.DivideByZeroException;
import edu.blitstein.exception.NegativeNumberException;

public class WidgetScore {
    private int widgets;
    private int defective;

    public int getWidgets() {
        return widgets;
    }

    public void setWidgets(int widgets) {
        this.widgets = widgets;
    }

    public int getDefective() {
        return defective;
    }

    public void setDefective(int defective) {
        this.defective = defective;
    }

    public void inputWidgets(int widgets)
            throws NegativeNumberException {
        if (widgets < 0) {
            throw new NegativeNumberException("widgets");
        }
        this.widgets = widgets;
    }

    public void inputDefective(int defective)
            throws NegativeNumberException {
        if (defective < 0) {
            throw new NegativeNumberException("defective widgets");
        }
        this.defective = defective;
    }

    public double ratio()
            throws DivideByZeroException {
        if (getDefective() == 0) {
            throw new DivideByZeroException();
        }
        return ((double)getWidgets())/((double)getDefective());
    }
}
