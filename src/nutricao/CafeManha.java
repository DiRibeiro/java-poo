package nutricao;

public class CafeManha implements RefeicaoDiaria {
    private Refeicao refeicao;

    @Override
    public void preparar() {
        ValorNutricional vn = new ValorNutricional(20, 30, 10);
        refeicao = new RefeicaoCafeManha(vn);
        refeicao.solicitarPreparo(); // agora é void
    }

    @Override
    public Refeicao getRefeicao() {
        return refeicao;
    }
}
