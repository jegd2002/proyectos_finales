import csv
import json
import pandas as pd
keys = ["1" , "2" , "3" , "4" , "5"]
pr = []
pr2 = []
pr3 = []
pr4 = []
with open('data.csv') as csv_file:
    reader = csv.reader(csv_file, delimiter=',')
    for i in reader:
        if i[1]=="1":
            pr.append(int(i[2]))
            pr2.append(int(i[3]))      
            promedio = round(sum(pr) / len(pr),1)
            promedio2 = round(sum(pr2) / len(pr2),1)
            lista = []
            lista2 = []
            lista.append(promedio)
            lista2.append(promedio2)
            lista_final = lista+lista2
            #diccionario = {l:[j,m] for l, j,m in zip(keys, lista,lista2)}
    print(lista_final)
    
#promedio = sum(pr)/len(pr)
#print(promedio)






# with open("nuevo_data", "w") as nd:
#     nd.write("")
#     nd.close()
# pasarlo = pd.read_csv("data.csv", sep = ",")
# pasarlo.to_json("nuevo_data.json", orient = "records")   

# print(pasarlo)        
        
     




# for i in range(10):
#     lectura = archivo.readline().split(",")
#     if lectura[2] == "1":
#         print("Siuuu")
#     else:
#         print("nouu")