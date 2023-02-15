RABBITMQ 


Message Broker - 

-Message Queue - provides asynchronous communication. It also stores msgs when the destination app is busy or not connected. 

-Routing Key is like an address for routing 

-Exchange is like DB that stores msg. 
-Bind Exchange to Queue with routing key (*optional),
and then you can send messages. 

-RabbitTemplate will automatically create Exchange and Queues inside RabbitMQ management system 


Download:
docker pull rabbitmq:3.11.5-management 

Run: 
docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.11.5-management 

15672 for connecting to Rabbit MQ management website
5672 for for connecting to MQ app 


localhost:15672: 
user:guest 
pwd:guest 



1. add Exchange - exchange_demo
2. add Queue    - queue_demo *routing key can be anything 
3. open Exchange and  Bind with  queue_demo  

