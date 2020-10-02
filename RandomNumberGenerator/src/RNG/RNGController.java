package RNG;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.Random;

public class RNGController
{
    @FXML public Button generateNumberLength, generateRandomNumberBetweenTwoNumbers, generateLottoNumbers;
    @FXML private TextField numberLengthInput, randomNumberLength, number1, number2, randomNumberBetweenTwoNumbers;
    @FXML private Text lotto1, lotto2, lotto3, lotto4, lotto5, lotto6;
    public Random rand = new Random();


    @FXML
    public void chooseNumberLength(ActionEvent e)
    {
        int max = 999999999;
        int min = 0;

        String random = String.valueOf ((int)(Math.random() *(max-min+1) + min));
        int input = Integer.parseInt(numberLengthInput.getText());
        int lengthOfNum = random.length();

        if(input <= lengthOfNum)
        {
            String value = random.substring(0, input );
            randomNumberLength.setText(value);
        }
        else
        {
            random = String.valueOf ((int) (Math.random() *(max-min+1) + min));
        }



        //add pop up if it isnt and int
    }


    @FXML
    public void chooseBetweenTwoNumbers(ActionEvent e)
    {
        int max = Integer.parseInt(number1.getText());
        int min = Integer.parseInt(number2.getText());

        String random = String.valueOf((int)(Math.random() *(max-min+1) + min));
        randomNumberBetweenTwoNumbers.setText(random);

    }

    @FXML
    public void playLotto(ActionEvent e)
    {
        int max = 49;
        int min = 1;

        lotto1.setText(String.valueOf((int)(Math.random() *(max-min+1) + min)));
        lotto2.setText(String.valueOf((int)(Math.random() *(max-min+1) + min)));
        lotto3.setText(String.valueOf((int)(Math.random() *(max-min+1) + min)));
        lotto4.setText(String.valueOf((int)(Math.random() *(max-min+1) + min)));
        lotto5.setText(String.valueOf((int)(Math.random() *(max-min+1) + min)));
        lotto6.setText(String.valueOf((int)(Math.random() *(max-min+1) + min)));



    }
}
