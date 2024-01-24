from websocket import create_connection
import json

receive_url = "ws://localhost:8080/gs-guide-websocket/topic/chat"
ws_receive = create_connection(receive_url)
receive_endpoint = "/topic/chat"
print("Receiving...")
result =  ws_receive.recv()
print ("Received '%s'" % result)
ws_receive.close()