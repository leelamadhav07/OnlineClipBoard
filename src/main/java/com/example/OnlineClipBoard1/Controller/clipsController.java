package com.example.OnlineClipBoard1.Controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.OnlineClipBoard1.Model.clips;
import com.example.OnlineClipBoard1.Service.clipsService;

@RestController
@RequestMapping("/clips")
public class clipsController {
    @Autowired
    private clipsService service;

    @PostMapping("/{id}")
    public ResponseEntity<clips> createClip(@PathVariable String id, @RequestBody String data) {
        clips clip = new clips();
        clip.setId(id);
        clip.setData(data);
        clips savedClip = service.createClip(clip);
        return ResponseEntity.ok(savedClip);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> findDataById(@PathVariable String id) {
        Optional<String> dataOpt = service.findDataById(id);
        if (dataOpt.isPresent()) {
            return ResponseEntity.ok(dataOpt.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("Clip not found");
        }
    }
}
