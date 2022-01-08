package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import e_oop.ScanUtil;

public class Board {
		
	ArrayList<HashMap<String, Object>> boardTable = new ArrayList<>(); //전역변수 내용이 바뀌는 이유 - 주소를 저장했기 때문에
	SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
    	
	public static void main(String[] args) {
		
		new Board().start();
	}

	private void start() {
		while(true){
			System.out.println("=================================");
			System.out.println("번호\t제목\t작성자\t작성일");
			for(int i = boardTable.size() - 1; i >= 0 ; i--){
				System.out.println("---------------------------------");
				HashMap<String, Object> board = boardTable.get(i);
				System.out.println(board.get("BOARD_NO")
						+ "\t" + board.get("TITLE")
						+ "\t" + board.get("USER_NAME")
						+ "\t" + format.format(board.get("REG_DATE")));
			}//목록출력
			System.out.println("=================================");
			
			System.out.print("1.조회  2.등록  0.종료>");
			int input = ScanUtil.nextInt();
			
			switch (input) { //선택을 하기 위해 switch 사용
			case 1:
				read();
				break;
			case 2:
				insert();
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			} 
		}
	}

	private void read() { //복잡하지 않게 하기 위해 메서드 사용
		System.out.print("조회할 게시물 번호>");
		int boardNo = ScanUtil.nextInt();
		
		HashMap<String, Object> board = null;
		for(int i = 0; i < boardTable.size(); i++){
			if(boardNo == (int)boardTable.get(i).get("BOARD_NO")){
				board = boardTable.get(i); // 입력한 번호 찾을때까지
			}
		}
		
		System.out.println("=======================");
		System.out.println("번호\t: " + board.get("BOARD_NO"));
		System.out.println("-----------------------");
		System.out.println("작성자\t: " + board.get("USER_NAME"));
		System.out.println("-----------------------");
		System.out.println("작성일\t: " + format.format(board.get("REG_DATE")));
		System.out.println("-----------------------");
		System.out.println("제목\t: " + board.get("TITLE"));
		System.out.println("-----------------------");
		System.out.println("내용\t: " + board.get("CONTENT"));
		System.out.println("=======================");
		
		System.out.print("1.수정  2.삭제  0.목록>");
		int input = ScanUtil.nextInt();
		
		switch (input) {
		case 1:
			update(board);
			break;
		case 2:
			delete(board);
			break;
		case 0:
			
			break;
		}
	}

	private void delete(HashMap<String, Object> board) { 
		System.out.print("정말 삭제 하시겠습니까?(Y/N)>");
		String input = ScanUtil.nextLine();
		
		switch (input) {
		case "Y":
			for(int i = 0; i < boardTable.size(); i++){
				if(board.get("BOARD_NO") == boardTable.get(i).get("BOARD_NO")){
					boardTable.remove(i);
					System.out.println("게시글이 삭제되었습니다.");
					break;
				}
			}
			break;
		}
	}

	private void update(HashMap<String, Object> board) {
		System.out.print("제목>");
		board.put("TITLE", ScanUtil.nextLine());
		System.out.print("내용>");
		board.put("CONTENT", ScanUtil.nextLine());
		
		System.out.println("게시글이 수정되었습니다.");
	}

	private void insert() { //글을 등록하는 해쉬맵
		HashMap<String, Object> board = new HashMap<>();
		
		int max = 0;
		for(int i = 0; i < boardTable.size(); i++){
			if(max < (int)boardTable.get(i).get("BOARD_NO")){
				max = (int)boardTable.get(i).get("BOARD_NO");
			}
		}
		
		board.put("BOARD_NO", max + 1);
		System.out.print("제목>");
		board.put("TITLE", ScanUtil.nextLine());
		System.out.print("내용>");
		board.put("CONTENT", ScanUtil.nextLine());
		System.out.print("작성자>");
		board.put("USER_NAME", ScanUtil.nextLine());
		board.put("REG_DATE", new Date());
		
		boardTable.add(board);
		
		System.out.println("작성하신 게시글이 등록되었습니다.");
	}
	    
	    
	    
}
