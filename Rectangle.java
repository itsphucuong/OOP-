public class Rectangle {
    private String name; // The name of the rectangle
    private String color; // The color of the rectangle
    private double width; // The width of the rectangle
    private double length; // The length of the rectangle

    // Constructor to initialize a rectangle object
    public Rectangle(String name, String color, double width, double length) {
        this.name = name; 
        this.color = color;
        this.width = width;
        this.length = length;
    }

    // Getters and setters for the rectangle's properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return (width + length) * 2;
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return width * length;
    }

    // Method to determine the type of the rectangle based on its perimeter
    public String getType() {
        if (getPerimeter() >= 10) {
            return "A";
        } else if (getPerimeter() >= 5) {
            return "B";
        } else {
            return "C";
        }
    }

    // Method to check if the rectangle is a square
    public boolean isSquare() {
        return width == length;
    }

    // Method to calculate the diagonal line of the rectangle
    public double calculateDiagonal() {
        return Math.sqrt(width * width + length * length);
    }

    // Method to resize the rectangle by a given rate
    public Rectangle resize(double rate) {
        width *= rate;
        length *= rate;
        return this;
    }

    // Method to return a string representation of the rectangle object
    @Override
    public String toString() {
        return "Rectangle [name=" + name + ", length=" + length + ", width=" + width +
               ", perimeter=" + getPerimeter() + ", type=" + getType() + "]";
    }
}
