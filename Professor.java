public class Professor extends Usuario
{
    private String areaAtuacao;
   
    public Professor(int mat, String nom, String log, String sen)
    {
        super(mat, nom, log, sen);
    }
   
    public String getAreaDeAtuacao()
    {
        return areaAtuacao;
    }
   
    public void setAreaDeAtuacao(String areaAtuacao)
    {
        this.areaAtuacao = areaAtuacao;
    }
}
