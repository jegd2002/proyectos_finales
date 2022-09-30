
import random
palos = []
for i in range(n_palos):
    palos.append(i)
    baraja = []
    lista = [0]
    for i in tipos_cartas:
        for p in palos:
            carta = "{}".format(i)
            baraja.append(carta)
            random.shuffle(baraja)
    print(baraja)
    print(len(baraja)) 
   




#for i in random.sample(range):
 #   print("{}  {}  {}  {}".format(baraja[i],baraja[i+1],baraja[i+2], baraja[i+3]))