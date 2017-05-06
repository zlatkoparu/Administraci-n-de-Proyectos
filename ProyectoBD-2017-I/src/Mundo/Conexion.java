package Mundo;

import java.util.ArrayList;
import java.util.Date;

public class Conexion {

	public void recalcularPrioridadActividad(int idProyecto, int idActividad, int i) {
		// TODO Auto-generated method stub

	}

	public Actividad consultarActividadMayorPrioridad(int idActividad) {
		// TODO Auto-generated method stub
		return null;
	}

	public Proyecto consultarProyecto(int idProyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Actividad> consultarPorPrioridad(int idProyecto, int prioridad) {
		// TODO Auto-generated method stub
		return null;
	}

	public int darConsecutivoProyecto() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void crearNuevoProyecto(int consecutivo, String nombre, int iDGerente, Date fechaInicio, Date fechaFin) {
		// TODO Auto-generated method stub

	}

	public void crearTablaProyecto() {
		// TODO Auto-generated method stub

	}

	public void borrarTablaProyecto() {
		// TODO Auto-generated method stub

	}

	public void crearTablaActividad() {
		// TODO Auto-generated method stub

	}

	public void borrarTablaActividad() {
		// TODO Auto-generated method stub

	}

	public void crearTablaGerente() {
		// TODO Auto-generated method stub

	}

	public void borrarTablaGerente() {
		// TODO Auto-generated method stub

	}

	public void crearTablaCategoria() {
		// TODO Auto-generated method stub

	}

	public void borrarTablaCategoria() {
		// TODO Auto-generated method stub

	}

	public void crearTablaEstado() {
		// TODO Auto-generated method stub

	}

	public void borrarTablaEstado() {
		// TODO Auto-generated method stub

	}

	public void borrarProyecto(int iDProyecto) {
		// TODO Auto-generated method stub

	}

	public Actividad consultarActividad(int iDProyecto, int iDActividad) {
		// TODO Auto-generated method stub
		return null;
	}

	public int darConsecutivoActividad(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void crearNuevaActividad(int consecutivo, int prioridad, Date fechaInicio, Date fechaFin, String descripcion,
			String nombre, String temporalidad, int cantidadRepeticiones, int iDEstado, int iDCategoria) {
		// TODO Auto-generated method stub

	}

	public void completarActividad(int id, int iDActividad) {
		// TODO Auto-generated method stub
		
	}

	public void borrarActividad(int id, int iDActividad) {
		// TODO Auto-generated method stub
		
	}

	public int darConsecutivoCategoria() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void crearCategoria(int consecutivo, String nombre, String descripcion, double peso) {
		// TODO Auto-generated method stub
		
	}

	public int darConsecutivoEstado() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void crearEstado(int consecutivo, String nombre, String descripcion) {
		// TODO Auto-generated method stub
		
	}

	public void editarActividad(int id, int iDActividad, int prioridad, Date fechaInicio, Date fechaFin,
			String descripcion, String nombre, String temporalidad, int cantidadRepeticiones, int iDEstado,
			int iDCategoria) {
		// TODO Auto-generated method stub
		
	}

}
