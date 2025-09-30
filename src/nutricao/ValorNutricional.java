package nutricao;

public class ValorNutricional {
    private double proteinas;     // g
    private double carboidratos;  // g
    private double gorduras;      // g

    public ValorNutricional(double proteinas, double carboidratos, double gorduras) {
        this.proteinas = proteinas;
        this.carboidratos = carboidratos;
        this.gorduras = gorduras;
    }

    public double getProteinas() { return proteinas; }
    public double getCarboidratos() { return carboidratos; }
    public double getGorduras() { return gorduras; }

    // kcal = (P * 4) + (C * 4) + (G * 9)
    public double getValorEnergetico() {
        return (proteinas * 4.0) + (carboidratos * 4.0) + (gorduras * 9.0);
    }

    @Override
    public String toString() {
        return String.format("P: %.1fg, C: %.1fg, G: %.1fg (%.0f kcal)",
                proteinas, carboidratos, gorduras, getValorEnergetico());
    }
}
