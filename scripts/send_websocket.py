from websocket import create_connection
import json
send_url = "ws://localhost:8080/gs-guide-websocket/app/hello/websocket"
ws_send = create_connection(send_url)
print("Sending 'Hello, World'...")
message = {
    "content":"hello, world",
}
messages = [ message, message, message]
list_message = '"hello, world", "dhia"'
ws_send.send(json.dumps(messages, separators=(',', ':')))
print("Sent")
