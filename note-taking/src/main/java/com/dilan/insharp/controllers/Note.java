package com.dilan.insharp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dilan.insharp.domain.NoteDTO;
import com.dilan.insharp.services.NoteServices;

@RestController
@RequestMapping("/note")
public class Note {
	
	@Autowired
	private NoteServices noteServices;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/all")
	public List<NoteDTO> allNotes() {
		return noteServices.findAllNotes();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/add")
	public String addNote(@RequestBody NoteDTO noteData) {
		return noteServices.saveNote(noteData);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/update")
	public String updateNote(@RequestBody NoteDTO newNote) {
		return noteServices.updateNote(newNote);
	}
	
//	@CrossOrigin(origins = "http://localhost:3000")
//	@GetMapping("/find/{id}")
//	public <NoteDTO getNoteById (@PathVariable Integer id) {
//		return noteServices.findById(id);
//	}
	

}
