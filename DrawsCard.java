import java.util.ArrayList;

import javax.swing.JButton;

public class DrawsCard {
    public static JButton Draws(String DrawnCard, JButton[] ListOfCards, ArrayList<String> PlayerHand, ArrayList<Integer> PlayerHandIndex){

        if (DrawnCard.charAt(0) == 'R'){
            switch(DrawnCard.charAt(1)){
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
        else if (DrawnCard.charAt(0) == 'B'){
            switch(DrawnCard.charAt(1)) {
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
        else if (DrawnCard.charAt(0) == 'G'){
            switch(DrawnCard.charAt(1)){
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
    else if (DrawnCard.charAt(0) == 'Y'){
        switch(DrawnCard.charAt(1)){
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
    else if (DrawnCard.charAt(0) == 'W'){
            
        switch(DrawnCard.charAt(1)){
            case '(':
                return ListOfCards[52]; 
            case 'P':
                return ListOfCards[53];   
        }
    }
    
    return null;
    }
}
