package classes.competicoes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendario {
    private int dia, mes, ano;
    private String dataAtual, diaS, mesS;

    public Calendario() {
        this.dia = 10;
        this.mes = 1;
        this.ano = 2020;           
        this.verifica();
        this.dataAtual = String.format("%s/%s/%d", diaS,mesS,ano);
    }
    private void verifica() {
        if (dia < 10) {
          this.diaS = "0" + this.dia;          
        } else {
            this.diaS = ""+dia;
        }
        if (mes < 10) {
            this.mesS = "0" +this.mes;
        }else {
            this.mesS = ""+mes;
        }
        
    }

    public String getDataAtual(){
        return dataAtual;
    }
    
    public String getProxData() {
        dia += 7;
        if (dia > 28) {
            mes+= 1;
            this.dia = 1;
        }
        verifica();
        dataAtual = String.format("%s/%s/%d", diaS,mesS,ano);
        return dataAtual;
    }
}
