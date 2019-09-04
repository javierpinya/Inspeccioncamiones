package com.javierpinya.inspeccioncamiones;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "SegundoComponente")
public class SegundoComponente {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String matricula;
    public Date itv;
    public Date adr;
    public int tara;
    public int pesoMaximo;
    public int chip;
    public String tipoComponente;
    public Date fechaCaducidadCalibracion;
    public int ejes;
    public boolean cargaPesados;
    public Date fechaBaja;
    public String codNacion;
    public boolean soloGasoleo;
    public boolean bloqueado;
    public boolean queroseno;

    public SegundoComponente(String matricula, Date itv, Date adr, int tara, int pesoMaximo, int chip, String tipoComponente, Date fechaCaducidadCalibracion, int ejes, boolean cargaPesados, Date fechaBaja, String codNacion, boolean soloGasoleo, boolean bloqueado, boolean queroseno) {
        this.matricula = matricula;
        this.itv = itv;
        this.adr = adr;
        this.tara = tara;
        this.pesoMaximo = pesoMaximo;
        this.chip = chip;
        this.tipoComponente = tipoComponente;
        this.fechaCaducidadCalibracion = fechaCaducidadCalibracion;
        this.ejes = ejes;
        this.cargaPesados = cargaPesados;
        this.fechaBaja = fechaBaja;
        this.codNacion = codNacion;
        this.soloGasoleo = soloGasoleo;
        this.bloqueado = bloqueado;
        this.queroseno = queroseno;
    }

    public int getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getItv() {
        return itv;
    }

    public void setItv(Date itv) {
        this.itv = itv;
    }

    public Date getAdr() {
        return adr;
    }

    public void setAdr(Date adr) {
        this.adr = adr;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    public Date getFechaCaducidadCalibracion() {
        return fechaCaducidadCalibracion;
    }

    public void setFechaCaducidadCalibracion(Date fechaCaducidadCalibracion) {
        this.fechaCaducidadCalibracion = fechaCaducidadCalibracion;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public boolean isCargaPesados() {
        return cargaPesados;
    }

    public void setCargaPesados(boolean cargaPesados) {
        this.cargaPesados = cargaPesados;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getCodNacion() {
        return codNacion;
    }

    public void setCodNacion(String codNacion) {
        this.codNacion = codNacion;
    }

    public boolean isSoloGasoleo() {
        return soloGasoleo;
    }

    public void setSoloGasoleo(boolean soloGasoleo) {
        this.soloGasoleo = soloGasoleo;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public boolean isQueroseno() {
        return queroseno;
    }

    public void setQueroseno(boolean queroseno) {
        this.queroseno = queroseno;
    }
}
