import csv
import json
import pandas as pd
keys = ["1" , "2" , "3" , "4" , "5"]
pr = []
pr2 = []
with open('data.csv', newline='') as File:  
    reader = csv.reader(File)
    datos = pd.read_csv('data.csv')
    df = pd.DataFrame(datos)
    locacion1 = df[df["location"]==1]["temperature"]
    locacion2 = df[df["location"]==2]["temperature"]
    locacion3 = df[df["location"]==3]["temperature"]
    locacion4 = df[df["location"]==4]["temperature"]
    locacion5 = df[df["location"]==5]["temperature"]
    locacion6 = df[df["location"]==1]["pressure"]
    locacion7 = df[df["location"]==2]["pressure"]
    locacion8 = df[df["location"]==3]["pressure"]
    locacion9 = df[df["location"]==4]["pressure"]
    locacion10 = df[df["location"]==5]["pressure"]
    lista1=[]
    suma1 = lista1.append(round(sum(locacion1) / len(locacion1),1))
    lista2=[]
    suma2 = lista2.append(round(sum(locacion2) / len(locacion2),1))
    lista3=[]
    suma3 = lista3.append(round(sum(locacion3) / len(locacion3),1))
    lista4=[]
    suma4 = lista4.append(round(sum(locacion4) / len(locacion4),1))
    lista5=[]
    suma5 = lista5.append(round(sum(locacion5) / len(locacion5),1))
    lista6=[]
    suma6 = lista6.append(round(sum(locacion6) / len(locacion6),1))
    lista7=[]
    suma7 = lista7.append(round(sum(locacion7) / len(locacion7),1))
    lista8=[]
    suma8 = lista8.append(round(sum(locacion8) / len(locacion8),1))
    lista9=[]
    suma9 = lista9.append(round(sum(locacion9) / len(locacion9),1))
    lista10=[]
    suma10 = lista10.append(round(sum(locacion10) / len(locacion10),1))
    x1 = lista1+lista6
    x2 = lista2+lista7
    x3 = lista3+lista8
    x4 = lista4+lista9
    x5 = lista5+lista10
    listaf = [x1]+[x2]+[x3]+[x4]+[x5]
    diccionario = dict(zip(keys, listaf))
    with open("nose.json","w") as jotaZON:
        promedios = {
            "1": [lista1[0],lista6[0]],
            "2": [lista2[0],lista7[0]],
            "3": [lista3[0],lista8[0]],
            "4": [lista4[0],lista9[0]],
            "5": [lista5[0],lista10[0]],
        }
        json.dump(promedios,jotaZON)
        datos = json.dumps(promedios)
cabecera = []
registros = []
with open('data.csv', 'r') as csvfile:   
    data = csv.reader(csvfile)
    cabecera = next(data)
    for fila in data:
        registros.append(fila)
id = []
local = []
temperaturas = []
presiones = []
for i in registros:
    dato = i[2]
    temperaturas.append(dato)
for i in registros:
    dato = i[0]
    id.append(dato)
for i in registros:
    dato = i[1]
    local.append(dato)
for i in registros:
    dato = i[3]
    presiones.append(dato)
intId = [int(i) for i in id]
intLocal = [int(i) for i in local]
intTemperaturas = [int(i) for i in temperaturas]
intPresiones = [int(i) for i in presiones]
intRegistros = []
for i in range(len(registros)):
    nuevo = [intId[i],intLocal[i],intTemperaturas[i],intPresiones[i]]
    intRegistros.append(nuevo)
tempAbove = []
for i in intRegistros:
    if i[1] == 1:
        if i[2] < lista1[0]:
            dato = "NO"
            tempAbove.append(dato)
        elif i[2] == lista1[0]:
            dato = "IGUAL"
            tempAbove.append(dato)
        elif i[2] > lista1[0]:
            dato = "SI"
            tempAbove.append(dato)
    elif i[1] == 2:
        if i[2] < lista2[0]:
                dato = "NO"
                tempAbove.append(dato)
        elif i[2] == lista2[0]:
                dato = "IGUAL"
                tempAbove.append(dato)
        elif i[2] > lista2[0]:
                dato = "SI"
                tempAbove.append(dato)
    elif i[1] == 3:
        if i[2] < lista3[0]:
                dato = "NO"
                tempAbove.append(dato)
        elif i[2] == lista3[0]:
                dato = "IGUAL"
                tempAbove.append(dato)
        elif i[2] > lista3[0]:
                dato = "SI"
                tempAbove.append(dato)
    elif i[1] == 4:
        if i[2] < lista4[0]:
                dato = "NO"
                tempAbove.append(dato)
        elif i[2] == lista4[0]:
                dato = "IGUAL"
                tempAbove.append(dato)
        elif i[2] > lista4[0]:
                dato = "SI"
                tempAbove.append(dato)
    elif i[1] == 5:
        if i[2] < lista5[0]:
                dato = "NO"
                tempAbove.append(dato)
        elif i[2] == lista5[0]:
                dato = "IGUAL"
                tempAbove.append(dato)
        elif i[2] > lista5[0]:
                dato = "SI"
                tempAbove.append(dato)
pressAbove = []
for i in intRegistros:
    if (i[1]) == 1:
        if i[3] < lista6[0]:
            dato = "NO"
            pressAbove.append(dato)
        elif i[3] == lista6[0]:
            dato = "IGUAL"
            pressAbove.append(dato)
        elif i[3] > lista6[0]:
            dato = "SI"
            pressAbove.append(dato)
    elif (i[1]) == 2:
        if i[3] < lista7[0]:
            dato = "NO"
            pressAbove.append(dato)
        elif i[3] == lista7[0]:
            dato = "IGUAL"
            pressAbove.append(dato)
        elif i[3] > lista7[0]:
            dato = "SI"
            pressAbove.append(dato)
    elif (i[1]) == 3:
        if i[3] < lista8[0]:
            dato = "NO"
            pressAbove.append(dato)
        elif i[3] == lista8[0]:
            dato = "IGUAL"
            pressAbove.append(dato)
        elif i[3] > lista8[0]:
            dato = "SI"
            pressAbove.append(dato)
    elif (i[1]) == 4:
        if i[3] < lista9[0]:
            dato = "NO"
            pressAbove.append(dato)
        elif i[3] == lista9[0]:
            dato = "IGUAL"
            pressAbove.append(dato)
        elif i[3] > lista9[0]:
            dato = "SI"
            pressAbove.append(dato)
    elif (i[1]) == 5:
        if i[3] < lista10[0]:
            dato = "NO"
            pressAbove.append(dato)
        elif i[3] == lista10[0]:
            dato = "IGUAL"
            pressAbove.append(dato)
        elif i[3] > lista10[0]:
            dato = "SI"
            pressAbove.append(dato)
archivo = pd.read_csv('data.csv')
archivo_nuevo = pd.DataFrame()
archivo_nuevo ['id'] = archivo['id']
archivo_nuevo ['location'] = archivo['location']
archivo_nuevo ['temperature'] = archivo['temperature']
archivo_nuevo ['pressure'] = archivo['pressure']
archivo_nuevo ['above_avg_temp'] = tempAbove
archivo_nuevo ['above_avg_pres'] = pressAbove
archivo_nuevo.to_csv('data_nuevo.csv',index=False,  sep=',')
with open('data_nuevo.csv',"r") as salida:
    salida.read()