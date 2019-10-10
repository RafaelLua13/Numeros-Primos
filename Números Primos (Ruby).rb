# Nome do projeto: Numeros Primos
# Linguagem: Ruby
# Utilizações: Variáveis e Repetições
# Autor: Rafael Lua de Sousa e Silva - rafaellua13

primo = true

puts "digite um numero para saber se ele é primo"
numero = gets.chomp.to_i # Identificar apenas a sequencia de numeros iniciais

if numero == 1 then
    primo = true
else 
    for count in 2..numero-1 do 
        resto = numero % count # Divisão do nÚmero escolhido pelo count ('for')
        if resto == 0 then # Numero tem divisores
           primo = false
        end
    end
end

if primo then # Condições para primo ou não
    puts "O numero #{numero} é primo"
else 
    puts "o numero #{numero} nao é primo"
end
