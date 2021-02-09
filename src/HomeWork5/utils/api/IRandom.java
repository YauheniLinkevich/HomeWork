package HomeWork5.utils.api;

public interface IRandom {

    int randInt(int lowerBorder, int upperBorder);
    double randDouble(double lowerBorder, double upperBorder);
    String randString(int lowerBorder, int upperBorder, int randomType);
    boolean randBoolean();
}
