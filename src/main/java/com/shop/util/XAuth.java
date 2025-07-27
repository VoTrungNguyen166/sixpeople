/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shop.util;

import com.shop.entity.User;

/**
 *
 * @author Dung Si Ban Tron
 */
public class XAuth {

    public static User user = User.builder()
            .username("user1@gmail.com")
            .password("123")
            .enabled(true)
            .manager(true)
            .fullname("Nguyễn Văn Tèo")
            .photo("trump-small.png")
            .build(); // biến user này sẽ được thay thế sau khi đăng nhập
}
