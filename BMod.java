import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class BMod extends JButton implements ActionListener {
    int[] bMap = new int[4];
    
    

    public BMod(String string, String sector, int buttonLocale){
        addActionListener(this);
        setText(string);
        setActionCommand(sector);
        assignCoord(sector, buttonLocale);
        
    }

    public void assignCoord(String sect, int buttonLocale){
        if(sect.contentEquals("sector0"))
            sector0Assignment(buttonLocale);
        if(sect.contentEquals("sector1"))
            sector1Assignment(buttonLocale);
        if(sect.contentEquals("sector2"))
            sector2Assignment(buttonLocale);
        if(sect.contentEquals("sector3"))
            sector3Assignment(buttonLocale);
        if(sect.contentEquals("sector4"))
            sector4Assignment(buttonLocale);
        if(sect.contentEquals("sector5"))
            sector5Assignment(buttonLocale);
        if(sect.contentEquals("sector6"))
            sector6Assignment(buttonLocale);
        if(sect.contentEquals("sector7"))
            sector7Assignment(buttonLocale);
        if(sect.contentEquals("sector8"))
            sector8Assignment(buttonLocale);
    }
    
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("sector0")){
            System.out.println("sector 0 ");
            System.out.println(bMap[0]+" "+bMap[1]+" "+bMap[2]+" "+bMap[3]);
            String temp;
            do{
            temp = JOptionPane.showInputDialog("What number? (0-9)");
            }while(withinBounds(temp)){
            }
            setText(temp.substring(0, 1));
        }
        if(e.getActionCommand().equals("sector1")){
            System.out.println("sector 1");
            System.out.println(bMap[0]+" "+bMap[1]+" "+bMap[2]+" "+bMap[3]);
            String temp = JOptionPane.showInputDialog("What number? (0-9)");
            setText(temp.substring(0, 1));
        }
        if(e.getActionCommand().equals("sector2")){
            System.out.println("sector 2");
            System.out.println(bMap[0]+" "+bMap[1]+" "+bMap[2]+" "+bMap[3]);
            String temp = JOptionPane.showInputDialog("What number? (0-9)");
            setText(temp.substring(0, 1));
        }
        if(e.getActionCommand().equals("sector3")){
            System.out.println("sector 3");
            System.out.println(bMap[0]+" "+bMap[1]+" "+bMap[2]+" "+bMap[3]);
            String temp = JOptionPane.showInputDialog("What number? (0-9)");
            setText(temp.substring(0, 1));;
        }
        if(e.getActionCommand().equals("sector4")){
            System.out.println("sector 4");
            System.out.println(bMap[0]+" "+bMap[1]+" "+bMap[2]+" "+bMap[3]);
            String temp = JOptionPane.showInputDialog("What number? (0-9)");
            setText(temp.substring(0, 1));
        }
        if(e.getActionCommand().equals("sector5")){
            System.out.println("sector 5");
            System.out.println(bMap[0]+" "+bMap[1]+" "+bMap[2]+" "+bMap[3]);
            String temp = JOptionPane.showInputDialog("What number? (0-9)");
            setText(temp.substring(0, 1));
        }
        if(e.getActionCommand().equals("sector6")){
            System.out.println("sector 6");
            System.out.println(bMap[0]+" "+bMap[1]+" "+bMap[2]+" "+bMap[3]);
            String temp = JOptionPane.showInputDialog("What number? (0-9)");
            setText(temp.substring(0, 1));
        }
        if(e.getActionCommand().equals("sector7")){
            System.out.println("sector 7");
            System.out.println(bMap[0]+" "+bMap[1]+" "+bMap[2]+" "+bMap[3]);
            String temp = JOptionPane.showInputDialog("What number? (0-9)");
            setText(temp.substring(0, 1));
        }
        if(e.getActionCommand().equals("sector8")){
            System.out.println("sector 8");
            System.out.println(bMap[0]+" "+bMap[1]+" "+bMap[2]+" "+bMap[3]);
            String temp = JOptionPane.showInputDialog("What number? (0-9)");
            setText(temp.substring(0, 1));
        }
        
        //setText("P");
      //System.out.println("pressed");
      revalidate();
    }
    
    private boolean withinBounds(String string){
        string = string.substring(0, 1);
        if(string.equals("1")||string.equals("2")||string.equals("3")||
                string.equals("4")||string.equals("5")||string.equals("6")||
                string.equals("7")||string.equals("8")||string.equals("9")){
            return true;
        }else{
            return false;
        }
    }
    
    private void sector0Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale + 1;
        if(temp == 7)
            temp++;
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 0;
        bMap[1] = 0;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    private void sector1Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale + 1;
        
        if(temp >= 2)
            temp++;
        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 0;
        bMap[1] = 1;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    private void sector2Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale;
        
        if(temp >= 2)
            temp++;
        if(temp >= 3)
            temp++;
        if(temp >= 6)
            temp++;
        if(temp >= 7)
            temp++;
        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 0;
        bMap[1] = 2;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    private void sector3Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale+1;
        
        if(temp >= 2)
            temp++;

        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 1;
        bMap[1] = 0;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    private void sector4Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale;
        
        if(temp >= 1)
            temp++;
        if(temp >= 4)
            temp++;
        if(temp >= 7)
            temp++;
        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 1;
        bMap[1] = 1;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    private void sector5Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale+1;
        
        if(temp >= 1)
            temp++;
        if(temp >= 6)
            temp++;
        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 1;
        bMap[1] = 2;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    private void sector6Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale;
        
        if(temp >= 1)
            temp++;
        if(temp >= 2)
            temp++;
        if(temp >= 5)
            temp++;
        if(temp >= 6)
            temp++;
        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 2;
        bMap[1] = 0;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    private void sector7Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale;
        
        if(temp >= 6)
            temp++;
        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 2;
        bMap[1] = 1;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    private void sector8Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale;
        
        if(temp >= 1)
            temp++;
        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 2;
        bMap[1] = 2;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
}
