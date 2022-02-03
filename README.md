# AutomovelTest

Utilizando de um banco H2, a aplicação cadastra e retorna os registros atraves das chamadas do endpoints

## POST
"/cadastroAutomoveis"

body:
{
     "marca" : String,
    "modelo" : String,
    "valor" : double/ BigDecimal,
    "dataCadastro" : Date
}

Exemplo de body: 
{ 
     "marca" : "Fiat",
     "modelo" : "Uno",
     "valor" : 1.0,
     "dataCadastro" : "03/02/2022"
 }
 
retorno: HTTP_Status 201

## GET
"/automoveis"

Exemplo de retorno: [
    {
        "id": 1,
        "marca": "Fiat",
        "modelo": "Uno",
        "valor": 1.00,
        "dataCadastro": "26/02/2022"
    },
    {
        "id": 2,
        "marca": "Fiat",
        "modelo": "Uno",
        "valor": 1.00,
        "dataCadastro": "26/02/2022"
    }
]
 HTTP_Status 200
 
 
