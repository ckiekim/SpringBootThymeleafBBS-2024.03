package com.example.abbs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.abbs.entity.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Override
	public Board getBoard(int bid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getBoardCount(String field, String query) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Board> getBoardList(int page, String field, String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(int bid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increaseViewCount(int bid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increaseReplyCount(int bid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increaseLikeCount(int bid) {
		// TODO Auto-generated method stub
		
	}

}
