import com.codebind.Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFunction extends Calculator {
    public AddFunction() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String result = resultTxt.getText();
                String ps = actionEvent.paramString();
                System.out.println("paramString: " + ps);
                resultTxt.setText(resultTxt.getText() + addButton.getText());
            }
        });
    }
}
