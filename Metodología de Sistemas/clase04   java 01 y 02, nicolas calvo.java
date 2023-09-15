package utn.estudiantes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import utn.estudiante.modelo.Estudiante;
import utn.estudiantes.repositorio.EstudainteRepositirio;

import java.util.list;

@Service

public class EstudiantServicio Implements IEstudaianteServicio {

   @Autowired
    private EstudianteServicio Implements IEstudianteServicio  {

    }

 @Override 

  public List <Estudiantes> listarEstudiantes()  }
        List <Estudiante> estudiantes = estudianteRepsotorio.findAll();
        return estudiante;

    
  @Override 
  public Estudiante buscarEstudiantePorId (Integer idEstudiante) {
    Estudiante estudiante = EstudainteRepositirio.findById(idEstudiante).orElse(null);
    return estudiante;
    


  }
    }


