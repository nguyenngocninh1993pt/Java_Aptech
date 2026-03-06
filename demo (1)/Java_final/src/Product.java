public class Product {
        private int id;
        private String name;
        private String thumbnail;
        private double price;
        private int qty;
        private String description;

        // Constructor mặc định
        public Product() {
        }

        public Product(int id, String name, String thumbnail, double price, int qty, String description) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.price = price;
        this.qty = qty;
        this.description = description;
    }

    // Getter và Setter
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if(price >= 0)
                this.price = price;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            if(qty >= 0)
                this.qty = qty;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        // Hiển thị thông tin sản phẩm
        public void displayInfo(){
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + qty);
            System.out.println("Description: " + description);
        }

        // Kiểm tra còn hàng
        public boolean checkAvailability(int orderQty){
            return orderQty > 0 && orderQty <= qty;
        }

        // Đặt hàng
        public double placeOrder(int orderQty){
            if(checkAvailability(orderQty)){
                qty -= orderQty;
                return orderQty * price;
            }
            return 0;
        }
}
