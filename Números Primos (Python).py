# Nome do projeto: Numeros Primos (Python)
# Linguagem: Python
# Utilizações: Listas, Variáveis e Repetições
# Autor: Rafael Lua - rafaellua13


cont = 0       # Contar Divisores
listaDiv = []  # Armazenar divisores

print('\033c') # Limpar Terminal
numero = int(input('Digite para ver se é primo: '))
print()
for x in range(1,numero + 1): 
  y = (numero / x) # Valor y = Numero escolhido / x (do for)

  if int(y) != y: # Se o número for inteiro
    pass
    # print('Não divisor')
  else:
    # print('Divisor')

    cont += 1 #Numero de divisores
    listaDiv.append(x) # Armazenar Divisores

if cont <= 2:
  print('É Primo!')
  print('Divisores: ')

else:
  print('Não Primo, possui',cont,'divisores:')

for z in listaDiv:   # Mostrar Divisores
  print(z,end = " ") # end = forma de deixar todos os prints 'z' na mesma linha
