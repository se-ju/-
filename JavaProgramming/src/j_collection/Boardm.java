package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Boardm {
    //HashMap 먼저 만들기
    HashMap<String, Object> data = new HashMap<String, Object>();
    //ArrayList 만들기
    ArrayList<HashMap<String, Object>> list
    = new ArrayList<HashMap<String, Object>>();


public static void main(String[] args) {
/*
* ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
* 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
* 목록출력, 게시글 내용 볼 수 있음
* 게시물의 데이터를 저장
* 
* 번호, 제목, 내용, 작성자, 작성일자 - key로 사용
* 
* 목록에서는 조회, 등록, 종료
* 상세화면에서는 수정, 삭제, 목록
*/
Boardm bd = new Boardm();
bd.seeBoard();
}


//목록
void seeBoard() {
int number = 1;

while(true) {
System.out.println("===================================");
System.out.println("No.\t제목\t작성자\t작성일");
System.out.println("-----------------------------------");
for(int i = list.size() - 1; i >= 0 ; i--) {//거꾸로 출력
System.out.print(list.get(i).get("번호"));
System.out.print("\t" + list.get(i).get("제목"));
System.out.print("\t" + list.get(i).get("작성자"));
System.out.print("\t" + list.get(i).get("작성일"));
System.out.println();
System.out.println("-----------------------------------");
}

System.out.print("1.조회\t2.등록\t0.종료");
int input = ScanUtil.nextInt();

switch(input) {
case 1: //조회
System.out.println("조회할 게시물 번호>");
int input1 = ScanUtil.nextInt();

listData(input1);


break;
case 2: //등록
putData(number);
number++;
list.add(data);
System.out.println("작성하신 게시글이 등록되었습니다.");
break;
case 0: //종료
System.out.println("게시판을 종료합니다.");
System.exit(0);
break;	
}
}	
}

//상세
void seeDetail(int input1) {

while(true) {
System.out.println("1.수정\t2.삭제\t3.목록");
int input = ScanUtil.nextInt();
switch(input) {
case 1: //수정
reviseData(input1);
break;
case 2: //삭제
removeData(input1);

case 3: //목록
return;
}
}

}


//조회
void listData(int input1) {//글 번호랑 인덱스랑 연관짓지 말기.
for(int i = 0; i < list.size(); i++) {
if((int)list.get(i).get("번호") == input1) {

System.out.println("제목 : " + list.get(i).get("제목"));
System.out.println("내용 : " + list.get(i).get("내용"));
System.out.println("작성자 : " + list.get(i).get("작성자"));
System.out.println("작성일 : " + list.get(i).get("작성일"));
seeDetail(input1);
return;
}
}
System.out.println("게시글이 존재하지 않습니다.");
}

//등록
void putData(int number) {
	
data = new HashMap<String, Object>();
data.put("번호", number);
System.out.print("제목 : ");
data.put("제목", ScanUtil.nextLine());
System.out.print("내용 : ");
data.put("내용", ScanUtil.nextLine());
System.out.print("작성자 : ");
data.put("작성자", ScanUtil.nextLine());
Date date = new Date();
SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
data.put("작성일", format.format(date));

}

//수정
void reviseData(int input1) {
for(int i = 0; i < list.size(); i++) {
if((int)list.get(i).get("번호") == input1) {
	
System.out.println("글을 수정합니다.");
System.out.print("제목 : ");
list.get(i).put("제목", ScanUtil.nextLine());
System.out.print("내용 : ");
list.get(i).put("내용", ScanUtil.nextLine());
System.out.print("작성자 : ");
list.get(i).put("작성자", ScanUtil.nextLine());

}
}
}

//삭제
void removeData(int input1) {
System.out.println("글을 삭제합니다.");
for(int i = 0; i < list.size(); i++) {
if((int)list.get(i).get("번호") == input1) {
		list.remove(i);

}
}
}
}