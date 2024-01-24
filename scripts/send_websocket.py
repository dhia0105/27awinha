from websocket import create_connection
import json
send_url = "ws://localhost:8080/gs-guide-websocket/app"
ws_send = create_connection(send_url)
print("Sending 'Hello, World'...")
message = {
    "content":"hello, world",
    "sender":"dhia"
}
endpoint = "/app/hello"
ws_send.send(json.dumps(message))
print("Sent")
