package com.ddy.EatFood.AccessControl;

import org.springframework.web.bind.annotation.Mapping;

public interface User {
    public static interface Main{}

    public static interface Admin extends Main{}

    public static interface Client extends Admin{}

}
