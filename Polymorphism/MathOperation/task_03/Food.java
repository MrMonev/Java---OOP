package Polymorphism.MathOperation.task_03;

public abstract class Food {

    private Integer quantity;

    protected Food(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
