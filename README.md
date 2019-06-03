# pizzaria-spring-react

Url - http://localhost:8080/pedido/

###`Exemplo JSON usando Postman - cadastrar pedido - POST`

{"tamanho":"grande",<br>
"sabor":"portuguesa",<br>
"ingredientesAdicionais":<br>
[<br>
  {"id":"","nome":"extra bacon"},<br>
  {"id":"","nome":"extra bacon"},<br>
  {"id":"","nome":"sem cebola"}<br>
  ]
}

###`Exemplo JSON usando Postman - receber resumo pedido - GET`

{<br>
    "tamanho": "Media",<br>
    "total": 33,<br>
    "tempoPreparo": 20,<br>
    "ingredientesAdicionais": [<br>
        {<br>
            "nome": "Extra bacon",<br>
            "id": 22<br>
        }<br>
    ],
    "id": 21,<br>
    "sabor": "Marguerita"<br>
}
