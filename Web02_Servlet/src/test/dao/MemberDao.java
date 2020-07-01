package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import test.dto.MemberDto;

public class MemberDao {
	private static MemberDao dao = null;

	private MemberDao() {
	}

	public static MemberDao getInstance() {
		dao = new MemberDao();

		return dao;

	}

	public ArrayList<MemberDto> select() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {
			conn = Conn.getConnect("scott", "tiger");
			String sql = "SELECT * FROM MEMBER ORDER BY num ASC";
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			ArrayList<MemberDto> dto = new ArrayList<MemberDto>();

			while (rset.next()) {
				MemberDto empty = new MemberDto();
				empty.setNum(rset.getInt("num"));
				empty.setName(rset.getString("name"));
				empty.setAddr(rset.getString("loc"));

				dto.add(empty);
			}

			return dto;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public MemberDto getData(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {
			conn = Conn.getConnect("scott", "tiger");
			String sql = "SELECT * FROM member WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rset = pstmt.executeQuery();

			MemberDto dto = new MemberDto();
			rset.next();
			dto.setNum(rset.getInt("num"));
			dto.setName(rset.getString("name"));
			dto.setAddr(rset.getString("loc"));

			System.out.println("Ư�� num data ��� �غ�");
			return dto;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = Conn.getConnect("scott", "tiger");
			
			if (dto.getNum() == 0) {
				String sql = "INSERT INTO member(num,name,loc) VALUES(member_seq.NEXTVAL,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, dto.getName());
				pstmt.setString(2, dto.getAddr());
			} else {
				String sql = "INSERT INTO member(num,name,loc) VALUES(?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, dto.getNum());
				pstmt.setString(2, dto.getName());
				pstmt.setString(3, dto.getAddr());
			}
			
		
			pstmt.executeUpdate();

			System.out.println("insert �Ϸ�");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void delete(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = Conn.getConnect("scott", "tiger");
			String sql = "DELETE FROM member WHERE num=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getNum());

			pstmt.executeUpdate();

			System.out.println("delete �Ϸ�");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = Conn.getConnect("scott", "tiger");
			String sql = "UPDATE member SET name=?,LOC=? WHERE num=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());

			pstmt.executeUpdate();// update �� ������ ��ȯ

			System.out.println("update �Ϸ�");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
