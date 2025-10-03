package com.example.OnlineClipBoard1.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.OnlineClipBoard1.Model.clips;

public interface clipsRepo extends JpaRepository<clips, String>{
	
}
