public class Park {



    public class Attraction{
            private String name;
            private String workHour;
            private int price;

            public Attraction(String name, String workHour, int price) {
                this.name = name;
                this.workHour = workHour;
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getWorkHour() {
                return workHour;
            }

            public void setWorkHour(String workHour) {
                this.workHour = workHour;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public void getAttractionInfo() {
                System.out.println("Аттракцион: " + name + ", Часы работы: " + workHour + ", Цена:" + price);
            }

        @Override
        public String toString() {
            return "Аттракцион: " + name + ", Часы работы: " + workHour + ", Цена: " + price;
        }

        }

        public Attraction createAttraction(String name, String workHour, int price) {
        return new Attraction(name, workHour, price);
    }




}
