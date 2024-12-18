package lab6;

/**
 * Реалізація стратегії для декартової системи координат.
 */
public class CartesianCoordinateSystem implements CoordinateSystemStrategy {
    @Override
    public void drawGraph(double[] data) {
        System.out.println("Малюю графік у декартовій системі координат:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Точка: (x = " + i + ", y = " + data[i] + ")");
        }
    }
}