package creational_patterns.builder_pattern;

public class House {

    private String foundation;
    private String structure;
    private String roof;


        // nested Builder class
    public static class Builder {

        private String foundation;
        private String structure;
        private String roof;

        public Builder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public Builder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public Builder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public House build() {
            House house = new House();

            house.foundation = this.foundation;
            house.structure = this.structure;
            house.roof = this.roof;

            return house;
        }
    }

    public void showDetails() {
        System.out.println("House with: \n" +
                foundation + ", " +
                structure + " and " +
                roof
        );
    }


}
