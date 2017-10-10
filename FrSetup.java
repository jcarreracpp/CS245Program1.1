import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class FrSetup extends JFrame implements ActionListener{
    static Timer timer;
    String[] wordList = {"abstract", "cemetery", "nurse", "pharmacy","climbing"};
    int[] uniqueList = {6, 6, 5, 7, 7};
    JTextField textField = new JTextField();
    JLabel labelTitle = new JLabel();
    JLabel score = new JLabel();
    ImageIcon bg = new ImageIcon();
    int level = (int) (Math.random() * 5);
    int wrong;
    int right;
    //int[] wordLength = new int[5];
    String letter;
    boolean jumpToEnd = false;
    JLabel img = new JLabel(bg, JLabel.CENTER);
   
    
    public void inSet(){
        setTitle("CS245 Team Pending Hangman");
        setPreferredSize(new Dimension(600,400));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }
    
    public void wipe(){
        getContentPane().removeAll();
        revalidate();
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
        JPanel timePanel = new JPanel();
        timePanel.setLayout(new BoxLayout(timePanel, BoxLayout.Y_AXIS));
        timePanel.setBackground(Color.white);
        JPanel buttonDivider = new JPanel(new BorderLayout());
        buttonDivider.setBackground(Color.white);
        JPanel buttonMount = new JPanel();
        buttonMount.setBackground(Color.white);
        JPanel buttonMount2 = new JPanel();
        buttonMount2.setBackground(Color.white);
        
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        JLabel time = new JLabel("--/--/---- --:--:--", JLabel.CENTER);
        ActionListener actiondate = new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                Date myDate = new Date();
                time.setText(dateFormat.format(myDate));
                }
        };
        BSet skip = new BSet();
        skip.skip();
        skip.addActionListener(this);
        new Timer(1000, actiondate).start();
        timePanel.add(time);
        timePanel.add(skip);
        buttonDivider.add(timePanel, BorderLayout.EAST);
        add(buttonDivider, BorderLayout.NORTH);
        
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
        a.addActionListener(this);
        buttonMount.setLayout(new BoxLayout(buttonMount, BoxLayout.LINE_AXIS));
        buttonMount.add(Box.createHorizontalGlue());
        buttonMount.add(a);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        b.B();
        b.addActionListener(this);
        buttonMount.add(b);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        c.C();
        c.addActionListener(this);
        buttonMount.add(c);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        d.D();
        d.addActionListener(this);
        buttonMount.add(d);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        e.E();
        e.addActionListener(this);
        buttonMount.add(e);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        f.F();
        f.addActionListener(this);
        buttonMount.add(f);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        g.G();
        g.addActionListener(this);
        buttonMount.add(g);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        h.H();
        h.addActionListener(this);
        buttonMount.add(h);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        i.I();
        i.addActionListener(this);
        buttonMount.add(i);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        j.J();
        j.addActionListener(this);
        buttonMount.add(j);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        k.K();
        k.addActionListener(this);
        buttonMount.add(k);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        l.L();
        l.addActionListener(this);
        buttonMount.add(l);
        buttonMount.add(Box.createRigidArea(new Dimension(3, 0)));
        m.M();
        m.addActionListener(this);
        buttonMount.add(m);
        buttonMount.add(Box.createRigidArea(new Dimension(11, 0)));
        buttonMount2.setLayout(new BoxLayout(buttonMount2, BoxLayout.LINE_AXIS));
        buttonMount2.add(Box.createHorizontalGlue());
        n.N();
        n.addActionListener(this);
        buttonMount2.add(n);
        buttonMount2.add(Box.createRigidArea(new Dimension(3, 0)));
        o.O();
        o.addActionListener(this);
        buttonMount2.add(o);
        buttonMount2.add(Box.createRigidArea(new Dimension(3, 0)));
        p.P();
        p.addActionListener(this);
        buttonMount2.add(p);
        buttonMount2.add(Box.createRigidArea(new Dimension(3, 0)));
        q.Q();
        q.addActionListener(this);
        buttonMount2.add(q);
        buttonMount2.add(Box.createRigidArea(new Dimension(3, 0)));
        r.R();
        r.addActionListener(this);
        buttonMount2.add(r);
        buttonMount2.add(Box.createRigidArea(new Dimension(3, 0)));
        s.S();
        s.addActionListener(this);
        buttonMount2.add(s);
        buttonMount2.add(Box.createRigidArea(new Dimension(3, 0)));
        t.T();
        t.addActionListener(this);
        buttonMount2.add(t);
        buttonMount2.add(Box.createRigidArea(new Dimension(3, 0)));
        u.U();
        u.addActionListener(this);
        buttonMount2.add(u);
        buttonMount2.add(Box.createRigidArea(new Dimension(3, 0)));
        v.V();
        v.addActionListener(this);
        buttonMount2.add(v);
        buttonMount2.add(Box.createRigidArea(new Dimension(3, 0)));
        w.W();
        w.addActionListener(this);
        buttonMount2.add(w);
        buttonMount2.add(Box.createRigidArea(new Dimension(3, 0)));
        x.X();
        x.addActionListener(this);
        buttonMount2.add(x);
        buttonMount2.add(Box.createRigidArea(new Dimension(3, 0)));
        y.Y();
        y.addActionListener(this);
        buttonMount2.add(y);
        buttonMount2.add(Box.createRigidArea(new Dimension(3, 0)));
        z.Z();
        z.addActionListener(this);
        buttonMount2.add(z);
        buttonMount2.add(Box.createRigidArea(new Dimension(7, 0)));
        
        JPanel buttonList = new JPanel();
        buttonList.setBackground(Color.white);
        buttonList.setLayout(new GridLayout(3,0));
        buttonList.add(buttonMount);
        buttonList.add(buttonMount2);
        add(backPanel);
        add(timePanel, BorderLayout.EAST);
        add(buttonList, BorderLayout.SOUTH);
        
        gameStart();
    }
    
    public void gameStart() {
        bg = new ImageIcon("hangman_0.jpg");
        score.setText("100");
        level = (int) (Math.random() * 5);
        letter = "";
        for(int k = 0; k <wordList[level].length(); k++){
            letter += " ";
        }
        img.setPreferredSize(new Dimension(271, 200));
        JPanel imgPane = new JPanel(new BorderLayout());
        JPanel back = new JPanel(new GridLayout(2,0));
        JPanel drawer = new JPanel(new GridLayout(4,0));
        back.setBackground(Color.white);
        drawer.setBackground(Color.white);
        labelTitle = new JLabel("", JLabel.CENTER);
        JLabel jlLines = new JLabel("__ ", JLabel.CENTER);
        textField.setFont(new Font("Rockwell", Font.PLAIN, 20));
        labelTitle.setFont(new Font("Rockwell", Font.PLAIN, 20));
        jlLines.setFont(new Font("Rockewell", Font.PLAIN, 20));

        img.setIcon(bg);
        imgPane.setBackground(Color.white);
        imgPane.add(img, BorderLayout.NORTH);
        JLabel empty = new JLabel();
        empty.setFont(new Font("Papyrus", Font.PLAIN, 30));
        empty.setText("");
        JLabel empty2 = new JLabel();
        empty2.setFont(new Font("Papyrus", Font.PLAIN, 30));
        empty2.setText("");
        JLabel title = new JLabel();
        title.setFont(new Font("Papyrus", Font.PLAIN, 24));
        title.setText("Score:");
        drawer.add(empty);
        drawer.add(title);
        score.setFont(new Font("Papyrus", Font.PLAIN, 16));
        drawer.add(score);
        drawer.add(empty2);
        imgPane.add(drawer, BorderLayout.EAST);
        
        String line = "";

        for (int m = 0; m < wordList[level].length(); m++)
        {
            line += "__ ";

        }
        jlLines.setText(line);
        back.add(labelTitle);
        back.add(jlLines);
        imgPane.add(back);


        add(imgPane);
        
        wrong = 0;
        right = 0;
    }
   
    public void detract(String let) {
        if (!wordList[level].contains(let)) {
            wrong++;
            if (wrong == 1) {
                bg = new ImageIcon("hangman_1.jpg");
                img.setIcon(bg);
                score.setText("90");
            }
            if (wrong == 2) {
                bg = new ImageIcon("hangman_2.jpg");
                img.setIcon(bg);
                score.setText("80");
            }
            if (wrong == 3) {
                bg = new ImageIcon("hangman_3.jpg");
                img.setIcon(bg);
                score.setText("70");
            }
            if (wrong == 4) {
                bg = new ImageIcon("hangman_4.jpg");
                img.setIcon(bg);
                score.setText("60");
            }
            if (wrong == 5) {
                bg = new ImageIcon("hangman_5.jpg");
                img.setIcon(bg);
                score.setText("50");
            }
            if (wrong == 6) {
                bg = new ImageIcon("hangman_6.jpg");
                img.setIcon(bg);
                score.setText("40");
                level = (int) (Math.random() * 64);
                getContentPane().removeAll();
                EndGame();
                revalidate();
            }
        }else{
            updateHint(let);
            right++;
            if(right == uniqueList[level]){
                getContentPane().removeAll();
                EndGame();
                revalidate();
            }
        }
    }
    
    public void updateHint(String let){
        char a = let.charAt(0);
        char[] word = wordList[level].toCharArray();
        char[] lword = letter.toCharArray();
        for(int g = 0; g <wordList[level].length(); g++){
            if(a == word[g]){
                lword[g] = word[g];
            }
        }
        letter = new String(lword);
        String temp = new String();
        temp = letter;
        temp = temp.replaceAll(".", "$0   ").trim();
        labelTitle.setText(temp);
    }
    
    public void Credits(){
        BSet b = new BSet();
        b.back();
        JPanel backPanel = new JPanel();
        backPanel.setLayout(new GridLayout(0,8));
        backPanel.setBackground(Color.red);
        backPanel.add(b);
        b.addActionListener(this);
        
        
        JLabel Header = new JLabel("Credits");
        Header.setFont(new Font("Papyrus", Font.PLAIN, 30));
        Header.setHorizontalAlignment(JLabel.CENTER);
        JPanel CredList = new JPanel();
        CredList.setBackground(Color.red);
        JLabel Score1 = new JLabel("Jacob Kim, BroncoID: 010500230");
        Score1.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score2 = new JLabel("James Lee, BroncoID: 009687340");
        Score2.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score3 = new JLabel("Jorge Luis Carrera, BroncoID: 009863178");
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
        backPanel.setBackground(Color.BLUE);
        backPanel.add(b);
        b.addActionListener(this);
        
        
        int [] s = new int[5];
        JLabel Header = new JLabel("HIGHSCORES");
        Header.setFont(new Font("Papyrus", Font.PLAIN, 30));
        Header.setHorizontalAlignment(JLabel.CENTER);
        JPanel ScoreList = new JPanel();
        ScoreList.setBackground(Color.BLUE);
        JLabel Score1 = new JLabel("ABC....."+String.valueOf(s[0]));
        Score1.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score2 = new JLabel("ABC....."+String.valueOf(s[1]));
        Score2.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score3 = new JLabel("ABC....."+String.valueOf(s[2]));
        Score3.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score4 = new JLabel("ABC....."+String.valueOf(s[3]));
        Score4.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score5 = new JLabel("ABC....."+String.valueOf(s[4]));
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
    
    public void EndGame(){
        BSet b = new BSet();
        b.end();
        JPanel backPanel = new JPanel();
        JPanel backGround = new JPanel(new GridLayout(4,0));
        JPanel centerPanel = new JPanel(new GridLayout(0,3));
        JPanel emptyP = new JPanel();
        JPanel emptyP2 = new JPanel();
        
        emptyP.setBackground(Color.orange);
        emptyP2.setBackground(Color.orange);
        backGround.setBackground(Color.orange);
        backPanel.setLayout(new GridLayout(0,8));
        backPanel.setBackground(Color.orange);
        backPanel.add(b);
        b.addActionListener(this);
        
        JLabel empty = new JLabel();
        empty.setFont(new Font("Papyrus", Font.PLAIN, 30));
        empty.setText("");
        JLabel empty2 = new JLabel();
        empty2.setFont(new Font("Papyrus", Font.PLAIN, 30));
        empty2.setText("");
        JLabel title = new JLabel();
        title.setFont(new Font("Papyrus", Font.PLAIN, 48));
        title.setText("Score:");

        score.setFont(new Font("Papyrus", Font.PLAIN, 30));


        backGround.add(empty);
        backGround.add(title);
        backGround.add(score);
        backGround.add(empty2);
        centerPanel.add(emptyP);
        centerPanel.add(backGround);
        centerPanel.add(emptyP2);
        
        add(centerPanel);
        add(backPanel, BorderLayout.SOUTH);
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
        if(e.getActionCommand().equals("Skip")){
            getContentPane().removeAll();
            EndGame();
            revalidate();
            score.setText("0");
            jumpToEnd = true;
        }
        if(e.getActionCommand().equals("A")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("a");
        }
        if(e.getActionCommand().equals("B")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("b");
        }
        if(e.getActionCommand().equals("C")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("c");
        }
        if(e.getActionCommand().equals("D")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            pButton.setBackground(Color.DARK_GRAY);
            detract("d");
        }
        if(e.getActionCommand().equals("E")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("e");
        }
        if(e.getActionCommand().equals("F")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("f");
        }
        if(e.getActionCommand().equals("G")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("g");
        }
        if(e.getActionCommand().equals("H")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("h");
        }
        if(e.getActionCommand().equals("I")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("i");
        }
        if(e.getActionCommand().equals("J")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("j");
        }
        if(e.getActionCommand().equals("K")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("k");
        }
        if(e.getActionCommand().equals("L")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("l");
        }
        if(e.getActionCommand().equals("M")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("m");
        }
        if(e.getActionCommand().equals("N")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("n");
        }
        if(e.getActionCommand().equals("O")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("o");
        }
        if(e.getActionCommand().equals("P")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("p");
        }
        if(e.getActionCommand().equals("Q")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("q");
        }
        if(e.getActionCommand().equals("R")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("r");
        }
        if(e.getActionCommand().equals("S")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("s");
        }
        if(e.getActionCommand().equals("T")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("t");
        }
        if(e.getActionCommand().equals("U")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("u");
        }
        if(e.getActionCommand().equals("V")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("v");
        }
        if(e.getActionCommand().equals("W")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("w");
        }
        if(e.getActionCommand().equals("X")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("x");
        }
        if(e.getActionCommand().equals("Y")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("y");
        }
        if(e.getActionCommand().equals("Z")){
            JButton pButton= (JButton) e.getSource();
            pButton.setEnabled(false);
            pButton.setBackground(Color.DARK_GRAY);
            detract("z");
        }
    }
}
