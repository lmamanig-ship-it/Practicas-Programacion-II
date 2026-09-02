import math

class EcuacionLineal:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c
    def getDiscriminante(self):
        return self.b**2-4 * self.a * self.c
    def getRaiz1(self):
        d= self.getDiscriminante()
        return (-self.b + math.sqrt(d)) / (2 * self.a)
    def getRaiz2(self):
        d= self.getDiscriminante()
        return (-self.b - math.sqrt(d)) / (2 * self.a)
# 
a, b, c = map(float, input("ingrese a, b, c: ").split())

ecuacion = EcuacionLineal(a, b, c)
d = ecuacion.getDiscriminante()

if d>0 :
    print (" la ecuacion tiene dos raices" , 
           ecuacion.getRaiz1(), "y", ecuacion.getRaiz2())        
elif d==0:
    print("la ecuacion tiene una raiz", 
    ecuacion.getRaiz1())    
else:
    print( "la ecuacion no tiene raices reales")
    