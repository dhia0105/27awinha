from websocket import create_connection
import json
import time
receive_url = "ws://localhost:8080/gs-guide-websocket/topic/chat/websocket"
ws_receive = create_connection(receive_url)
print("Receiving...")
while True:
    ws_receive = create_connection(receive_url)
    result =  ws_receive.recv()
    print ("Received '%s'" % result)
    time.sleep(1)

ws_receive.close()