package com.xxx.docker.controller;

import cn.hutool.core.util.IdUtil;
import com.xxx.docker.entities.User;
import com.xxx.docker.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Random;

@Api(description = "用户User接口")
@RestController
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation("数据库新增3条记录")
    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public void addUser() {
        for (int i = 1; i <= 3; i++) {
            User user = new User();

            user.setUsername("zzyy" + i);
            user.setPassword(IdUtil.simpleUUID().substring(0, 6));
            user.setSex((byte) new Random().nextInt(2));

            userService.addUser(user);
        }
    }

//    @ApiOperation("删除1条记录")
//    @RequestMapping(value = "/user/delete/{id}", method = RequestMethod.POST)
//    public void deleteUser(@PathVariable Integer id) {
//        userService.deleteUser(id);
//    }
//
//    @ApiOperation("修改1条记录")
//    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
//    public void updateUser(@RequestBody UserDTO userDTO) {
//        User user = new User();
//        BeanUtils.copyProperties(userDTO, user);
//        userService.updateUser(user);
//    }

    @ApiOperation("查询1条记录")
    @RequestMapping(value = "/user/find/{id}", method = RequestMethod.GET)
    public User findUserById(@PathVariable Integer id) {
        return userService.findUserById(id);
    }
}
