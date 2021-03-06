package com.ximuyi.demo.mybatis;

import com.github.pagehelper.PageHelper;
import com.ximuyi.demo.mybatis.mapper.MybatisUserMapper;
import com.ximuyi.demo.mybatis.model.MybatisUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MybatisUserServiceImpl implements MybatisUserService {

    @Autowired
    private MybatisUserMapper mybatisUserMapper;

    @Override
    public List<MybatisUser> selectAllUser() {
        return mybatisUserMapper.selectAllUser();
    }

    @Override
    public int addUser(MybatisUser user) {
        return mybatisUserMapper.insert(user);
    }

    /***
     *   <select id="selectAllUser" resultMap="BaseResultMap">
     *     select
     *     <include refid="Base_Column_List" />
     *     from t_user
     *   </select>
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public List<MybatisUser> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return mybatisUserMapper.selectAllUser();
    }
}
