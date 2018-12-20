import javax.swing.*;
import java.util.Arrays;

public class Button extends JButton
{

    private String operation;
    private String[] aOperation= { "+", "-", "*", "/" };

    public Button ( String userOperation )
    {
        super(userOperation);

        if ( Arrays.asList(aOperation).contains(userOperation) )
        {
            operation= userOperation;
        }
        else
        {
            System.err.println("Некорректная операция");
        }
    }

    public String getOperation ()
    {
        return operation;
    }
}
