# Hackathon-2022

<<<<<<< Updated upstream
## Instructivo entorno virtual

Primero debemos instalar `virtualenv`, este es un complemento, con el que desde la terminal podemos crear un entorno virtual para un proyecto de desarrollo python. También este complemento nos permitirá levantar el entorno virtual.

Comando de instalación de `virtualenv`

```bash
pip install virtualenv
```

### Creación del entorno

Luego debemos entrar en la carpeta del repositorio `consultas_on_demand`, y ejecutar el siguiente comando.

```bash
virtualenv env
```
Si eso no funciona, probar
```bash
python -m virtualenv env

### Activación

Este comando creara un entorno virtual llamado `env`, que por la configuración que tiene el repositorio, sera ignorado por git.

Después debemos activar o levantar el entorno virtual, eso dependiendo de la terminal en la que nos encontremos variara el tipo de comando que debemos utilizar.

- En powershell:
    `env\Scripts\Activate.ps1`
- En cmd:
    `env\Scripts\Activate`
- En bash o GitBash:
    `source env/Scripts/activate`

¿Como podemos confirmar que activamos correctamente el entorno virtual?
Esto es bastante sencillo de darnos cuenta, el nombre del entorno virtual aparecerá antes de la linea de la consola/terminar entre paréntesis.

En la powershell se vera de esta manera:

```powershell
(env) PS C:\rep\nombre_proyecto>
```

En cmd se vera de la siguiente manera:

```cmd
(env) C:\rep\nombre_proyecto>
```

En GitBash se vera de la siguiente manera:

```gitbash
(env) 
usuario /c/rep/nombre_proyecto (main)
$
```

### Instalación de librerías

Una vez que hayamos activado correctamente el entorno virtual debemos instalar las configuraciones para nuestro proyecto. Para ello vamos a utilizar un archivo que se encuentra en el repositorio llamado `requirements.txt`. Este contiene una lista de todas las librerías de python para el proyecto.

El comando que debemos usar es el siguiente: (para que instale, entrar en la carpeta donde se encuentra el archivo requirements.txt)

```bash
pip install -r requirements.txt
```

Y LISTO terminamos con el proceso de instalación del entorno!!!!!

> Recordar que siempre que vayamos a desarrollar en el proyecto debemos activar el entorno virtual.

## Rama Plantillas

En esa rama se encuentra la arquitectura básica para el uso de plantillas `.html` y archivos `.css`. Esta es una estructura modularizada, donde las diferentes partes de la pagina se pueden trabajar de forma separada.
=======
Este archivo se actualiza con los cambios que hayan tenido que implementar cada uno al activar el entorno virtual, para dejar documentados todos los casos.
