package src;

public class Aritmetica implements IMediaStrategy{

    @Override
    public double caucularMedia(double p1, double p2) {
        return (p1+p2)/2;
    }

    @Override
    public String verificaSituacao(double media) {
        if (media < 5)
            return "Reprovado!!";
        else
            return "Aprovado.";
    }
}
