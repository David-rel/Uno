import javax.swing.ImageIcon;

public class CreateCardIcons {

    static ImageIcon GREEN_0 = new ImageIcon("pics/Green0.png");
    static ImageIcon GREEN_1 = new ImageIcon("pics/Green1.png");
    static   ImageIcon GREEN_2 = new ImageIcon("pics/Green2.png");
    static    ImageIcon GREEN_3 = new ImageIcon("pics/Green3.png");
    static    ImageIcon GREEN_4 = new ImageIcon("pics/Green4.png");
    static    ImageIcon GREEN_5 = new ImageIcon("pics/Green5.png");
    static ImageIcon GREEN_6 = new ImageIcon("pics/Green6.png");
    static ImageIcon GREEN_7= new ImageIcon("pics/Green7.png");
    static ImageIcon GREEN_8 = new ImageIcon("pics/Green8.png");
    static ImageIcon GREEN_9 = new ImageIcon("pics/Green9.png");
    static ImageIcon GREEN_SKIP = new ImageIcon("pics/GreenSkip.png");
    static ImageIcon GREEN_REVERSE = new ImageIcon("pics/GreenReverse.png");
        static ImageIcon GREEN_DRAW_2 = new ImageIcon("pics/GreenPlusTwo.png");

        static ImageIcon RED_0 = new ImageIcon("pics/Red0.png");
        static ImageIcon RED_1 = new ImageIcon("pics/Red1.png");
        static    ImageIcon RED_2 = new ImageIcon("pics/Red2.png");
        static    ImageIcon RED_3 = new ImageIcon("pics/Red3.png");
        static    ImageIcon RED_4 = new ImageIcon("pics/Red4.png");
        static    ImageIcon RED_5 = new ImageIcon("pics/Red5.png");
        static ImageIcon RED_6 = new ImageIcon("pics/Red6.png");
        static ImageIcon RED_7= new ImageIcon("pics/Red7.png");
        static ImageIcon RED_8 = new ImageIcon("pics/Red8.png");
        static ImageIcon RED_9 = new ImageIcon("pics/Red9.png");
        static ImageIcon RED_SKIP = new ImageIcon("pics/RedSkip.png");
        static ImageIcon RED_REVERSE = new ImageIcon("pics/RedReverse.png");
            static ImageIcon RED_DRAW_2 = new ImageIcon("pics/RedPlusTwo.png");


            static ImageIcon BLUE_0 = new ImageIcon("pics/Blue0.png");
            static ImageIcon BLUE_1 = new ImageIcon("pics/Blue1.png");
            static    ImageIcon BLUE_2 = new ImageIcon("pics/Blue2.png");
            static    ImageIcon BLUE_3 = new ImageIcon("pics/Blue3.png");
            static    ImageIcon BLUE_4 = new ImageIcon("pics/Blue4.png");
            static    ImageIcon BLUE_5 = new ImageIcon("pics/Blue5.png");
            static ImageIcon BLUE_6 = new ImageIcon("pics/Blue6.png");
            static ImageIcon BLUE_7= new ImageIcon("pics/Blue7.png");
            static ImageIcon BLUE_8 = new ImageIcon("pics/Blue8.png");
            static ImageIcon BLUE_9 = new ImageIcon("pics/Blue9.png");
            static ImageIcon BLUE_SKIP = new ImageIcon("pics/BlueSkip.png");
            static ImageIcon BLUE_REVERSE = new ImageIcon("pics/BlueReverse.png");
                static ImageIcon BLUE_DRAW_2 = new ImageIcon("pics/BluePlusTwo.png");

                static ImageIcon YELLOW_0 = new ImageIcon("pics/Yellow0.png");
                static ImageIcon YELLOW_1 = new ImageIcon("pics/Yellow1.png");
                static    ImageIcon YELLOW_2 = new ImageIcon("pics/Yellow2.png");
                static    ImageIcon YELLOW_3 = new ImageIcon("pics/Yellow3.png");
                static    ImageIcon YELLOW_4 = new ImageIcon("pics/Yellow4.png");
                static    ImageIcon YELLOW_5 = new ImageIcon("pics/Yellow5.png");
                static ImageIcon YELLOW_6 = new ImageIcon("pics/Yellow6.png");
                static ImageIcon YELLOW_7= new ImageIcon("pics/Yellow7.png");
                static ImageIcon YELLOW_8 = new ImageIcon("pics/Yellow8.png");
                static ImageIcon YELLOW_9 = new ImageIcon("pics/Yellow9.png");
                static ImageIcon YELLOW_SKIP = new ImageIcon("pics/YellowSkip.png");
                static ImageIcon YELLOW_REVERSE = new ImageIcon("pics/YellowReverse.png");
                    static ImageIcon YELLOW_DRAW_2 = new ImageIcon("pics/YellowPlusTwo.png");


        static    ImageIcon WILD_PLUS_4 = new ImageIcon("pics/PlusFour.png");
        static    ImageIcon WILD = new ImageIcon("pics/Wild.png");

    public static ImageIcon[] Create(){

        ImageIcon[] listOfCardIcons = {RED_0, RED_1, RED_2, RED_3, RED_4, RED_5, RED_6, RED_7, RED_8, RED_9, RED_SKIP, RED_REVERSE, RED_DRAW_2,
                                    BLUE_0, BLUE_1, BLUE_2, BLUE_3, BLUE_4, BLUE_5, BLUE_6, BLUE_7, BLUE_8, BLUE_9, BLUE_SKIP, BLUE_REVERSE, BLUE_DRAW_2,
                                    GREEN_0, GREEN_1, GREEN_2, GREEN_3, GREEN_4, GREEN_5, GREEN_6, GREEN_7, GREEN_8, GREEN_9, GREEN_SKIP, GREEN_REVERSE, GREEN_DRAW_2,
                                    YELLOW_0, YELLOW_1, YELLOW_2, YELLOW_3, YELLOW_4, YELLOW_5, YELLOW_6, YELLOW_7, YELLOW_8, YELLOW_9, YELLOW_SKIP, YELLOW_REVERSE, YELLOW_DRAW_2,
                                    WILD, WILD_PLUS_4
                                    };

        return listOfCardIcons;

    }
}
