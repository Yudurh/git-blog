//thanks.js


window.onload = function () {


 fetch("/update_point", {
    method: "get",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(),
  })
  .then((response) => {
    console.log("response:"+response);
    console.log(loginId);
    console.log("response:"+JSON.stringify(response));
    return response.json();
  }) //HTTP 응답
  .then((json) => {
    //{ status: "ok", result: 5 }
    console.log("json:" + json);
    console.log("response:"+JSON.stringify(json));


  }) //실제 데이타
    .catch((error) => {
    console.log(error);
  });


};








// 랜덤한 주문번호 생성 -> 서버에 있는 마지막번호 + 1로 수정
var randomOrderNumber = Math.floor(Math.random() * 10000) + 1; // 1부터 1000 사이의 랜덤 숫자
var orderNumberElement = document.getElementById("orderNumber");
orderNumberElement.textContent = randomOrderNumber;

//5초 뒤 Thanks 화면으로 이동
setTimeout(function () {

  //cart db에 있는 것도 지운다. fetch_deleteCartItems()
  localStorage.removeItem("cartItems");
  localStorage.removeItem("selectedItems");

  window.location.href = "/main";
}, 5000);



