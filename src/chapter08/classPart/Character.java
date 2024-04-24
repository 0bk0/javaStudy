package chapter08.classPart;

public class Character {
	// 캐릭터 정보
			private String id; //이름
			private String job; //직업
			private int level; //레벨
			private int str; //힘스탯
			private int dex; //민첩스탯
			private int intel; //지능스탯
			{
				this.level=1;
				this.str=1;
				this.dex=1;
				this.intel=1;
			}
			public Character(String id, String job) {
				this.id=id;
				this.job=job;
				
			}
			public Character(String id, String job,int level,int str,
					int dex, int intel) {
				this.id=id;
				this.job=job;
				this.level=level;
				this.str=str;
				this.dex=dex;
				this.intel=intel;
			}
			public void skill() {
				if(this.job.equals("마법사")) {
					System.out.println("메테오");
				}else if(this.job.equals("전사")) {
					System.out.println("가르기");
				}else if(this.job.equals("도적")) {
					System.out.println("소매치기");
				}else { System.out.println("기본공격");
					
				}
				
			

		}
			@Override
			public String toString() {
				return "["+id+"("+job+") Lv"+level
						+"]님의 스탯: str("+str+"), "+
						"dex("+dex+"), intel("+intel+")";
			}

	public static void main(String[] args) {
		
	}}
