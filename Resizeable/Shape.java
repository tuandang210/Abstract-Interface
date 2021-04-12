package Resizeable;

public class Shape {
    protected String color;
    protected Boolean filled;

    public Shape(){
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (this.filled) {
            return "A Shape with color of " + color + "and filled";
        } else {
            return "A Shape with color of " + color + "and not filled";
        }
    }
}
