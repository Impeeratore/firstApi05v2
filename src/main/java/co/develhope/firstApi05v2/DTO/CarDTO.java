package co.develhope.firstApi05v2.DTO;

public class CarDTO {

        private String modelName;
        private String id;
        private double price;

        public CarDTO(){

        }

        public CarDTO(String id, String modelName, double price){
            this.id = id;
            this.modelName = modelName;
            this.price = price;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }
    }


