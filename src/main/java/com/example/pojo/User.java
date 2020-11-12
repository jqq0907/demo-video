package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: jqq
 * @time: 2020/11/9 20:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @TableId
    private String user_id;
    private String username;
    private String password;
    private String phone;
}
