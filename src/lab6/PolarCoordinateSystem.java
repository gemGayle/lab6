package lab6;

/**
 * Реалізація стратегії для полярної системи координат.
 */
public class PolarCoordinateSystem implements CoordinateSystemStrategy {
    @Override
    public void drawGraph(double[] data) {
        System.out.println("Малюю графік у полярній системі координат:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Точка: (r = " + data[i] + ", θ = " + Math.toDegrees(i) + "°)");
        }
    }
}