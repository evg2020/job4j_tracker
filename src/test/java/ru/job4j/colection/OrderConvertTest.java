package ru.job4j.colection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderConvertTest {

    @Test
    public void whenSingleOrder() {
    List<Order> orders = new ArrayList<>();
      orders.add(new Order("3ftr", "dress"));
    HashMap<String, Order> map = OrderConvert.process(orders);
    assertThat(map.get("3ftr"), is(new Order("3ftr", "dress")));

    }
}