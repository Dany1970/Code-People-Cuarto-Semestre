//Parte 2
case 2 -> { // Listar estudiantes
        logger.info(nl+"Listado de estudiantes:" +nl;
        ver idEstudiante = Integer.parseInt(consola.nextLine());
        Estudaintes2022 estudiante =
                    estudianteServicio.buscarEstudiantePorId(idEstudiante;
                    if(estudainte !=null)
                    logger.info("Estudiante encontrado: " + estudiante +nl):
                    else 
                        logger.info("Estudiante No econtrado:"+ estudainte+ nl);
                    )))}
                    case 3 ->{//Agregar estudiante
                    logger.info("Agregar estudiante:" +nl;
                    logger.info("Nombre:");
                    var nombre = console.nextLine()
                    logger.info("Apellido:");
                    var apellido= consola.nextLine();
                    logger.info("Email.:");
                    var email = consola.nextLine();ç
                    // Crear el objeto estudainte sin el ide 
                    var estudiante = new Estudiante 2022()
                    estudiante.setNombte(nombre;
                    estudiante.setApellido(apellido);
                    estudiante.setTelefonp(telefono);
                    estudiante.setEmail(email);
                    estudianteServicio.guardarEstudiante (estudiante);
                    logger.info("Estudiante agregado" +estudiante+nl);
                    ))
                }

//Parte 3        
                case 4->// Modifica estudiante
                logger.info("Modificar estudiante:"+nl);
                logger.info("Ingrese el id estudiante:");
                var idEstudiante = Interger.parseInt(consola.nextLine());
                // buscamos el estudiante a modificar
                Estudiantes2022 estudiante =
                    estudianteServicio.buscarEstudiantePorId(idEstudiante);
                    if (estudiante !=null){
                        logger.info("Nombre:");
                        var nombre = consola.nextLine();
                        logger.info("Apellido:");
                        var apellido = consola.nextLine();
                        logger.info ("Telefono:");
                        var telefono = consola.nextLine();
                        logger.info ("Email:");
                        var email = consola.nextLine();
                        estudiante.setNombre(nombre);
                        estudiante.setApellido(apellido);
                        estudiante.setTelefono(telefono);
                        estudiante.setEmail(email);
                        estudianteServicio.guardarEstudiante(estudiante);
                        logger.info("Estudiante modificado: "+estudiante+nl);
                    }
                    else
                    logger.info("Estudiante No encontrado con el id :" +idEstudiante+nl);

                //Parte 4  eliminarEstudiante y salir
                case 5 -> { //Eliminar estudiante
                logger.info("Eliminar estudiante "+nl);
                logger.info("Digite el id estudiante:");
                var idEstudiante =Integer.parseInt(consola.nextLine());
                //Buscamos el id estudiante a elimnar
                var estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
                if ( estudiante != null){
                    estudianteServicio.eliminarEstudiante(estudiante);
                    logger.info("Estudiante eliminado:"+estudiante+nl);

                 } 
                else 
                logger.info("Estudiante NO encontrado con id :" +estudiante+nl);
            } 
            case 6 -> {//Salir
            logger.info("Hasta pronto! " +nl+nl);
            salir =true;
            }
            default -> logge.info("Opcion no reconocida" + opcion+nl);
            }//Fin swtich
            return salir;
            //Fin metodo ejecutarOpciones 
        }//Fin clase EstudiantesApplication
