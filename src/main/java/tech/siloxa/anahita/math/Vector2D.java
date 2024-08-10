package tech.siloxa.anahita.math;

public class Vector2D {

    private Float x;
    private Float y;

    public Vector2D(Vector2D vector2D) {
        this(vector2D.x, vector2D.y);
    }

    public Vector2D(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public void add(Vector2D augend) {
        x += augend.x;
        y += augend.y;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public void setVector(Vector2D vector2D) {
        x = vector2D.x;
        y = vector2D.y;
    }
}
