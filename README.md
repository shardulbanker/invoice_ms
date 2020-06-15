# invoice_ms
Invoice Microservice Application

Save Invoice API

API URL: http://localhost:8080/invoices

API Method: POST

Request:

{
	"client":"ABC",
	"vatRate":5.00,
	"invoiceDate": "13-06-2020",
	"lineItemData": [{
		"quantity":2,
		"description":"test1",
		"unitprice":20.00
		
	},
	{
		"quantity":3,
		"description":"test2",
		"unitprice":10.00
	}
	]
}
Response:

Invoice details save successfully   

Get Invoices API

API URL: http://localhost:8080/invoices

API Method: GET

Response:

{
    "invoiceDetails": [
        {
            "invoiceId": 1,
            "client": "ABC",
            "invoiceDate": "2020-06-13",
            "totalValueWithoutVat": 70.00,
            "totalvalueIncVat": 75.00
        }
    ]
}

Get Invoice By ID API

API URL: http://localhost:8080/invoices/{invoiceId}

API Method: GET

Response:

{
    "id": 1,
    "client": "ABC",
    "vatrate": 5,
    "invoicedate": "13-06-2020",
    "lineItemList": [
        {
            "id": 2,
            "quantity": 2,
            "description": "test1",
            "invoice": 1,
            "unitPrice": 20.00
        },
        {
            "id": 3,
            "quantity": 3,
            "description": "test2",
            "invoice": 1,
            "unitPrice": 10.00
        }
    ]
}
    

