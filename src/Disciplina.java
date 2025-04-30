package src;

public class Disciplina {
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private String situacao;
    private IMediaStrategy estrategia;

    Disciplina(IMediaStrategy estrategia){
        this.estrategia = estrategia;
    }

    public void calcularMedia(){
        media = estrategia.caucularMedia(p1,p2);
        situacao = estrategia.verificaSituacao(media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public String getSituacao() {
        return situacao;
    }

    public double getMedia() {
        return media;
    }
}
