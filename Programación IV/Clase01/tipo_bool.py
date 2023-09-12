# Bool contiene los valores True y False
# Los tipos numéricos es false para el 0 y True para el resto (incluso negativos)
# también es válido para float

valor = 0
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 3.0
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

# Tipo string -> False para las comillas vacías: '', True para los demás valores
valor = ''
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 'Hola'
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

# Tipo colecciones -> False para colecciones vacías, True todas las demás
# Ejemplo para una lista
lista = {}
resultado = bool(lista)
print(f'lista: {lista}, Resultado: {resultado}')

lista = {1, 2, 3}
resultado = bool(lista)
print(f'lista: {lista}, Resultado: {resultado}')

# Tupla
tupla = ()
resultado = bool(tupla)
print(f'tupla: {tupla}, Resultado: {resultado}')

tupla = (5,)
resultado = bool(tupla)
print(f'tupla: {tupla}, Resultado: {resultado}')

#Diccionario
dicc = {}
resultado = bool(dicc)
print(f'valor de un diccionario vacío: {dicc}, resultado: {resultado}')

dicc = {'Nombre': 'Juan', 'Apellido': 'Pérez'}
resultado = bool(dicc)
print(f'valor de un diccionario con elementos: {dicc}, resultado: {resultado}')

#Sentencias de control con bool
if '':
    print('Regresa verdadero')
else:
    print('Regresa falso')

if 'Hola':
    print('Regresa verdadero')
else:
    print('Regresa falso')

# y así se puede probar la sentencia
# de control con cualquiera de los tipos que vimos antes

# ciclos (trabajando de la misma manera)
variable = 3
while variable:
    print('Regresa verdadero')
    break
else:
    print('Regresa falso')
# ponerle un fin para que no sea infinito cuando es True

variable = 0
while variable:
    print('Regresa verdadero')
    break
else:
    print('Regresa falso')
# ponerle un fin para que no sea infinito cuando es True


