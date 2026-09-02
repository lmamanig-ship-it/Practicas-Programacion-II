import time


class Cronometro:

    def _init_(self):
        self.__inicia = time.time()
        self.__finaliza = 0

    def getInicia(self):
        return self.__inicia

    def getFinaliza(self):
        return self.__finaliza

    def inicia(self):
        self.__inicia = time.time()

    def detener(self):
        self.__finaliza = time.time()

    def lapsoDeTiempo(self):
        return (self._finaliza - self._inicia) * 1000


# Programa de prueba

cronometro = Cronometro()

cronometro.inicia()

numeros = list(range(100000, 0, -1))

# Ordenación por selección
for i in range(len(numeros) - 1):

    menor = i

    for j in range(i + 1, len(numeros)):

        if numeros[j] < numeros[menor]:
            menor = j

    numeros[i], numeros[menor] = numeros[menor], numeros[i]


cronometro.detener()

print("Tiempo de ejecución:",
      cronometro.lapsoDeTiempo(),
      "milisegundos")


