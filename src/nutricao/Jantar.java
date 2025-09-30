package nutricao;

public class Jantar implements RefeicaoDiaria {
    private Refeicao refeicao;

    @Override
    public void preparar() {
        ValorNutricional vn = new ValorNutricional(18, 40, 8);
        refeicao = new RefeicaoJantar(vn);
        refeicao.solicitarPreparo();
    }

    @Override
    public Refeicao getRefeicao() {
        return refeicao;
    }
}
