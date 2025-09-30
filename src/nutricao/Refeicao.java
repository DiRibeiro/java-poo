package nutricao;

public abstract class Refeicao {
    protected ValorNutricional valorNutricional;
    private boolean preparada = false;

    protected Refeicao(ValorNutricional v) {
        this.valorNutricional = v;
    }

    public ValorNutricional getValorNutricional() {
        return valorNutricional;
    }

    public void solicitarPreparo() {
        // aqui poderíamos disparar lógica de cozinha;
        // neste exemplo apenas marcamos como preparada
        this.preparada = true;
    }

    public boolean isPreparada() {
        return preparada;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " { " + valorNutricional + " }";
    }
}
