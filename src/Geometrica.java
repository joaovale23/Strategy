package src;

public class Geometrica implements IMediaStrategy{
    @Override
    public double caucularMedia(double p1, double p2) {
        return Math.sqrt(p1*p2);
    }

    @Override
    public String verificaSituacao(double media) {
        if (media < 7)
            return "Reprovado!!";
        else
            return "Aprovado.";
    }
}
