import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class main{
    private static Timer timer;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrSetup wind = new FrSetup();
        wind.inSet();

        ActionListener timedSwitch = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                timer.stop();
                wind.wipe();
                wind.Menu();

                System.out.println("bub");
            }
        };
        timer = new Timer(3000, timedSwitch);
        timer.setRepeats(false);
        timer.setInitialDelay(3000);
        wind.titleCard();

        timer.start();
        
        
    }
        
    
}
