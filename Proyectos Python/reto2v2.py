nombres = ["Martín", "Milú", "Anastasia", "Lupita", "Tomasa", "Pelusa", "Genoveva", "Motita","juana"]
tipos = ["canino", "canino", "felino", "felino", "felino", "canino", "bovino","roedor","bovino"]
edades = [12, 9, 10, 8, 9, 2,11,15,22]
pesos = [33, 26, 4, 5, 5, 6, 106.4, 0.34, 16]    
    
numeros = []
contador = 0
for i in nombres:
        contador += 1
        numeros.append(str(contador))

diccionario = {l:[j, k , f , m] for l, j, k, f, m in zip(numeros, nombres, tipos, edades, pesos)}
print(diccionario)


lista = []
for i in diccionario.values():
    if i[2] >= 9 and i[1] != 'roedor' and i[1] != 'bovino' and i[1] != "equino":
        i.pop(2)
        lista.append(i)
beneficiarios_can_fel = dict(zip(numeros,lista))
print(beneficiarios_can_fel)


lista2 = []
for z in diccionario.values():
    if z[2] >= 16 and z[1] != 'canino' and z[1] != 'felino' and z[1] != "roedor":
        z.pop(2)
        lista2.append(z)
beneficiarios_equ_bov = dict(zip(numeros,lista2))
print(beneficiarios_equ_bov)

diccionario = {l:[j, k , f , m] for l, j, k, f, m in zip(numeros, nombres, tipos, edades, pesos)}

lista4 = []
for g in diccionario.values():
    if g[2] >= 9 and g[1] != 'roedor' and g[1] != 'bovino' and g[1] != "equino":
        lista4.append(g[2])
promediocanino = sum(lista4)
if promediocanino > 0:
    promedio_can_fel = (promediocanino /len(lista4))
    print(promedio_can_fel)
else:
    promedio_can_fel = None
    print(promedio_can_fel)

lista_edades = []
for i in diccionario.values():
    if i[2] >= 16 and i[1] != 'canino' and i[1] != 'felino' and i[1] != "roedor":
        lista_edades.append(i[2])
promedio2 = sum(lista_edades)
if promedio2 > 0:
    promedio_equ_bov = promedio2 /len(lista_edades)
    print(promedio_equ_bov)
else:
    promedio_equ_bov = None
    print(promedio_equ_bov)