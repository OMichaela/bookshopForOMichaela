package be.omichaela.bookshop.model;

public enum Color

{

    AQUA {
        @Override
        public String printColor() {
            String message = "The color is aqua";
            return message;
        }},

    BLUE {
        @Override
        public String printColor() {
            String message = "The color is blue";
            return message;
        }},

    BROWN {
        @Override
        public String printColor() {
            String message = "The color is brown";
            return message;
        }},

    DARK_BLUE {
        @Override
        public String printColor() {
            String message = "The color is dark blue";
            return message;
        }},

    FUCHSIA {
        @Override
        public String printColor() {
            String message = "The color is fuchsia";
            return message;
        }},

    GREY {
        @Override
        public String printColor() {
            String message = "The color is grey";
            return message;
        }},

    IVORY {
        @Override
        public String printColor() {
            String message = "The color is ivory";
            return message;
        }},

    JADE {
        @Override
        public String printColor() {
            String message = "The color is jade";
            return message;
        }},

    MAGENTA {
        @Override
        public String printColor() {
            String message = "The color is magenta";
            return message;
        }},

    MALACHITE {
        @Override
        public String printColor() {
            String message = "The color is malachite";
            return message;
        }},

    PINK {
        @Override
        public String printColor() {
            String message = "The color is pink";
            return message;
        }},


    RED  {
        @Override
        public String printColor() {
            String message = "The color is red";
            return message;
        }},

    PLUM {
        @Override
        public String printColor() {
            String message = "The color is plum";
            return message;
        }},

    PURPLE {
        @Override
        public String printColor() {
             String message = "The color is purple";
             return message;
                }},

    WHITE {
        @Override
        public String printColor() {
            String message = "The color is white";
            return message;
        }},

    YELLOW {
        @Override
        public String printColor() {
            String message = "The color is yellow";
            return message;
        }};


    private Color (Color color) {
        this.color = color;

    };


    public Color[] getColor() {

        Color[] colors = Color.values();

        for (Color c : colors) {
            System.out.println(c);
        }
    return colors;
}}
