package chapter12.object;

import java.util.Objects;

public class User {
	int userID;
	String userName;

	public User(int userID, String userName) {
		this.userID = userID;
		this.userName = userName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj; //강제형변환으로 유저타입으로 다운캐스팅
		if (this.userID != other.userID) //유저아이디 서로 비교하겠다(userID가 동등의 기준)
			return false;
		return true;

	}
}
