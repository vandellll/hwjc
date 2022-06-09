import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();
    private static int amount = 0;
    private int id;

    public Box() {
        amount++;
        id = amount;
    }

    public void add(T newFruit) {
        fruits.add(newFruit);
    }

    public float getWeight() {
        float sum = 0.0f;
        for (T fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compare(Box box) {
        return (this.getWeight() == box.getWeight());
    }

    public void poor(Box<T> box) {
        for (T fruit : fruits) {
            box.add(fruit);
        }
        this.fruits.clear();
    }

    @Override
    public String toString() {
        String temp;
        if (fruits.size() == 0) return "Box" + id + " is empty";
        else return "Box" + id + " contains " + fruits.size() + " " + fruits.get(0).getClass().getSimpleName();
    }
}