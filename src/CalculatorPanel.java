import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class CalculatorPanel extends JPanel
{
    public CalculatorPanel ()
    {
        setLayout( new BorderLayout() );

        JPanel insrtPanel= new JPanel();
        insrtPanel.setLayout( new GridBagLayout() );
        GridBagConstraints c= new GridBagConstraints();

        c.fill= GridBagConstraints.HORIZONTAL;
        c.weightx= 0.5;

        JLabel label1= new JLabel( "Аргумент 1" );
        c.gridx= 0;
        c.gridy= 0;
        insrtPanel.add( label1, c );

        JTextField f1= new JTextField(10);
        c.gridx= 1;
        c.gridy= 0;
        insrtPanel.add( f1, c );

        JLabel label2= new JLabel( "Аргумент 2" );
        c.gridx= 0;
        c.gridy= 1;
        insrtPanel.add( label2, c );

        JTextField f2= new JTextField(10);
        c.gridx= 1;
        c.gridy= 1;
        insrtPanel.add( f2, c );

        JLabel label3= new JLabel( "Результат" );
        c.gridx= 0;
        c.gridy= 2;
        insrtPanel.add( label3, c );

        JTextField f3= new JTextField(10);
        c.gridx= 1;
        c.gridy= 2;
        insrtPanel.add( f3, c );

        add( insrtPanel, BorderLayout.CENTER);

        JPanel actionPanel= new JPanel();
        JButton sum= new Button("+");
        JButton min= new Button("-");
        JButton mno= new Button("*");
        JButton del= new Button("/");

        actionPanel.add(sum);
        actionPanel.add(min);
        actionPanel.add(mno);
        actionPanel.add(del);

        add( actionPanel, BorderLayout.SOUTH);

        ActionListener buttonActionListener= new CalculatorActionListener( f1, f2, f3 );
        sum.addActionListener(buttonActionListener);
        min.addActionListener(buttonActionListener);
        mno.addActionListener(buttonActionListener);
        del.addActionListener(buttonActionListener);


    }
}
