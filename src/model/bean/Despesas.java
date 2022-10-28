package model.bean;

public class Despesas {
    private int idDespesa;
    private String data;
    private double valor;
    private String produtoServico;

    public int getIdDespesa() {
        return idDespesa;
    }

    public void setIdDespesa(int idDespesa) {
        this.idDespesa = idDespesa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getProdutoServico() {
        return produtoServico;
    }

    public void setProdutoServico(String produtoServico) {
        this.produtoServico = produtoServico;
    }
}
