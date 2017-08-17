package com.auth.controller;

import com.auth.entity.User;
import com.auth.service.UserManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by wang on 2017/8/16.
 */
@Controller
@RequestMapping("/user")
public class UserManageController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserManageService userManageService;
    //url:/模块/资源/{id}/细分
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        List<User> list = userManageService.queryAllUsers();
        model.addAttribute("list", list);
        return "list";
    }




    /**
     * 获取编辑请求
     * 根据id 查询用户
     * 返回Model 给edituser
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/edit")
    public String edit(long id, Model model) {
        User user = userManageService.queryUserById(id);
        model.addAttribute("user", user);
        return "edituser";
    }

    /**
     * 更新user信息，重定向到list
     * @param user
     * @return
     */
    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    public String saveOrUpdate(User user){

        userManageService.updateUser(user);
        return "redirect:list";
    }

    /**
     * 传入id
     * 根据id删除用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteById")
    public String deleteById(long id) {
        userManageService.deleteUser(id);
        return "redirect:list";
    }

    /**
     * 按钮点击后
     * 跳转页面
     * 填写用户信息
     * @return
     */
    @RequestMapping("/add")
    public String Add()
    {
        return "AddUser";
    }

    /**
     * jsp 信息 --> post到addUser
     * 加入用户
     * @param user
     * @return
     */
    @RequestMapping("/addUser")
    public String Insert(User user)
    {
        userManageService.addUser(user);
        return "redirect:list";
    }


}
