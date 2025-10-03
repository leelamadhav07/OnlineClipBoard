package com.example.OnlineClipBoard1.Service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.OnlineClipBoard1.Model.clips;
import com.example.OnlineClipBoard1.Repository.clipsRepo;

@Service
public class clipsService {
	@Autowired
	private clipsRepo repo;
	
	public clips createClip(clips clip) {
		return repo.save(clip);
	}
	
	public Optional<String> findDataById(String id) {
        Optional<clips> clipObj = repo.findById(id);
        if (clipObj.isPresent()) {
            return Optional.of(clipObj.get().getData()); 
        } else {
            return Optional.empty();
        }
    }
}
