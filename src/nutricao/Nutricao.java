package nutricao;

public class Nutricao {
    public void exec() {
        Medico m1 = new Medico("Dra. Clara", "Endocrinologia");
        Medico m2 = new Medico("Dr. Paulo", "Nutrologia");

        Paciente p = new Paciente("João", 99.4);
        p.adicionaMedico(m1);
        p.adicionaMedico(m2);

        RefeicaoDiaria cafe = new CafeManha();
        RefeicaoDiaria almoco = new Almoco();
        RefeicaoDiaria jantar = new Jantar();

        cafe.preparar();
        p.comer(cafe.getRefeicao());

        almoco.preparar();
        p.comer(almoco.getRefeicao());

        jantar.preparar();
        p.comer(jantar.getRefeicao());
    }
}
