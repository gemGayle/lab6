package lab6;

/**
 * Клас для малювання графіка з можливістю зміни стратегії системи координат.
 */
public class GraphRenderer {
    private CoordinateSystemStrategy strategy;

    public void setStrategy(CoordinateSystemStrategy strategy) {
        this.strategy = strategy;
    }

    public void render(double[] data) {
        if (strategy != null) {
            strategy.drawGraph(data);
        } else {
            System.out.println("Стратегія не встановлена.");
        }
    }
}