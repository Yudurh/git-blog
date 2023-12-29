// 랜덤한 주문번호 생성
var randomOrderNumber = Math.floor(Math.random() * 10000) + 1; // 1부터 1000 사이의 랜덤 숫자
var orderNumberElement = document.getElementById("orderNumber");
orderNumberElement.textContent = randomOrderNumber;

//5초 뒤 Thanks 화면으로 이동
setTimeout(function () {
  localStorage.removeItem("cartItems");
  window.location.href = "/main";
}, 5000);
