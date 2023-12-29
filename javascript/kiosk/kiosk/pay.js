//7초 뒤 Thanks 화면으로 이동
setTimeout(function () {
  window.location.href = "Thanks.html";
}, 7000);

window.onload = function () {
  var audio = new Audio("payment.mp3");
  audio.play();
  audio.autoplay = true;
};

document.addEventListener("DOMContentLoaded", () => {
  const cartItems = JSON.parse(localStorage.getItem("cartItems")) || [];
  const cartQuantityElement = document.getElementById("cartQuantity");
  const cartTotalElement = document.getElementById("cartTotal");

  // Calculate total quantity and total price
  const totalQuantity = cartItems.reduce(
    (total, cartItem) => total + cartItem.count,
    0
  );
  const totalPrice = cartItems.reduce(
    (total, cartItem) => total + cartItem.count * cartItem.price,
    0
  );

  // Display total quantity and total price
  cartQuantityElement.textContent = `총 수량: ${totalQuantity}개`;
  cartTotalElement.textContent = `총 가격: ${totalPrice}원`;
});
