package com.scadhi.takeout.dto;

import com.scadhi.takeout.entity.Setmeal;
import com.scadhi.takeout.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
