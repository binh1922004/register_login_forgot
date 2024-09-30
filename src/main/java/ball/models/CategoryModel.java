package ball.models;

import java.io.Serializable;

public class CategoryModel implements Serializable {
        private static final long serialVersionUID = 1;
        private int categoryid;
        private String categoryname;
        private String img;
        private int Status;

        public CategoryModel(int categoryid, String categoryname, String img, int status) {
                this.categoryid = categoryid;
                this.categoryname = categoryname;
                this.img = img;
                Status = status;
        }

        public CategoryModel() {

        }

        public int getCategoryid() {
                return categoryid;
        }

        public void setCategoryid(int categoryid) {
                this.categoryid = categoryid;
        }

        public String getCategoryname() {
                return categoryname;
        }

        public void setCategoryname(String categoryname) {
                this.categoryname = categoryname;
        }

        public String getImg() {
                return img;
        }

        public void setImg(String img) {
                this.img = img;
        }

        public int getStatus() {
                return Status;
        }

        public void setStatus(int status) {
                Status = status;
        }

        @Override
        public String toString() {
                return "CategoryModel{" +
                        "categoryid=" + categoryid +
                        ", categoryname='" + categoryname + '\'' +
                        ", img='" + img + '\'' +
                        ", Status=" + Status +
                        '}';
        }
}
