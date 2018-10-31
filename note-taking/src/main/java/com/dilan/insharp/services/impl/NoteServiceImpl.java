package com.dilan.insharp.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dilan.insharp.dao.NoteDAO;
import com.dilan.insharp.domain.NoteDTO;
import com.dilan.insharp.services.NoteServices;

@Service
public class NoteServiceImpl implements NoteServices{

	@Autowired
	private NoteDAO noteDAO;
	
	@Override
	public List<NoteDTO> findAllNotes() {
		 List<NoteDTO> allNotes =  noteDAO.findAll();
		 return allNotes;
		 
	}

	@Override
	public String saveNote(NoteDTO noteData) {
		noteDAO.save(noteData);
		return "Data Saved";
	}

	@Override
	public String updateNote(NoteDTO newNote) {
		String msg = null;
		if(newNote.getId() != null) {
			noteDAO.save(newNote);
			msg = "Data Updated";
		}else {
			msg = "Error";
		}
		return msg;
		
	}

//	@Override
//	public NoteDTO findById(Integer id) {
//		return noteDAO.findById(id);
//		
//	}
	
	
	
	
	

}
