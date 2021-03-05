package be.omichaela.bookshop.model;

public enum Color
{

    AQUA {
        @Override
        public String printColor() {
            String message = "Aqua is the color";
            return message;
        }},

    BLUE {
        @Override
        public String printColor() {
            String message = "Blue is the color";
            return message;
        }},

    BROWN {
        @Override
        public String printColor() {
            String message = "Brown is the color";
            return message;
        }},

    DARK_BLUE {
        @Override
        public String printColor() {
            String message = "Dark blue is the color";
            return message;
        }},

    FUCHSIA {
        @Override
        public String printColor() {
            String message = "Fuschia is the color";
            return message;
        }},

    GREY {
        @Override
        public String printColor() {
            String message = "Grey is the color";
            return message;
        }},

    IVORY {
        @Override
        public String printColor() {
            String message = "Ivory is the color";
            return message;
        }},

    JADE {
        @Override
        public String printColor() {
            String message = "Jade is the color";
            return message;
        }},

    MAGENTA {
        @Override
        public String printColor() {
            String message = "Magenta is the color";
            return message;
        }},

    MALACHITE {
        @Override
        public String printColor() {
            String message = "Malachite is the color";
            return message;
        }},

    PINK {
        @Override
        public String printColor() {
            String message = "Pink is the color";
            return message;
        }},

    WHITE {
    @Override
    public String printColor() {
        String message = "White is the color";
        return message;
    }},






    RED  {
        @Override
        public String printColor() {
            String message = "Red is the color";
            return message;
        }},

    PURPLE {
        @Override
        public String printColor() {
             String message = "Purple is the color";
             return message;
                }},





    YELLOW {
        @Override
        public String printColor() {
            String message = "Yellow is the color";
            return message;
        }},



    PLUM {
        @Override
        public String printColor() {
            String message = "Plum is the color";
            return message;
        }},

   ;


public Color[] getColor() {

        Color[] colors = Color.values();

        for (Color c : colors) {
            System.out.println(c);
        }
    return colors;
}}
