package com.port.returndata;

import com.port.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserReturnDate {
    private int statue;
    private  String info;
    private User user;
}
