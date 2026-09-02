class EcuacionLineal:

    def _init_(self):
        self.a = 0
        self.b = 0
        self.c = 0
        self.d = 0
        self.e = 0
        self.f = 0

    def tieneSolucion(self):
        return self.a * self.d - self.b * self.c != 0

    def getX(self):
        return (self.e * self.d - self.b * self.f) / (self.a * self.d - self.b * self.c)

    def getY(self):
        return (self.a * self.f - self.e * self.c) / (self.a * self.d - self.b * self.c)


ecuacion = EcuacionLineal()

ecuacion.a = float(input("Ingrese a: "))
ecuacion.b = float(input("Ingrese b: "))
ecuacion.c = float(input("Ingrese c: "))
ecuacion.d = float(input("Ingrese d: "))
ecuacion.e = float(input("Ingrese e: "))
ecuacion.f = float(input("Ingrese f: "))
if ecuacion.tieneSolucion():
    print("x=", ecuacion.getX())
    print("y=", ecuacion.getY())
else:
    print("La ecuacion no tiene solucion")