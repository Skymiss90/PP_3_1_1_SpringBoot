package skymiss.PP_3_1_2_SpringBoot.service;
import skymiss.PP_3_1_2_SpringBoot.dao.UserDao;
import skymiss.PP_3_1_2_SpringBoot.model.User;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User getUser(long id) {
        return userDao.getUser(id);
    }

    @Transactional
    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }
}
