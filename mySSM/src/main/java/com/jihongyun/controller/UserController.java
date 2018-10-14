package com.jihongyun.controller;

import com.github.pagehelper.PageInfo;
import com.jihongyun.base.BaseQuery;
import com.jihongyun.base.BaseService;
import com.jihongyun.po.User;
import com.jihongyun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class UserController{
    @Autowired
    private UserService userService;

    
    public int insert(User entity) throws Exception {
       return 0;
    }

    
    public int insertBatch(List<User> entities) throws Exception {
        return 0;
    }

    
    public int queryCountByParams(Map map) throws Exception {
        return 0;
    }

    @RequestMapping(value = "queryById",method = RequestMethod.POST,produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public User queryById(Integer id, ModelAndView modelAndView) throws Exception {
        User user = userService.queryById(id);
        modelAndView.setViewName("show");
        return user;
    }

    
    public PageInfo<User> queryForPage(BaseQuery baseQuery) throws Exception {
        return null;
    }

    
    public List<User> queryByParams(Map map) throws Exception {
        return null;
    }

    
    public int update(User entity) throws Exception {
        return 0;
    }

    
    public int updateBatch(Map map) throws Exception {
        return 0;
    }

    
    public int delete(Integer id) throws Exception {
        return 0;
    }

    
    public int deleteBatch(int[] ids) throws Exception {
        return 0;
    }
}
