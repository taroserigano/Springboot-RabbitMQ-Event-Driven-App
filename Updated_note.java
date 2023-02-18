*ORDER

-application.properties
--set up queue.order.name, exchange.name, binding.routing.key in application.properties 

Config 

-use Binding() to connect the Exchange with emailQueue and stockQueue w/ routing key 
-set up JSON Converter 
-set up amqpTemplate(ConnectionFactory) with rabbitTemplate.converter 

Controller 

@PostMapping("/orders")
public String placeOrder(@RequestBody Order order)

-create new OrderEvent and event.setMessage(msg) ->  SEND -- orderProducer.sendMsg(event) 

Producer 

-inject RabbitTemplate and declare sendMessage(orderEvent) {rabbitTemplate.convertAndSend(exchange, orderRoutingKey, orderEvent) }




EMAIL-SERVICE 


application.properties 
-set up server.port=8082 
-queue.email.name=email 

Config 
-JSON converter() 
-amqpTemplate(ConnectionFactory) 


Consumer 
-receive Order event 
-@RabbitListener(queues=eueue.email.name)consume(event) 


STOCK-SERVICE 

*identical to Email Service 





































