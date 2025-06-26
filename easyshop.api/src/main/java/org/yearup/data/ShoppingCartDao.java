package org.yearup.data;

import org.yearup.models.ShoppingCart;
import org.yearup.models.ShoppingCartItem;

import java.util.List;

public interface ShoppingCartDao
{
    ShoppingCart getByUserId(int userId);
    // add additional method signatures here

    void addItemToCart(int productId, int userId);
    void updateItemQuantity(int userId, int productId, int quantity);
    void deleteAllItem(int productId);
}
