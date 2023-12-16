package cn.neusoft.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_admin")
public class Admin {

    @TableId(type = IdType.AUTO)
    private Integer adminId;
    private String adminName;
    private String password;
    private String role;


}
