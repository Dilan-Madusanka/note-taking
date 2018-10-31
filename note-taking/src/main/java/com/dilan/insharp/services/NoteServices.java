package com.dilan.insharp.services;

import java.util.List;
import com.dilan.insharp.domain.NoteDTO;

public interface NoteServices {
	
	List<NoteDTO> findAllNotes();

	String saveNote(NoteDTO noteData);

	String updateNote(NoteDTO newNote);

//	NoteDTO findById(Integer id);
	

}
