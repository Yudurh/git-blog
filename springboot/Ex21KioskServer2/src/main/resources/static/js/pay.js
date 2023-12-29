//7초 뒤 Thanks 화면으로 이동
setTimeout(function () {
  window.location.href = "/Thanks";
}, 7000);

window.onload = function () {
  var audio = new Audio("./audio/payment.mp3");
  audio.play();
  audio.autoplay = true;

  const cartItems = JSON.parse(localStorage.getItem("cartItems")) || [];
  fetch_saveCartItems( cartItems );


};

function fetch_saveOrder(totalQuantity, totalPrice, cartItems){

    var randomOrderNumber = Math.floor(Math.random() * 10000) + 1;

    let order = {
          orderNo : 0,
          cartItemCode1: "11111111-1111-12d3-a456-5566424400992",
          cartItemCode2: "",
          cartItemCode3: "",
          cartItemCode4: "",
          cartItemCode5: "",
          orderTotalPrice: totalPrice,
          orderTotalCount: totalQuantity,
          orderNumber: randomOrderNumber,
          orderPayType: 1,
          orderState: "결제완료",
          orderDatetime: new Date()
    };

    fetch("/setOrder", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(order),
    })
      .then((response) => {
        console.log("response:"+response);
        return response.json();
      }) //HTTP 응답
      .then((json) => {
        //{ status: "ok", result: 5 }
        console.log("json:" + json);

        //다음페이지로 이동
        //window.location.href = "/Payment";

      }) //실제 데이타
      .catch((error) => {
        console.log(error);
      });
}

function fetch_saveCartItems(cartItems){

    console.log("fetch_saveCartItems");
    console.log(JSON.stringify(cartItems));

    fetch("/setCartItems", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(cartItems),
    })
      .then((response) => {
        console.log("response:"+response);
        return response.json();
      }) //HTTP 응답
      .then((json) => {
        //{ status: "ok", result: 5 }
        console.log("json:" + json);

        //다음페이지로 이동
        //window.location.href = "/Payment";

      }) //실제 데이타
      .catch((error) => {
        console.log(error);
      });
}

document.addEventListener("DOMContentLoaded", () => {
  const cartItems = JSON.parse(localStorage.getItem("cartItems")) || [];
  const cartQuantityElement = document.getElementById("cartQuantity");
  const cartTotalElement = document.getElementById("cartTotal");

  // Calculate total quantity and total price
  const totalQuantity = cartItems.reduce(
    //(total, cartItem) => total + cartItem.count,
    (total, cartItem) => total + cartItem.cartItemAmount,
    0
  );
  const totalPrice = cartItems.reduce(
    //(total, cartItem) => total + cartItem.count * cartItem.price,
    (total, cartItem) => total + cartItem.cartItemAmount * cartItem.itemPrice,
    0
  );

  // Display total quantity and total price
  cartQuantityElement.textContent = `총 수량: ${totalQuantity}개`;
  cartTotalElement.textContent = `총 가격: ${totalPrice}원`;


    fetch_saveOrder(totalQuantity, totalPrice,  cartItems );
});

