
import com.sun.xml.internal.ws.util.StringUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class HSFiler {
    private String fileName = "highscore.txt";
    private String defaultFill = "ABC...000000";
    private File file = new File(fileName);
    
    public HSFiler(){
        if(file.exists()){
        }else{
            try{
            file.createNewFile();
            defaultFill();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    private void defaultFill(){
        String[] hsf = new String[5];
        for(int i = 0; i < hsf.length; i++){
            hsf[i] = defaultFill;
        }
        setHS(hsf);
    }
    
    public String[] getHS() {
        String[] hs = new String[5];
        String temp;
        int placeHolder = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (( temp = br.readLine()) != null) {
                hs[placeHolder] = temp;
                placeHolder++;
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return hs;
    }
    
    public void setHS(String[] hs) {
        String temp;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, false))){
            
            for (int i = 0; i < hs.length; i++) {
                temp = hs[i];
                bw.write(temp + "\r\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public void addNewHS(String name, int score, int position){
        String[] toAdd = getHS();
        String[] temp = getHS();
        
        for(int j = position; j < toAdd.length; j++){
            if(j == position){
                name = name + "..." + ("000000" + Integer.toString(score)).substring(Integer.toString(score).length());
                toAdd[j] = name;
            }else{
                toAdd[j] = temp[(j - 1)];
            }
        }
        setHS(toAdd);
    }

    public int[] returnScores(){
        String[] scores = getHS();
        int[] score = new int[scores.length];

        for(int k = 0; k < scores.length; k++){
            score[k] = Integer.parseInt(scores[k].substring((scores[k].length()-6),scores[k].length()));
        }
        return score;
    }

}
