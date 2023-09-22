package utn.estudiantes.servicio;

import utn.estudiantes.modelo.Estudiante;
import utn.estudiantes.modelo.Estudiantes2022;

public interface IEstudianteServicio {
    public List<Estudiantes2022>listarEstudiantes();
    public Estudiantes2022 buscarEstudiantePorId(Integer idEstudiantes2022);
    public void elimnarEstudiante(Estudiantes2022 estudiantes2022);
    public void guardarEstudiante(Estudiantes2022 estudiante);

}
