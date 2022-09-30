import math

#Rifa en pro de los habitantes de la calle.
b = 30
n = int(input("Numero a adivinar: "))
contador = 0
b1 = int(input("ingrese numero:"))
contador += 1
while n != b1:
  if b1 > b:
    print("¡Te saliste del intervalo!")
    b1 = int(input("ingrese numero:"))
    contador += 1
    continue
  elif b1 <= n:
    print("¡Ups! Estás por debajo")
    b1 = int(input("ingrese numero:"))
    contador += 1
    continue
  else:
    print("¡Ups! Estás por arriba")
    b1 = int(input("ingrese numero:"))
    contador += 1
print(f"¡LO LOGRASTE! Usaste {contador} intentos")