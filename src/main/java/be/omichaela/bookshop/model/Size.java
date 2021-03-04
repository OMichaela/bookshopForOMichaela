package be.omichaela.bookshop.model;

public enum Size { SMALL('S'), MEDIUM('M'), LARGE('L'), EXTRA_LARGE('XL');

public Size getSize() {


        switch(this) {
            case SMALL:
                return "small";

            case MEDIUM:
                return "medium";

            case LARGE:
                return "large";

            case EXTRA_LARGE;
                return "extra large";

            default:
                return null;
        }
    }

}
