window.onload = function () {
  var audio = new Audio("orderCheck.mp3");
  audio.play();
  audio.autoplay = true;
};

document.addEventListener("DOMContentLoaded", function () {
  const cartList = document.getElementById("cartList");
  const cartTotalElement = document.getElementById("cartTotal");
  const cartQuantityElement = document.getElementById("cartQuantity");
  let cartItems = JSON.parse(localStorage.getItem("cartItems")) || [];

  function updateCartDisplay() {
    cartList.innerHTML = "";
    let totalKRW = 0;
    let totalQuantity = 0;

    for (let i = 0; i < cartItems.length; i++) {
      const cart = cartItems[i];
      totalKRW += cart.price * cart.count;
      totalQuantity += cart.count;

      const div = document.createElement("div");

      const itemNameSpan = document.createElement("span");
      itemNameSpan.textContent = `${cart.name} - ${cart.price}원`;
      div.appendChild(itemNameSpan);

      const decreaseButton = document.createElement("button");
      decreaseButton.textContent = "-";
      decreaseButton.setAttribute("class", "totalButton");
      decreaseButton.addEventListener("click", () => {
        if (cart.count > 1) {
          cart.count -= 1;
          localStorage.setItem("cartItems", JSON.stringify(cartItems));
          updateCartDisplay();
        }
      });

      div.appendChild(decreaseButton);

      const countSpan = document.createElement("span");
      countSpan.textContent = `${cart.count}개`;
      div.appendChild(countSpan);

      const increaseButton = document.createElement("button");
      increaseButton.textContent = "+";
      increaseButton.setAttribute("class", "totalButton");
      increaseButton.addEventListener("click", () => {
        cart.count += 1;
        localStorage.setItem("cartItems", JSON.stringify(cartItems));
        updateCartDisplay();
      });

      div.appendChild(increaseButton);

      const deleteButton = document.createElement("button");
      deleteButton.textContent = "삭제";
      deleteButton.addEventListener("click", () => {
        cartItems.splice(i, 1);
        localStorage.setItem("cartItems", JSON.stringify(cartItems));
        updateCartDisplay();
      });

      div.appendChild(deleteButton);

      cartList.appendChild(div);
    }

    cartTotalElement.textContent = `총 가격: ${totalKRW.toLocaleString()}원`;
    cartQuantityElement.textContent = `총 수량: ${totalQuantity}개`;

    additionalOrderButton.addEventListener("click", () => {
      localStorage.setItem("cartItems", JSON.stringify(cartItems));
      window.location.href = "/MenuSelect"; // 페이지 이동
    });

    payButton.addEventListener("click", () => {
      localStorage.setItem("cartItems", JSON.stringify(cartItems));
      window.location.href = "/Payment"; // 페이지 이동
    });
  }

  updateCartDisplay();
});
