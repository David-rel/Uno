import java.util.ArrayList;

import javax.swing.JButton;

public class BotCheck {

    public static JButton Check(JButton[] ListOfCards, int BotHandLength, ArrayList<String> BotHand , int i){



        if (BotHand.get(i).contains("(1)") || BotHand.get(i).contains("0")) {
            if (BotHand.get(i).charAt(0) == 'R'){
                switch(BotHand.get(i).charAt(1)){
                    case '0':
                        return ListOfCards[0]; 
                    case '1':
                        return ListOfCards[1];
                    case '2':
                        return ListOfCards[2];
                    case '3':
                        return ListOfCards[3];
                    case '4':
                        return ListOfCards[4];
                    case '5':
                        return ListOfCards[5];
                    case '6':
                        return ListOfCards[6];
                    case '7':
                        return ListOfCards[7];
                    case '8':
                        return ListOfCards[8];
                    case '9':
                        return ListOfCards[9];
                    case 'S':
                        return ListOfCards[10];
                    case 'R':
                        return ListOfCards[11];
                    case 'D':
                        return ListOfCards[12];
                }
                    
            }
            else if (BotHand.get(i).charAt(0) == 'B'){
                switch(BotHand.get(i).charAt(1)) {
                    case '0':
                        return ListOfCards[13]; 
                    case '1':
                        return ListOfCards[14];
                    case '2':
                        return ListOfCards[15];
                    case '3':
                        return ListOfCards[16];
                    case '4':
                        return ListOfCards[17];
                    case '5':
                        return ListOfCards[18];
                    case '6':
                        return ListOfCards[19];
                    case '7':
                        return ListOfCards[20];
                    case '8':
                        return ListOfCards[21];
                    case '9':
                        return ListOfCards[22];
                    case 'S':
                        return ListOfCards[23];
                    case 'R':
                        return ListOfCards[24];
                    case 'D':
                        return ListOfCards[25];
                }
            }
            else if (BotHand.get(i).charAt(0) == 'G'){
                switch(BotHand.get(i).charAt(1)){
                    case '0':
                        return ListOfCards[26]; 
                    case '1':
                        return ListOfCards[27];
                    case '2':
                        return ListOfCards[28];
                    case '3':
                        return ListOfCards[29];
                    case '4':
                        return ListOfCards[30];
                    case '5':
                        return ListOfCards[31];
                    case '6':
                        return ListOfCards[32];
                    case '7':
                        return ListOfCards[33];
                    case '8':
                        return ListOfCards[34];
                    case '9':
                        return ListOfCards[35];
                    case 'S':
                        return ListOfCards[36];
                    case 'R':
                        return ListOfCards[37];
                    case 'D':
                        return ListOfCards[38];
                }
            }
            else if (BotHand.get(i).charAt(0) == 'Y'){
                switch(BotHand.get(i).charAt(1)){
                    case '0':
                        return ListOfCards[39]; 
                    case '1':
                        return ListOfCards[40];
                    case '2':
                        return ListOfCards[41];
                    case '3':
                        return ListOfCards[42];
                    case '4':
                        return ListOfCards[43];
                    case '5':
                        return ListOfCards[44];
                    case '6':
                        return ListOfCards[45];
                    case '7':
                        return ListOfCards[46];
                    case '8':
                        return ListOfCards[47];
                    case '9':
                        return ListOfCards[48];
                    case 'S':
                        return ListOfCards[49];
                    case 'R':
                        return ListOfCards[50];
                    case 'D':
                        return ListOfCards[51];
                }
            }
            else if (BotHand.get(i).charAt(0) == 'W'){
                
                switch(BotHand.get(i).charAt(1)){
                    case '(':
                        return ListOfCards[52]; 
                    case 'P':
                        return ListOfCards[53];   
                }
            }
        }

        else if (BotHand.get(i).contains("(2)")) {
            if (BotHand.get(i).charAt(0) == 'R'){
                switch(BotHand.get(i).charAt(1)){
                    case '1':
                        return ListOfCards[54];
                    case '2':
                        return ListOfCards[55];
                    case '3':
                        return ListOfCards[56];
                    case '4':
                        return ListOfCards[57];
                    case '5':
                        return ListOfCards[58];
                    case '6':
                        return ListOfCards[59];
                    case '7':
                        return ListOfCards[60];
                    case '8':
                        return ListOfCards[61];
                    case '9':
                        return ListOfCards[62];
                    case 'S':
                        return ListOfCards[63];
                    case 'R':
                        return ListOfCards[64];
                    case 'D':
                        return ListOfCards[65];
                }
                    
            }
            else if (BotHand.get(i).charAt(0) == 'B'){
                switch(BotHand.get(i).charAt(1)) { 
                    case '1':
                        return ListOfCards[66];
                    case '2':
                        return ListOfCards[67];
                    case '3':
                        return ListOfCards[68];
                    case '4':
                        return ListOfCards[69];
                    case '5':
                        return ListOfCards[70];
                    case '6':
                        return ListOfCards[71];
                    case '7':
                        return ListOfCards[72];
                    case '8':
                        return ListOfCards[73];
                    case '9':
                        return ListOfCards[74];
                    case 'S':
                        return ListOfCards[75];
                    case 'R':
                        return ListOfCards[76];
                    case 'D':
                        return ListOfCards[77];
                }
            }    
            else if (BotHand.get(i).charAt(0) == 'G'){
                switch(BotHand.get(i).charAt(1)){
                    case '1':
                        return ListOfCards[78];
                    case '2':
                        return ListOfCards[79];
                    case '3':
                        return ListOfCards[80];
                    case '4':
                        return ListOfCards[81];
                    case '5':
                        return ListOfCards[82];
                    case '6':
                        return ListOfCards[83];
                    case '7':
                        return ListOfCards[84];
                    case '8':
                        return ListOfCards[85];
                    case '9':
                        return ListOfCards[86];
                    case 'S':
                        return ListOfCards[87];
                    case 'R':
                        return ListOfCards[88];
                    case 'D':
                        return ListOfCards[89];
                }
            }
            else if (BotHand.get(i).charAt(0) == 'Y'){
                switch(BotHand.get(i).charAt(1)){
                    case '1':
                        return ListOfCards[90];
                    case '2':
                        return ListOfCards[91];
                    case '3':
                        return ListOfCards[92];
                    case '4':
                        return ListOfCards[93];
                    case '5':
                        return ListOfCards[94];
                    case '6':
                        return ListOfCards[95];
                    case '7':
                        return ListOfCards[96];
                    case '8':
                        return ListOfCards[97];
                    case '9':
                        return ListOfCards[98];
                    case 'S':
                        return ListOfCards[99];
                    case 'R':
                        return ListOfCards[100];
                    case 'D':
                        return ListOfCards[101];
                }
            }
            else if (BotHand.get(i).charAt(0) == 'W'){
                
                switch(BotHand.get(i).charAt(1)){
                    case '(':
                        return ListOfCards[102]; 
                    case 'P':
                        return ListOfCards[105];   
                }
            }
        }
        else if (BotHand.get(i).contains("(3)")) {
            switch(BotHand.get(i).charAt(1)){
                case '(':
                    return ListOfCards[103]; 
                case 'P':
                    return ListOfCards[106];   
            }
        }
        else if (BotHand.get(i).contains("(4)")) {
            switch(BotHand.get(i).charAt(1)){
                case '(':
                    return ListOfCards[104]; 
                case 'P':
                    return ListOfCards[107];   
            }
        }
        
        




        return null;
        
        
    }
}
