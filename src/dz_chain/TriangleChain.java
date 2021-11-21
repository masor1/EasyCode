package dz_chain;

public abstract class TriangleChain implements Square{

    private TriangleChain next;

    public void setNext(TriangleChain next) {
        this.next = next;
    }

    public double getSquare(Triangle triangle) {
        return 0;
    }
}
