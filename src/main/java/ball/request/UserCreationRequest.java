package ball.request;

import java.time.LocalDate;

public class UserCreationRequest {
        private String userName;
        private String passWord;
        private String fullName;
        private String email;

        private String avatar;
        private int roleid;
        private String phone;
        private LocalDate createdDate;

        public UserCreationRequest() {
        }

        public UserCreationRequest(String userName, String passWord, String fullName, String email, String avatar, int roleid, String phone, LocalDate createdDate) {
                this.userName = userName;
                this.passWord = passWord;
                this.fullName = fullName;
                this.email = email;
                this.avatar = avatar;
                this.roleid = roleid;
                this.phone = phone;
                this.createdDate = createdDate;
        }

        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public String getPassWord() {
                return passWord;
        }

        public void setPassWord(String passWord) {
                this.passWord = passWord;
        }

        public String getFullName() {
                return fullName;
        }

        public void setFullName(String fullName) {
                this.fullName = fullName;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
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

        public LocalDate getCreatedDate() {
                return createdDate;
        }

        public void setCreatedDate(LocalDate createdDate) {
                this.createdDate = createdDate;
        }
}
