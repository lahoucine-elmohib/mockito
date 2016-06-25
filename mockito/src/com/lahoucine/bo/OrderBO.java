package com.lahoucine.bo;

import com.lahoucine.bo.exception.BOException;
import com.lahoucine.dto.Order;

public interface OrderBO {
	boolean placeOrder(Order order) throws BOException;
	boolean cancelOrder(int id) throws BOException;
	boolean deleteOrder(int id) throws BOException;
}
