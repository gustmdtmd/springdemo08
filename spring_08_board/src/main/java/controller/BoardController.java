package controller;

import org.springframework.stereotype.Controller;

import dto.PageDTO;
import service.BoardService;

@Controller
public class BoardController {
	
	private BoardService service;
	private PageDTO dto;
	private int currentPage;
	
	public BoardController() {
		
	}
	
	
}//end class
