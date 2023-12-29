// 랜덤한 주문번호 생성 -> 서버에 있는 마지막번호 + 1로 수정
var randomOrderNumber = Math.floor(Math.random() * 10000) + 1; // 1부터 1000 사이의 랜덤 숫자
var orderNumberElement = document.getElementById("orderNumber");
orderNumberElement.textContent = randomOrderNumber;
fetch_saveCartItems();
function fetch_saveCartItems(cartItems){



    fetch("/orderCart", {
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


//5초 뒤 Thanks 화면으로 이동
setTimeout(function () {
document.orderNum.submit();
//cart db 지우기 추가해야됨
  localStorage.removeItem("cartItems");
  localStorage.removeItem("selectedItems");
  window.location.href = "/main";
}, 5000);


