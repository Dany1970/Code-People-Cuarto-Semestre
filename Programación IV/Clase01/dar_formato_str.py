# dar formato a un String

nombre = 'Ariel'
edad = 28
mensaje_con_formato = 'Mi nombre es %s y tengo %d años' % (nombre, edad)
print(mensaje_con_formato)

# Creamos una tupla
persona =('Carla', 'Gomez', 5000.00)
mensaje_con_formato = 'Hola %s %s. Tu sueldo es %.2f' # % persona # Aqui le pasamos el objeto que es tupla
print(mensaje_con_formato % persona)
