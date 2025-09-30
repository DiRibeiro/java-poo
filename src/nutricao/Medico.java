package nutricao;

public class Medico implements Observer, Pessoa {

    private String nome;
    private String especialidade;
    private Paciente paciente; // referência ao subject

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    @Override
    public void solicitaAtendimento() {
        String pacienteNome = (paciente != null) ? paciente.getNome() : "(sem paciente)";
        System.out.printf("🔔 %s (%s) convocado para atender %s!%n",
                nome, especialidade, pacienteNome);
    }

    @Override
    public void setSubject(Subject s) {
        if (s instanceof Paciente p) {
            this.paciente = p;
        }
    }

    @Override
    public void alteraNome(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public String getEspecialidade() { return especialidade; }
}
