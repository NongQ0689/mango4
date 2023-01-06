import static java.lang.Math.max;
import static java.lang.Math.min;
public class BoundaryInterval implements Interval {
    private int leftBoundary;
    private int rightBoundary;
    public BoundaryInterval(int lb, int rb) {
        this.leftBoundary = lb;
        this.rightBoundary = rb;
    }
    public int getSmallestElement() {
        return leftBoundary;
    }
    public int getLargestElement() {
        return rightBoundary;
    }
    public Interval intersect(Interval r){
        if( rightBoundary < r.getSmallestElement() || leftBoundary > r.getLargestElement() ){
            return null;
        }else {
            return new BoundaryInterval(
                max(leftBoundary, r.getSmallestElement()),
                min(rightBoundary, r.getLargestElement()));
        }
    }
}