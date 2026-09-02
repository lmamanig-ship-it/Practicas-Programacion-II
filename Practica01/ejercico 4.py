import math

def promedio (datos):
    suma = 0

    for numero in datos:
        suma = suma + numero
    return suma /10

def desviacion(datos):
    prom = promedio(datos)
    suma = 0

    for numero in datos:
        suma = suma + (numero - prom) **2

    resultado = suma/9
    return math.sqrt(resultado)

# Programa Principal
datos = []

print("ingrese 10 numeros:")

for i in range(10):
    numero = float(input())
    datos.append(numero)

print("El promedio es:",round(promedio(datos), 2))
print("La esviacion estanar es:", round(desviacion(datos),5))
