package nutricao;

public interface Subject {
    void adicionaMedico(Observer o);
    void removeMedico(Observer o);
    void verificaSaude();
    Object getPesoAtual();
}
