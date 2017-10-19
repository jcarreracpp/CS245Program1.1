

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Stp extends JFrame implements ActionListener {

    private JButton rb = new JButton();
    private JButton bb = new JButton();
    private JButton yb = new JButton();
    private JButton gb = new JButton();
    private JButton pb = new JButton();
    FrSetup frs = new FrSetup();
    private int wrongCounter = 0;

    private int Score = 100;   //dummy score variable; replace with real one
    JPanel p = new JPanel();

    public JLabel l = new JLabel("Purple");
    
    public Stp(){}

    public void set() {

        l.setForeground(Color.red);
        l.setLocation(600 / 2 - 50, 10);
        l.setBackground(Color.black);
        l.setSize(50, 50);
        l.setVisible(true);

        p.setLayout(null);
        p.setSize(600, 400);
        p.setBackground(Color.black);
        p.add(l);

        rb.setIcon(new ImageIcon("cs_245_red_circle.png"));
        bb.setIcon(new ImageIcon("cs_245_blue_circle.png"));
        yb.setIcon(new ImageIcon("cs_245_yellow_circle.png"));
        gb.setIcon(new ImageIcon("cs_245_green_circle.png"));
        pb.setIcon(new ImageIcon("cs_245_purple_circle.png"));
        rb.setRolloverIcon(new ImageIcon("red_h.png"));
        bb.setRolloverIcon(new ImageIcon("blue_h.png"));
        yb.setRolloverIcon(new ImageIcon("yellow_h.png"));
        gb.setRolloverIcon(new ImageIcon("green_h.png"));
        pb.setRolloverIcon(new ImageIcon("purple_h.png"));
        
        add(p);
        LvOne();

    }

    public void BSup(JPanel p, JButton r, int x, int y, String s) {
        r.setLocation(x, y);
        r.setSize(100, 100);
        r.setBorderPainted(false);
        r.setContentAreaFilled(false);
        r.setActionCommand(s);
        r.addActionListener(this);
        p.add(r);
    }

    public void LvOne() {

        BSup(p, bb, 50, 50, "w");
        BSup(p, rb, 200, 75, "w");
        BSup(p, yb, 400, 20, "w");
        BSup(p, gb, 20, 200, "w");
        BSup(p, pb, 400, 180, "Right1");
        p.revalidate();
        revalidate();

    }

    public void LvTwo() {

        BSup(p, bb, 75, 80, "w");
        BSup(p, rb, 340, 220, "w");
        BSup(p, gb, 405, 98, "Right2");
        BSup(p, pb, 200, 120, "w");
        BSup(p, yb, 25, 245, "w");
        p.revalidate();
        revalidate();

    }

    public void LvThree() {
        BSup(p, bb, 400, 10, "Right3");
        BSup(p, rb, 100, 50, "w");
        BSup(p, gb, 10, 200, "w");
        BSup(p, pb, 140, 250, "w");
        BSup(p, yb, 287, 170, "w");
        p.revalidate();
        revalidate();
    }

    public void actionPerformed(ActionEvent e) {
        l.setVisible(true);
        if (e.getActionCommand().equals("Right1")) {
            FrSetup.scoreVal += 100;
            l.setText("Green");
            l.setForeground(Color.blue);
            l.setVisible(true);
            LvTwo();
            revalidate();

        }
        if (e.getActionCommand().equals("Right2")) {
            FrSetup.scoreVal += 100;
            LvThree();
            l.setText("Blue");
            l.setForeground(Color.orange);
            revalidate();
        }
        if (e.getActionCommand().equals("Right3")) {
            FrSetup.scoreVal += 100;

            frs.EndGame();

        }
        if (e.getActionCommand().equals("w")) {
            if(wrongCounter == 0){
                l.setText("Green");
                l.setForeground(Color.blue);
                l.setVisible(true);
                LvTwo();
                revalidate();
                wrongCounter++;
            }else if(wrongCounter == 1){
                LvThree();
                l.setText("Blue");
                l.setForeground(Color.orange);
                revalidate();
                wrongCounter++;
            }else if(wrongCounter == 2){
                frs.EndGame();
            }
        }
    }

}
