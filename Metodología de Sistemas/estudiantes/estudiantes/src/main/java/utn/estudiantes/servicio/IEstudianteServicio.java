package utn.estudiantes.servicio;

import utn.estudiantes.modelo.Estudiante;

public interface IEstudianteServicio {
    public List<Estudiante> listarEstudiantes();
    public Estudiante buscarEstudiantePorId(Integer idEstudiante);
    public void elimnarEstudiante(Estudiante estudiante);

}
