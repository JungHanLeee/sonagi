# Description
+ 오른쪽에서 왼쪽으로 이동하는 타자게임
# Run Screen

https://user-images.githubusercontent.com/89134202/138420295-b669821c-8a4f-4671-b167-3ac01a1d8263.mp4

# Changes
+ ```java
  JPanel panel_1 = new JPanel(); // 게임화면에서 빨간색 선
	  	panel_1.setBackground(Color.RED);
		  panel_1.setBounds(50, 0, 10, 740); //빨간선 위치변경
		  panel_Screen.add(panel_1);
  ```
+ ```java
  label[i].setLocation(678,random.nextInt(500)); ///단어생성되는 x좌표 고정  랜덤으로 y좌표 값 결정
  ```
+ ```java
  for (int a = 0; a <= i; a++) {
				if (label[a].isVisible()) {
					int sp = label[a].getY();
					int xp = label[a].getX();

					label[a].setLocation(xp-15, sp); //for문을 돌 때 마다 x좌표의 값이 줄어듦

				}

				// 단어가 보여져있는 상태롤 빨간선을 넘었는지 확인
				if (label[a].isVisible() && label[a].getX() < 45) {
					label[a].setVisible(false);// 단어가 선을 넘으면 단어 사라짐 
					life++;// 라이프 1 = 생명 1없어짐
				}
			}
   ```
# ToDoList
  1.추후에 단어장을 다른 파일로 구현해보기

  2.단어 겹치지않게 하기 

  3.중복단어 없애기

  4.디자인 바꿔보기
# References
[참고한 블로그](https://m.blog.naver.com/huijins3l/220754490758) 이 프로그램을 오른쪽에서 왼쪽으로 이동하는 방식으로 변환
