package be.omichaela.bookshop.model;

public enum Material {

    ACRYLIC {
        @Override
        public String printMaterial() {
            String message = "Material is acrylic";
            return message;
        }},

    CRYSTAL{
        @Override
        public String printMaterial() {
            String message = "Material is crystal";
            return message;
        }},

    GLASS {
        @Override
        public String printMaterial() {
            String message = "Material is glass";
            return message;
        }},

    LEATHER{
        @Override
        public String printMaterial() {
            String message = "Material is leather";
            return message;

        }},

    METAL {
        @Override
        public String printMaterial() {
            String message = "Material is metal";
            return message;
        }},

    PLASTIC{
        @Override
        public String printMaterial() {
            String message = "Material is plastic";
            return message;
        }},

    WOOD {
        @Override
        public String printMaterial() {
            String message = "Material is wood";
            return message;
        }};
}
