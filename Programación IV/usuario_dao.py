from logger_base import log

class UsuarioDAO:
"""
____
DAO -> Data acces objetc para la tabla usuario
CRUD-> Create-Read-Update-Delete
___
""""
_SELECT = "SELECT * FROM usuario ORDER NY id usuario"
_INSERTAR= "INSERT INTO usuario (username,password) VALUE (%s,%s)"
_ACTUALIZAR= " UPDATE usuario SET username=%s,password=%s WHERE id_usuario=%s"
_ELIMINAR = "DELETE FROM usuario WHERE id_usuario=%s"

@classmethod 
def seleccionar(cls):
    with CursosDelPool() as cursor:
        log.debug("Seleccionando usuario")
        curso.execute(cls.SELECT)
        registros = cursor.fetchall()
        usuarios= []
        for registro in registros:
        usuario = Usuario (registro[0],registro[1],registro [2])
        usuarios.apped(usuario)
 return usuarios 

@classmethod
    def insertar (cls,usuario):
 with CursorDelPool() as cursor:
    log.debug(f"Usuario a insertar:{usuario} ")
    valores = (usuario.username, usuario.password)
    cursor.execute(cls._INSERTAR,valores)
    return cursor.rowcount

@classmethod 
def actualizar(cls,usuario):
    with CursorDelPool() as cursor: 
        log.debug(f"Usuario a actualizar:{usuario} ")
        valores = (usuario.username, usuario.password,usuario.id_usuario)
        cursor.excute(cls._ACTUALIZAR,valores)
        return cursor.rowcount

@classmethod
def eliminar (cls,usuario):
    with CursorDelPool as cursor:
        log.debug(f"Usuario a eliminar: ´{usuario}")
        valores = (usuario.id_usuario,)
        cursor.execute(cls._ELIMINAR, valores)
        return cursor.rowcount

if __ name __== "__main__":
    #Eliminar usuario 
    usuario =Usuario (id_usuario=3)
    usuario_eliminado= UsuarioDAO.eliminar(usuario)
    log.debug(f"Usuario modificado: { usuario_modificado}")

    # Actualizar usuario
    usuario= Usuario (id_usuario=1, username="",password="321")
    usuario_insertado =UsuarioDAO,insertar (usuario)
    log.debug(f"Usuario insertado: {usuario_insertado}")

# Listar o seleccionar 
usuarios= Usuario.DAO.seleccionar()
for usuario in usuarios:
  log.debug(usuario)
  


