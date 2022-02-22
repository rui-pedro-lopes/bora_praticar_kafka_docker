package kafka.producer.controller;

import kafka.producer.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageResource {

    @Autowired
    MessageService messageService;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message){
        messageService.sendMessage(message);
        return ResponseEntity.ok().body("Message sent with success: " + message);
    }
}