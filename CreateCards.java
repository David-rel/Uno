import javax.swing.JButton;

public class CreateCards {

    static JButton RED_ONE = new JButton();
    static JButton RED_ZERO = new JButton();
    static JButton RED_TWO = new JButton();
    static JButton RED_THREE = new JButton();
    static JButton RED_FOUR = new JButton();
    static JButton RED_FIVE = new JButton();
    static JButton RED_SIX = new JButton();
    static JButton RED_SEVEN = new JButton();
    static JButton RED_EIGHT = new JButton();
    static JButton RED_NINE = new JButton();
    static JButton RED_SKIPP = new JButton();
    static JButton RED_REVERS = new JButton();
    static JButton RED_PLUS_2 = new JButton();

    static JButton GREEN_ONE = new JButton();
    static JButton GREEN_ZERO = new JButton();
    static JButton GREEN_TWO = new JButton();
    static JButton GREEN_THREE = new JButton();
    static JButton GREEN_FOUR = new JButton();
    static JButton GREEN_FIVE = new JButton();
    static JButton GREEN_SIX = new JButton();
    static JButton GREEN_SEVEN = new JButton();
    static JButton GREEN_EIGHT = new JButton();
    static JButton GREEN_NINE = new JButton();
    static JButton GREEN_SKIPP = new JButton();
    static JButton GREEN_REVERS = new JButton();
    static JButton GREEN_PLUS_2 = new JButton();

    static JButton BLUE_ONE = new JButton();
    static JButton BLUE_ZERO = new JButton();
    static JButton BLUE_TWO = new JButton();
    static JButton BLUE_THREE = new JButton();
    static JButton BLUE_FOUR = new JButton();
    static JButton BLUE_FIVE = new JButton();
    static JButton BLUE_SIX = new JButton();
    static JButton BLUE_SEVEN = new JButton();
    static JButton BLUE_EIGHT = new JButton();
    static JButton BLUE_NINE = new JButton();
    static JButton BLUE_SKIPP = new JButton();
    static JButton BLUE_REVERS = new JButton();
    static JButton BLUE_PLUS_2 = new JButton();

    static JButton YELLOW_ONE = new JButton();
    static JButton YELLOW_ZERO = new JButton();
    static JButton YELLOW_TWO = new JButton();
    static JButton YELLOW_THREE = new JButton();
    static JButton YELLOW_FOUR = new JButton();
    static JButton YELLOW_FIVE = new JButton();
    static JButton YELLOW_SIX = new JButton();
    static JButton YELLOW_SEVEN = new JButton();
    static JButton YELLOW_EIGHT = new JButton();
    static JButton YELLOW_NINE = new JButton();
    static JButton YELLOW_SKIPP = new JButton();
    static JButton YELLOW_REVERS = new JButton();
    static JButton YELLOW_PLUS_2 = new JButton();

    static JButton PLUS_4 = new JButton();
    static JButton REGULAR_WILD = new JButton();

    public static JButton[] Create(){

        JButton[] listOfCards = {RED_ZERO, RED_ONE, RED_TWO, RED_THREE, RED_FOUR, RED_FIVE, RED_SIX, RED_SEVEN, RED_EIGHT, RED_NINE, RED_SKIPP, RED_REVERS, RED_PLUS_2,
                                BLUE_ZERO, BLUE_ONE, BLUE_TWO, BLUE_THREE, BLUE_FOUR, BLUE_FIVE, BLUE_SIX, BLUE_SEVEN, BLUE_EIGHT, BLUE_NINE, BLUE_SKIPP, BLUE_REVERS, BLUE_PLUS_2,
                                GREEN_ZERO, GREEN_ONE, GREEN_TWO, GREEN_THREE, GREEN_FOUR, GREEN_FIVE, GREEN_SIX, GREEN_SEVEN, GREEN_EIGHT, GREEN_NINE, GREEN_SKIPP, GREEN_REVERS, GREEN_PLUS_2,
                                YELLOW_ZERO, YELLOW_ONE, YELLOW_TWO, YELLOW_THREE, YELLOW_FOUR, YELLOW_FIVE, YELLOW_SIX, YELLOW_SEVEN, YELLOW_EIGHT, YELLOW_NINE, YELLOW_SKIPP, YELLOW_REVERS, YELLOW_PLUS_2,
                                PLUS_4, REGULAR_WILD
                                };

        return listOfCards;
    }
}
