public interface Interval {
    int getSmallestElement();
    int getLargestElement();
    Interval intersect(Interval r);
}