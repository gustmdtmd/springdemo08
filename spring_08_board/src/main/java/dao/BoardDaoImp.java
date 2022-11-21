package dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import dto.BoardDTO;
import dto.PageDTO;

public class BoardDaoImp implements BoardDAO{
	private SqlSessionTemplate sqlSession;
	
	public BoardDaoImp() {
	
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public int count() {
		return 0;
	}

	@Override
	public List<BoardDTO> list(PageDTO pv) {
		return null;
	}

	@Override
	public void readCount(int num) {
		
	}

	@Override
	public BoardDTO content(int num) {
		return null;
	}

	@Override
	public void reStepCount(BoardDTO dto) {
		
	}

	@Override
	public void save(BoardDTO dto) {
		
	}

	@Override
	public BoardDTO updateNum(int num) {
		return null;
	}

	@Override
	public void update(BoardDTO dto) {
		
	}

	@Override
	public void delete(int num) {
		
	}

	@Override
	public String getFile(int num) {
		return null;
	}
}//end class
