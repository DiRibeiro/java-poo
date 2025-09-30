package nutricao;

public class Almoco implements RefeicaoDiaria {
    private Refeicao refeicao;

    @Override
    public void preparar() {
        ValorNutricional vn = new ValorNutricional(35, 70, 15);
        refeicao = new RefeicaoAlmoco(vn);
        refeicao.solicitarPreparo();
    }

    @Override
    public Refeicao getRefeicao() {
        return refeicao;
    }
}
