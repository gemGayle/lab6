package lab6;
/**
 * Головний клас для тестування застосування шаблону Strategy.
 * <p>
 * Цей клас демонструє, як можна динамічно змінювати стратегії малювання графіка,
 * використовуючи різні системи координат (декартову та полярну).
 */
public class Main {
    /**
     * Точка входу в програму.
     *
     * @param args аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        GraphRenderer renderer = new GraphRenderer();
        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};

        // Використання декартової системи координат
        renderer.setStrategy(new CartesianCoordinateSystem());
        renderer.render(data);

        // Зміна стратегії на полярну систему координат
        renderer.setStrategy(new PolarCoordinateSystem());
        renderer.render(data);
    }
}