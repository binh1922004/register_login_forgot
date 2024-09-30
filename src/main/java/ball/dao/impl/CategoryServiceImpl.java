package ball.dao.impl;

import ball.dao.ICateogryDao;
import ball.models.CategoryModel;
import ball.service.ICategoryService;

import java.util.List;

public class CategoryServiceImpl implements ICategoryService {
        public ICateogryDao cateogryDao = new CateogryDaoImpl();
        @Override
        public List<CategoryModel> findAll() {
                return cateogryDao.findAll();
        }

        @Override
        public CategoryModel findById(int id) {
                return cateogryDao.findById(id);
        }

        @Override
        public CategoryModel findByName(String name) {
                return cateogryDao.findByName(name);
        }

        @Override
        public List<CategoryModel> searchByName(String keyword) {
                return cateogryDao.searchByName(keyword);
        }

        @Override
        public void insert(CategoryModel category) {
                CategoryModel cate = this.findByName(category.getCategoryname());
                if (cate == null)
                        cateogryDao.insert(category);
        }

        @Override
        public void update(CategoryModel category) {
                CategoryModel cate = this.findById(category.getCategoryid());
                if (cate != null)
                        cateogryDao.update(category);

        }

        @Override
        public void delete(int id) {
                cateogryDao.delete(id);
        }

        @Override
        public void updateStatus(int id, int status) {
                cateogryDao.updateStatus(id, status);
        }
}
