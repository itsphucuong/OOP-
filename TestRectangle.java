public class TestRectangle {

    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
                // định dạng các ký tự màu
                String red = "\u001B[31m";
                String green = "\u001B[32m";
                String yellow = "\u001B[33m";
                String blue = "\u001B[34m";
                String purple = "\u001B[35m";
                String cyan = "\u001B[36m";
        
        
                System.out.print(blue + "  __  __ _    _  ____ _____     _____ _____ ______ __  __      ____   ____  _____     _ \n");
                System.out.print(purple + "|  \\/  | |  | |/ __ \\_   _|   |  __ \\_   _|  ____|  \\/  |    / __ \\ / __ \\|  __ \\   | |\n");
                System.out.print(cyan + "| \\  / | |  | | |  | || |     | |  | || | | |__  | \\  / |   | |  | | |  | | |__) |  | |\n");
                System.out.print(red + "| |\\/| | |  | | |  | || |     | |  | || | |  __| | |\\/| |   | |  | | |  | |  ___/   | |\n");
                System.out.print(yellow + "| |  | | |__| | |__| || |_    | |__| || |_| |____| |  | |   | |__| | |__| | |       |_|\n");
                System.out.println(green + "|_|  |_|\\____/ \\____/_____|   |_____/_____|______|_|  |_|    \\____/ \\____/|_|       (_)" +blue+" - Phu Cuong chuc cau ! ");
                
        //Thong bao
        System.out.println("\n__________________TESTCASE RECTANGLE _ THI GK OOP _ JAVA__________________\n");
        // tao hinh chu nhat rong 6 dai 8
        Rectangle rect = new Rectangle("Ruby", "Red", 6, 8);

        // Kiem tra get type
        System.out.println(ANSI_PURPLE + "# Loai hinh chu nhat: " + ANSI_RESET + rect.getType());

        // kiem tra method toString
        System.out.println(ANSI_CYAN + "# Thong tin hinh chu nhat: " + ANSI_RESET + rect.toString());

        // Kiem tra phuong thuc getWidth và getHeight
        System.out.println(ANSI_YELLOW + "# Chieu rong hinh chu nhat: " + ANSI_RESET + rect.getWidth());
        System.out.println(ANSI_YELLOW + "# Chieu cao hinh chu nhat: " + ANSI_RESET + rect.getLength());

        // Kiem tra phuong thuc setWidth và setHeight
        rect.setWidth(10);
        rect.setLength(12);
        System.out.println(ANSI_BLUE + "# Thong tin hinh chu nhat sau khi thay doi: " + ANSI_RESET + rect.toString());

        // Kiem tra phuong thuc getArea và getPerimeter
        System.out.println(ANSI_GREEN + "# Dien tich hinh chu nhat: " + ANSI_RESET + rect.getArea());
        System.out.println(ANSI_GREEN + "# Chu vi hinh chu nhat: " + ANSI_RESET + rect.getPerimeter());

        // Kiem tra phuong thuc resize
        System.out.println(ANSI_PURPLE + "# test Resize _ before :" + ANSI_RESET + rect.toString()); // hiển thị thông tin ban đầu của hình chữ nhật
        rect.resize(1.5);
        System.out.println(ANSI_CYAN + "# test Resize _ after :" + ANSI_RESET + rect.toString()); // hiển thị thông tin sau khi resize
    }
}
