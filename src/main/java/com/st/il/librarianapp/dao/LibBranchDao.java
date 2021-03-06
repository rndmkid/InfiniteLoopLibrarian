package com.st.il.librarianapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.st.il.librarianapp.models.LibraryBranch;

@Repository
public interface LibBranchDao extends JpaRepository<LibraryBranch, Integer>{
	
}