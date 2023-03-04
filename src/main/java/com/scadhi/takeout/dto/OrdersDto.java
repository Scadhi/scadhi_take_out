package com.scadhi.takeout.dto;

import com.scadhi.takeout.entity.OrderDetail;
import com.scadhi.takeout.entity.Orders;
import lombok.Data;
import java.util.List;

@Data
public class OrdersDto extends Orders {

    private int sumNum;

    private String userName;

    private String phone;

    private String address;

    private String consignee;

    private List<OrderDetail> orderDetails;
	
}
