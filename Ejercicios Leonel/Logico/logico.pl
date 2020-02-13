%Suma
suma:- write('Ingrese primer numero='),
    read(A),
    write('Ingrese el segundo numero='),
    read(B),
    C is A+B,
    format('El resultado es ~w',[C]).
