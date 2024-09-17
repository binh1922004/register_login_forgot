package ball.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class UserModel implements Serializable {
        private int id;
        private String email;
        private String userName;
        private String fullName;
        private String passWord;
        private String avatar;
        private int roleid;
        private String phone;
        private Date createdDate;

        public UserModel(String email, String userName, String fullName, String passWord, String avatar, int roleid, String phone, Date createdDate) {
                this.email = email;
                this.userName = userName;
                this.fullName = fullName;
                this.passWord = passWord;
                this.avatar = avatar;
                this.roleid = roleid;
                this.phone = phone;
                this.createdDate = createdDate;
        }
        public UserModel() {
                super();
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public String getFullName() {
                return fullName;
        }

        public void setFullName(String fullName) {
                this.fullName = fullName;
        }

        public String getPassWord() {
                return passWord;
        }

        public void setPassWord(String passWord) {
                this.passWord = passWord;
        }

        public String getAvatar() {
                return avatar;
        }

        public void setAvatar(String avatar) {
                this.avatar = avatar;
        }

        public int getRoleid() {
                return roleid;
        }

        public void setRoleid(int roleid) {
                this.roleid = roleid;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public Date getCreatedDate() {
                return createdDate;
        }

        public void setCreatedDate(Date createdDate) {
                this.createdDate = createdDate;
        }

        @Override
        public String toString() {
                return "UserModel{" +
                        "id=" + id +
                        ", email='" + email + '\'' +
                        ", userName='" + userName + '\'' +
                        ", fullName='" + fullName + '\'' +
                        ", passWord='" + passWord + '\'' +
                        ", avatar='" + avatar + '\'' +
                        ", roleid=" + roleid +
                        ", phone='" + phone + '\'' +
                        ", createdDate=" + createdDate +
                        '}';
        }
}
