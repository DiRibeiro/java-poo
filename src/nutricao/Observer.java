package nutricao;

public interface Observer {
    void solicitaAtendimento();
    void setSubject(Subject s);
}
