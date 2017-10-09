import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class FrSetup extends JFrame implements ActionListener{
    private static Timer timer;
    
//    public static void main(String[]args){
//        FrSetup w = new FrSetup();
//        w.inSet();
//        ActionListener timedSwitch = new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//                timer.stop();
//                w.Menu();
//            }
//        };
//        timer = new Timer(3000, timedSwitch);
//        timer.setRepeats(false);
//        timer.setInitialDelay(3000);
//        w.titleCard();
//        timer.start();
//    }
    
    public void inSet(){
        setTitle("Test");
        setPreferredSize(new Dimension(600,400));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }
    public void wipe(){
        getContentPane().removeAll();
        getContentPane().repaint();
    }
    
    
    public void titleCard(){
        JLabel Title = new JLabel("CS 245 Quarter Project");
        Title.setForeground(Color.white);
        Title.setFont(new Font("Papyrus", Font.PLAIN, 30));
        JLabel teamName = new JLabel("By: Team Name Pending");
        teamName.setForeground(Color.white);
        JPanel LPanel = new JPanel();
        LPanel.setBackground(Color.black);
        JPanel PPanel = new JPanel();
        JPanel MPanel = new JPanel(new BorderLayout());
        MPanel.setBackground(Color.black);
        PPanel.setBackground(Color.black);
        LPanel.add(Title);
        PPanel.add(teamName);
        MPanel.add(LPanel, BorderLayout.NORTH);
        MPanel.add(PPanel,BorderLayout.SOUTH);
        add(MPanel);
    }
    
    public void Menu(){
        JPanel mBackground = new JPanel(new BorderLayout());
        JPanel divider = new JPanel(new BorderLayout());
        ImageIcon image = new ImageIcon("300x400.png");
        JLabel imageL = new JLabel();
        imageL.setBounds(0, 0, 300, 400);
        imageL.setIcon(image);
        mBackground.setBackground(Color.black);
        mBackground.setBounds(0, 0, 600, 400);
        divider.setBackground(Color.black);
        add(mBackground);
        JPanel buttonList = new JPanel();
        buttonList.setLayout(new GridLayout(3,0));
        BSet P = new BSet();
        P.Play();
        P.addActionListener(this);
        BSet H = new BSet();
        H.Score();
        H.addActionListener(this);
        BSet C = new BSet();
        C.Cred();
        C.addActionListener(this);
        
        buttonList.add(P);
        buttonList.add(H);
        buttonList.add(C);
        
        divider.add(buttonList, BorderLayout.EAST);
        add(imageL, BorderLayout.WEST);
        add(divider, BorderLayout.SOUTH);

        setVisible(true);
    }
    
    public void Play(){
        JPanel backPanel = new JPanel(new BorderLayout());
        backPanel.setBackground(Color.white);
        JPanel buttonMaster = new JPanel();
        buttonMaster.setBackground(Color.white);
        JPanel buttonDivider = new JPanel();
        buttonDivider.setBackground(Color.white);
        JPanel buttonMount = new JPanel();
        buttonMount.setBackground(Color.white);
        JPanel buttonMount2 = new JPanel();
        BSet a = new BSet();
        BSet b = new BSet();
        BSet c = new BSet();
        BSet d = new BSet();
        BSet e = new BSet();
        BSet f = new BSet();
        BSet g = new BSet();
        BSet h = new BSet();
        BSet i = new BSet();
        BSet j = new BSet();
        BSet k = new BSet();
        BSet l = new BSet();
        BSet m = new BSet();
        BSet n = new BSet();
        BSet o = new BSet();
        BSet p = new BSet();
        BSet q = new BSet();
        BSet r = new BSet();
        BSet s = new BSet();
        BSet t = new BSet();
        BSet u = new BSet();
        BSet v = new BSet();
        BSet w = new BSet();
        BSet x = new BSet();
        BSet y = new BSet();
        BSet z = new BSet();
        a.A();
        buttonMount.setLayout(new BoxLayout(buttonMount, BoxLayout.LINE_AXIS));
        buttonMount.add(Box.createHorizontalGlue());
        buttonMount.add(a);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        b.B();
        buttonMount.add(b);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        c.C();
        buttonMount.add(c);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        d.D();
        buttonMount.add(d);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        e.E();
        buttonMount.add(e);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        f.F();
        buttonMount.add(f);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        g.G();
        buttonMount.add(g);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        h.H();
        buttonMount.add(h);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        i.I();
        buttonMount.add(i);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        j.J();
        buttonMount.add(j);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        k.K();
        buttonMount.add(k);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        l.L();
        buttonMount.add(l);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        m.M();
        buttonMount.add(m);
        buttonMaster.add(buttonMount, BorderLayout.SOUTH);
        backPanel.add(buttonMaster, BorderLayout.SOUTH);
        add(backPanel);
    }
   
    public void Credits(){
        BSet b = new BSet();
        b.back();
        JPanel backPanel = new JPanel();
        backPanel.setLayout(new GridLayout(0,8));
        backPanel.setBackground(Color.orange);
        backPanel.add(b);
        b.addActionListener(this);
        
        
        JLabel Header = new JLabel("Credits");
        Header.setFont(new Font("Papyrus", Font.PLAIN, 30));
        Header.setHorizontalAlignment(JLabel.CENTER);
        JPanel CredList = new JPanel();
        CredList.setBackground(Color.orange);
        JLabel Score1 = new JLabel("name");
        Score1.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score2 = new JLabel("name");
        Score2.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score3 = new JLabel("name");
        Score3.setHorizontalAlignment(JLabel.CENTER);
        
        
        
        CredList.setLayout(new GridLayout(4,0));
        CredList.add(Header);
        CredList.add(Score1);
        CredList.add(Score2);
        CredList.add(Score3);
        
        add(CredList);
        
        add(backPanel,BorderLayout.SOUTH);
    }

    public void ScoreBoard(){
        
        BSet b = new BSet();
        b.back();
        JPanel backPanel = new JPanel();
        backPanel.setLayout(new GridLayout(0,8));
        backPanel.setBackground(Color.orange);
        backPanel.add(b);
        b.addActionListener(this);
        
        
        int [] s = new int[5];
        JLabel Header = new JLabel("HIGHSCORES");
        Header.setFont(new Font("Papyrus", Font.PLAIN, 30));
        Header.setHorizontalAlignment(JLabel.CENTER);
        JPanel ScoreList = new JPanel();
        ScoreList.setBackground(Color.orange);
        JLabel Score1 = new JLabel(String.valueOf(s[0]));
        Score1.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score2 = new JLabel(String.valueOf(s[1]));
        Score2.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score3 = new JLabel(String.valueOf(s[2]));
        Score3.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score4 = new JLabel(String.valueOf(s[3]));
        Score4.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score5 = new JLabel(String.valueOf(s[4]));
        Score5.setHorizontalAlignment(JLabel.CENTER);
        
        
        ScoreList.setLayout(new GridLayout(6,0));
        ScoreList.add(Header);
        ScoreList.add(Score1);
        ScoreList.add(Score2);
        ScoreList.add(Score3);
        ScoreList.add(Score4);
        ScoreList.add(Score5);
        add(ScoreList);
        add(backPanel,BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Cred")){
            
            
            getContentPane().removeAll();
            Credits();
            revalidate();
           
                    }
        
        if(e.getActionCommand().equals("MM")){
            
            
            getContentPane().removeAll();
            Menu();
            revalidate();
           
                    }
        
        if(e.getActionCommand().equals("Scores")){
            
            
            getContentPane().removeAll();
            ScoreBoard();
            revalidate();
           
                    }
        if(e.getActionCommand().equals("Play")){
        
            getContentPane().removeAll();
            Play();
            revalidate();
        }
       
        
    }
}
