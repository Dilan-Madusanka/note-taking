package com.dilan.insharp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dilan.insharp.domain.NoteDTO;

public interface NoteDAO extends JpaRepository<NoteDTO, Integer>{
	
}
