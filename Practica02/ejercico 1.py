import math
class MiPunto:
    def __init__(self, x=0, y=0):
        self .x = x
        self .y = y
    def getX(self):
        return self.x
    def getY(self):
        return self.y
    def distancia(self, x, y):
        dx = self.x - x
        dy = self.y-y
        return math.sqrt (dx * dx + dy * dy)


p1 = MiPunto()
p2 = MiPunto(10, 30.5)

print ("Punto1:", p1.getX(), p1.getX())
print ("Punto2:", p2.getX(), p2.getY())

print("Distancia:", 
      p1.distancia(p2.getX(), p2.getY()))