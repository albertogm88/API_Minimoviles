package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tarifas database table.
 * 
 */
@Entity
@Table(name="tarifas")
@NamedQuery(name="Tarifa.findAll", query="SELECT t FROM Tarifa t")
public class Tarifa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tarifa")
	private int idTarifa;

	@Column(name="afiliado_link")
	private int afiliadoLink;

	@Column(name="bono_megas")
	private int bonoMegas;

	@Column(name="bono_megas_agotado_velocidad")
	private int bonoMegasAgotadoVelocidad;

	@Column(name="bono_minutos")
	private int bonoMinutos;

	@Column(name="bono_precio_establecimiento")
	private double bonoPrecioEstablecimiento;

	@Column(name="bono_sms")
	private int bonoSms;

	@Column(name="consumo_minimo")
	private double consumoMinimo;

	@Lob
	private String contenido;

	@Column(name="cuota_mensual")
	private double cuotaMensual;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_expiration")
	private Date dateExpiration;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_update")
	private Date dateUpdate;

	@Column(name="datos_segunda_sim")
	private int datosSegundaSim;

	@Column(name="datos_segunda_sim_precio")
	private double datosSegundaSimPrecio;

	@Column(name="id_operador")
	private int idOperador;

	private double iva;

	@Column(name="llamadas_ilimitadas")
	private int llamadasIlimitadas;

	@Column(name="llamadas_ilimitadas_destinos_maximos")
	private int llamadasIlimitadasDestinosMaximos;

	private int lte;

	@Column(name="megas_bloque")
	private int megasBloque;

	@Column(name="megas_bloque_precio")
	private double megasBloquePrecio;

	@Column(name="minutos_gratis_por_llamada")
	private int minutosGratisPorLlamada;

	@Column(name="minutos_gratis_por_llamada_mismo_operador")
	private int minutosGratisPorLlamadaMismoOperador;

	private String nicename;

	private String nombre;

	private int postpago;

	@Column(name="precio_establecimiento")
	private double precioEstablecimiento;

	@Column(name="precio_por_mega")
	private double precioPorMega;

	@Column(name="precio_por_minuto")
	private double precioPorMinuto;

	@Column(name="precio_sms")
	private double precioSms;

	private int prepago;

	@Column(name="sms_ilimitados")
	private int smsIlimitados;

	private byte vigente;

	private int voip;

	public Tarifa() {
	}

	public int getIdTarifa() {
		return this.idTarifa;
	}

	public void setIdTarifa(int idTarifa) {
		this.idTarifa = idTarifa;
	}

	public int getAfiliadoLink() {
		return this.afiliadoLink;
	}

	public void setAfiliadoLink(int afiliadoLink) {
		this.afiliadoLink = afiliadoLink;
	}

	public int getBonoMegas() {
		return this.bonoMegas;
	}

	public void setBonoMegas(int bonoMegas) {
		this.bonoMegas = bonoMegas;
	}

	public int getBonoMegasAgotadoVelocidad() {
		return this.bonoMegasAgotadoVelocidad;
	}

	public void setBonoMegasAgotadoVelocidad(int bonoMegasAgotadoVelocidad) {
		this.bonoMegasAgotadoVelocidad = bonoMegasAgotadoVelocidad;
	}

	public int getBonoMinutos() {
		return this.bonoMinutos;
	}

	public void setBonoMinutos(int bonoMinutos) {
		this.bonoMinutos = bonoMinutos;
	}

	public double getBonoPrecioEstablecimiento() {
		return this.bonoPrecioEstablecimiento;
	}

	public void setBonoPrecioEstablecimiento(double bonoPrecioEstablecimiento) {
		this.bonoPrecioEstablecimiento = bonoPrecioEstablecimiento;
	}

	public int getBonoSms() {
		return this.bonoSms;
	}

	public void setBonoSms(int bonoSms) {
		this.bonoSms = bonoSms;
	}

	public double getConsumoMinimo() {
		return this.consumoMinimo;
	}

	public void setConsumoMinimo(double consumoMinimo) {
		this.consumoMinimo = consumoMinimo;
	}

	public String getContenido() {
		return this.contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public double getCuotaMensual() {
		return this.cuotaMensual;
	}

	public void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	public Date getDateExpiration() {
		return this.dateExpiration;
	}

	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public Date getDateUpdate() {
		return this.dateUpdate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public int getDatosSegundaSim() {
		return this.datosSegundaSim;
	}

	public void setDatosSegundaSim(int datosSegundaSim) {
		this.datosSegundaSim = datosSegundaSim;
	}

	public double getDatosSegundaSimPrecio() {
		return this.datosSegundaSimPrecio;
	}

	public void setDatosSegundaSimPrecio(double datosSegundaSimPrecio) {
		this.datosSegundaSimPrecio = datosSegundaSimPrecio;
	}

	public int getIdOperador() {
		return this.idOperador;
	}

	public void setIdOperador(int idOperador) {
		this.idOperador = idOperador;
	}

	public double getIva() {
		return this.iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public int getLlamadasIlimitadas() {
		return this.llamadasIlimitadas;
	}

	public void setLlamadasIlimitadas(int llamadasIlimitadas) {
		this.llamadasIlimitadas = llamadasIlimitadas;
	}

	public int getLlamadasIlimitadasDestinosMaximos() {
		return this.llamadasIlimitadasDestinosMaximos;
	}

	public void setLlamadasIlimitadasDestinosMaximos(int llamadasIlimitadasDestinosMaximos) {
		this.llamadasIlimitadasDestinosMaximos = llamadasIlimitadasDestinosMaximos;
	}

	public int getLte() {
		return this.lte;
	}

	public void setLte(int lte) {
		this.lte = lte;
	}

	public int getMegasBloque() {
		return this.megasBloque;
	}

	public void setMegasBloque(int megasBloque) {
		this.megasBloque = megasBloque;
	}

	public double getMegasBloquePrecio() {
		return this.megasBloquePrecio;
	}

	public void setMegasBloquePrecio(double megasBloquePrecio) {
		this.megasBloquePrecio = megasBloquePrecio;
	}

	public int getMinutosGratisPorLlamada() {
		return this.minutosGratisPorLlamada;
	}

	public void setMinutosGratisPorLlamada(int minutosGratisPorLlamada) {
		this.minutosGratisPorLlamada = minutosGratisPorLlamada;
	}

	public int getMinutosGratisPorLlamadaMismoOperador() {
		return this.minutosGratisPorLlamadaMismoOperador;
	}

	public void setMinutosGratisPorLlamadaMismoOperador(int minutosGratisPorLlamadaMismoOperador) {
		this.minutosGratisPorLlamadaMismoOperador = minutosGratisPorLlamadaMismoOperador;
	}

	public String getNicename() {
		return this.nicename;
	}

	public void setNicename(String nicename) {
		this.nicename = nicename;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPostpago() {
		return this.postpago;
	}

	public void setPostpago(int postpago) {
		this.postpago = postpago;
	}

	public double getPrecioEstablecimiento() {
		return this.precioEstablecimiento;
	}

	public void setPrecioEstablecimiento(double precioEstablecimiento) {
		this.precioEstablecimiento = precioEstablecimiento;
	}

	public double getPrecioPorMega() {
		return this.precioPorMega;
	}

	public void setPrecioPorMega(double precioPorMega) {
		this.precioPorMega = precioPorMega;
	}

	public double getPrecioPorMinuto() {
		return this.precioPorMinuto;
	}

	public void setPrecioPorMinuto(double precioPorMinuto) {
		this.precioPorMinuto = precioPorMinuto;
	}

	public double getPrecioSms() {
		return this.precioSms;
	}

	public void setPrecioSms(double precioSms) {
		this.precioSms = precioSms;
	}

	public int getPrepago() {
		return this.prepago;
	}

	public void setPrepago(int prepago) {
		this.prepago = prepago;
	}

	public int getSmsIlimitados() {
		return this.smsIlimitados;
	}

	public void setSmsIlimitados(int smsIlimitados) {
		this.smsIlimitados = smsIlimitados;
	}

	public byte getVigente() {
		return this.vigente;
	}

	public void setVigente(byte vigente) {
		this.vigente = vigente;
	}

	public int getVoip() {
		return this.voip;
	}

	public void setVoip(int voip) {
		this.voip = voip;
	}

}