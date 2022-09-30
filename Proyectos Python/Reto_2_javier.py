nombres = ["Martín", "Milú", "Anastasia", "Lupita", "Tomasa", "Pelusa", "Genoveva", "Motita"]
tipos = ["canino", "canino", "felino", "felino", "felino", "canino", "bovino","roedor"]
edades = [12, 9, 10, 8, 9, 2,11,15]
pesos = [33, 26, 4, 5, 5, 6, 106.4, 0.34]
numeros = ["1","2","3","4","5","6","7","8","9","10"]

diccionario = {l:[j, k , f , m] for l, j, k, f, m in zip(numeros, nombres, tipos, edades, pesos)}
print(diccionario)
lista=[]
for i in diccionario.values():
    if i[2] >= 9 and i[1] != "equino" and i[1] != "bovino" and i[1] != "roedor":
        i.pop(2)
        lista.append(i)
diccionario2 = dict(zip(numeros,lista))
print(diccionario2)
lista2=[]
for z in diccionario.values():
    if z[2] >= 16 and z[1] != "canino" and z[1] != "felino" and z[1] != "roedor":
        z.pop(2)
        lista2.append(z)
diccionario3 = dict(zip(numeros,lista2))
print(diccionario3)
diccionario = {l:[j, k , f , m] for l, j, k, f, m in zip(numeros, nombres, tipos, edades, pesos)}

lista4 = []
for g in diccionario.values():
    if g[2] >= 9 and g[1] != "roedor" and g[1] != "bovino" and g[1] != "equino":
        lista4.append(g[2])
promediocanino = sum(lista4)
if promediocanino > 0:
    caninof = (promediocanino /len(lista4))
    print(caninof)
else:
    promediocanino = None
    print(promediocanino)

lista_edades = []
for i in diccionario.values():
    if i[2] >= 16 and i[1] != "canino" and i[1] != "felino" and i[1] != "roedor":
        lista_edades.append(i[2])
promedio2 = sum(lista_edades)
if promedio2 > 0:
    promfinal = promedio2 /len(lista_edades)
    print(promfinal)
else:
    promedio2 = None
    print(promedio2)
