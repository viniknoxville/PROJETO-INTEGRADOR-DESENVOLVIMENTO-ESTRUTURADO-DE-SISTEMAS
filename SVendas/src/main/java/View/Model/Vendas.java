
package View.Model;

import java.util.Date;

public class Vendas {
    String cpf, codP;
    int num, quant;
    Date data;

    public Vendas() {
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String CPF) {
        this.cpf = cpf;
    }

    public String getCodP() {
        return codP;
    }

    public void setCodP(String CodP) {
        this.codP = codP;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
