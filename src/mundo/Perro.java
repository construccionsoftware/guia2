package mundo;

public class Perro {

	private String nombre;
	private String raza;
	private String localidad;
	private String propietario;
	private String cedulaPropietario;
	private String telefonoPropietario;
	private String diaAsistencia;
	
	public Perro()
	{
		
		
	}
	public Perro(String nombre, String raza, String localidad, String propietario, String cedulaPropietario,
			String telefonoPropietario, String diaAsistencia) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.localidad = localidad;
		this.propietario = propietario;
		this.cedulaPropietario = cedulaPropietario;
		this.telefonoPropietario = telefonoPropietario;
		this.diaAsistencia = diaAsistencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getCedulaPropietario() {
		return cedulaPropietario;
	}
	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}
	public String getTelefonoPropietario() {
		return telefonoPropietario;
	}
	public void setTelefonoPropietario(String telefonoPropietario) {
		this.telefonoPropietario = telefonoPropietario;
	}
	public String getDiaAsistencia() {
		return diaAsistencia;
	}
	public void setDiaAsistencia(String diaAsistencia) {
		this.diaAsistencia = diaAsistencia;
	}
	public String textPerro(String nombre, String raza, String Localidad, String prop, String cprop, String tprop, String dia)
	{
		return "Nombre:"+nombre+"\nRaza:"+raza+"\nLocalidad:"+localidad+"\nPropietario:"+prop+"\nCedula del propietario:"+cprop+"\nTelefono del propietario"+tprop+"\nDia de asisitencia:"+dia;
	}
}
