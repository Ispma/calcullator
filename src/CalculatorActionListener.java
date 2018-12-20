import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorActionListener implements ActionListener
{

    JTextField f1;
    JTextField f2;
    JTextField f3;

    public CalculatorActionListener ( JTextField arg1, JTextField arg2, JTextField res )
    {
        this.f1= arg1;
        this.f2= arg2;
        this.f3= res;
    }

    @Override

    public void actionPerformed ( ActionEvent e )
    {
        double d1= 0;
        double d2= 0;

        if ( !f1.getText().equals("") )
        {
            d1= Double.parseDouble(f1.getText());
        }
        if ( !f2.getText().equals("") )
        {
            d2= Double.parseDouble(f2.getText());
        }

        double resValue= 0.0;

        Button targetButton= (Button) e.getSource();

        switch ( targetButton.getOperation() )
        {
            case "+": resValue= d1 + d2; break;
            case "-": resValue= d1 - d2; break;
            case "*": resValue= d1 * d2; break;
            case "/": resValue= d1 / d2; break;
        }

        f3.setText(Double.toString(resValue));
    }
}
