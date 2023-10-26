# PPS- APlicación web- Consultas_on_demand

<<<<<<< Updated upstream
## Instructivo instalación de entorno virtual

Primero debemos instalar `virtualenv`, este es un complemento, con el que desde la terminal podemos crear un entorno virtual para un proyecto de desarrollo python. También este complemento nos permitirá levantar el entorno virtual.
Si la instalación da error, es posible que ya esté instalado. Para estar seguros, esto puede chequearse: si usas Windows, la forma más fácil de saber qué librerías de Python tienes instaladas es abrir el símbolo del sistema o git bash y escribir el siguiente comando: "pip freeze" 
Si no está instalada, entonces, procedemos con:
Comando de instalación de `virtualenv`

```bash
pip install virtualenv
```

### Creación del entorno

Luego debemos entrar en la carpeta del repositorio `practica_profecional`, y ejecutar el siguiente comando.

```bash
virtualenv env
```
Si esto no funciona (dará un mensaje de error), probar con:
```bash
python -m virtualenv env
```
### Activación

Este comando creara un entorno virtual llamado `env`. Aparece una carpeta con ese nombre dentro del repo local, que por la configuración que tiene el repositorio, sera ignorado por git (uno de los archivos es un git.ignore)

Después debemos activar o levantar el entorno virtual, eso dependiendo de la terminal en la que nos encontremos variara el tipo de comando que debemos utilizar.

- En powershell: (VSC usamos Power Shell, fijarse de tener instalada la extensión PowerShell)
    `env\Scripts\Activate.ps1`
- En cmd:
    `env\Scripts\Activate`
- En bash o GitBash:
    `source env/Scripts/activate`

¿Como podemos confirmar que activamos correctamente el entorno virtual?
Esto es bastante sencillo de darnos cuenta, el nombre del entorno virtual aparecerá antes de la linea de la consola/terminar entre paréntesis.

En la powershell se vera de esta manera:

```powershell
(env) PS C:\rep\hackathon-2022>
```

En cmd se vera de la siguiente manera:

```cmd
(env) C:\rep\hackathon-2022>
```

En GitBash se vera de la siguiente manera:

```gitbash
(env) 
xxxxxxxxxx MINGW64 /c/rep/practica_profecional (main)
$
```

### Instalación de librerías

Una vez que hayamos activado correctamente el entorno virtual debemos instalar las configuraciones para nuestro proyecto. Para ello vamos a utilizar un archivo que se encuentra en el repositorio llamado `requirements.txt`. Este contiene una lista de todas las librerías de python para el proyecto.

El comando que debemos usar es el siguiente:

```bash
pip install -r requirements.txt
```

Y LISTO terminamos con el proceso de instalación del entorno!!!!!

> Recordar que siempre que vayamos a desarrollar en el proyecto debemos activar el entorno virtual.

## Rama Plantillas

En esa rama se encuentra la arquitectura básica para el uso de plantillas `.html` y archivos `.css`. Esta es una estructura modularizada, donde las diferentes partes de la pagina se pueden trabajar de forma separada.
=======
