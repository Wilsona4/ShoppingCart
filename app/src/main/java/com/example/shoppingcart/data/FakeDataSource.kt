package com.example.shoppingcart.data

import com.example.shoppingcart.data.model.CartItem
import com.example.shoppingcart.data.model.ShoppingCart

object FakeDataSource {
    private val shoppingCartList = listOf(
        CartItem(
            1,
            "Childish Gambino",
            20.0,
            "Thur, Sept 29 - 7:00pm",
            "https://thumbs.dreamstime.com/b/two-old-movie-ticket-stub-isolated-white-background-132900151.jpg",
            2
        ),
        CartItem(
            2,
            "Givency Tee",
            30.0,
            "Tues, Sept 29 - 8:00pm",
            "https://thumbs.dreamstime.com/b/two-old-movie-ticket-stub-isolated-white-background-132900151.jpg",
            3
        ),
        CartItem(
            3,
            "Jay Z",
            40.0,
            "Wed, Sept 29 - 9:00pm",
            "https://thumbs.dreamstime.com/b/two-old-movie-ticket-stub-isolated-white-background-132900151.jpg",
            3
        ),
        CartItem(
            4,
            "Givency Tee",
            20.0,
            "Thur, Sept 29 - 10:00pm",
            "https://thumbs.dreamstime.com/b/two-old-movie-ticket-stub-isolated-white-background-132900151.jpg",
            2
        ),
        CartItem(
            5,
            "Beyonce",
            30.0,
            "Wed, Sept 29 - 7:00pm",
            "https://thumbs.dreamstime.com/b/two-old-movie-ticket-stub-isolated-white-background-132900151.jpg",
            1
        ),
        CartItem(
            6,
            "Eminem",
            40.0,
            "Fri, Sept 29 - 8:00pm",
            "https://thumbs.dreamstime.com/b/two-old-movie-ticket-stub-isolated-white-background-132900151.jpg",
            2
        ),
        CartItem(
            7,
            "Givency Tee",
            20.0,
            "Mon, Sept 19 - 9:00pm",
            "https://thumbs.dreamstime.com/b/two-old-movie-ticket-stub-isolated-white-background-132900151.jpg",
            3
        ),
    )

    private val subTotal = 200.0

    val shoppingCart = ShoppingCart(
        shoppingCartList, subTotal
    )
}
