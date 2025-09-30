package nutricao;

import java.util.ArrayList;
import java.util.List;

public class Paciente implements Subject, Pessoa {

    private String nome;
    private Double peso; // kg
    private final List<Observer> medicos = new ArrayList<>();

    public Paciente(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() { return nome; }
    public Double getPeso() { return peso; }

    // Comer uma refeição: aumenta levemente o peso e verifica saúde
    public void comer(Refeicao r) {
        // regra simples p/ exemplo: a cada 1000 kcal ganhe 0.2 kg
        double ganho = r.getValorNutricional().getValorEnergetico() / 1000.0 * 0.2;
        this.peso += ganho;
        System.out.printf("🍽️  %s comeu %s. Peso agora: %.2f kg%n",
                nome, r, peso);
        verificaSaude();
    }

    @Override
    public void adicionaMedico(Observer o) {
        if (!medicos.contains(o)) {
            medicos.add(o);
            o.setSubject(this);
        }
    }

    @Override
    public void removeMedico(Observer o) {
        medicos.remove(o);
    }

    @Override
    public void verificaSaude() {
        // regra do exercício: se peso > 100, solicita atendimento
        if (peso != null && peso > 100.0) {
            System.out.printf("⚠️  Alerta: %s com peso %.2f kg. Solicitando médicos...%n", nome, peso);
            for (Observer o : medicos) {
                o.solicitaAtendimento();
            }
        }
    }

    @Override
    public Object getPesoAtual() {
        return peso;
    }

    @Override
    public void alteraNome(String nome) {
        this.nome = nome;
    }
}
