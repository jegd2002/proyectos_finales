print("¡Bienvenido! En esta aplicación los estudiantes podrán gestionar las notas de su materia.")
nombre = input("Nombre del estudiante: ")
materia = input("Ingrese nombre de la materia: ")


acumulador = 0 #porcentaje
nota_acumulada = 0 #nota acumulada



for acumulador in range (0,100):
    if acumulador < 100 and acumulador > 0:
        nota = float(input("ingrese nota obtenida: "))
        porcentaje = int(input("ingrese su porcentaje: "))
        nota_acumulada = (nota * porcentaje) + nota_acumulada
        acumulador = acumulador + porcentaje
        if porcentaje > 100:
            print("TE PASASTE")
            break
        h = input("Falta agregar nota (S/N): ")
        if h == "N":
            print("te faltan notas")
            break
        elif h == "S":
            nota = float(input("ingrese nota obtenida: "))
            porcentaje = int(input("ingrese su porcentaje: "))
            nota_acumulada = (nota * porcentaje) + nota_acumulada
            acumulador = acumulador + porcentaje
            if porcentaje > 100:
                print("TE PASASTE")
                break
        h = input("Falta agregar nota (S/N): ")
        if h == "N":
            print("te faltan notas")
            break
    elif acumulador > 100:
        print("TE PASASTE")
    

