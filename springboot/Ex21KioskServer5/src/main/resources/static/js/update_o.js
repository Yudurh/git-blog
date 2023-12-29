function update_oAction() {
  let codeValue = document.getElementById("orderCode").value;
  let priceValue = document.getElementById("orderTotalPrice").value;
  let numberValue = document.getElementById("orderNumber").value;
  let stateValue = document.getElementById("orderState").value;
  let countValue = document.getElementById("orderTotalCount").value;
  let datetimeValue = document.getElementById("orderDatetime").value;
  let cartItemCode1Value = document.getElementById("cartItemCode1").value;
  let cartItemCode2Value = document.getElementById("cartItemCode2").value;
  let cartItemCode3Value = document.getElementById("cartItemCode3").value;
  let cartItemCode4Value = document.getElementById("cartItemCode4").value;
  let cartItemCode5Value = document.getElementById("cartItemCode5").value;
  let payValue = document.getElementById("orderPayType").value;
  let noValue = document.getElementById("orderNo").value;


  let params = {
    orderCode: codeValue,
    orderTotalPrice: priceValue,
    orderNumber: numberValue,
    orderState: stateValue,
    orderTotalCount: countValue,
    orderDateTime: datetimeValue,
    cartItemCode1: cartItemCode1Value,
    cartItemCode2: cartItemCode2Value,
    cartItemCode3: cartItemCode3Value,
    cartItemCode4: cartItemCode4Value,
    cartItemCode5: cartItemCode5Value,
    orderPayType: payValue,
    orderNo: noValue,
  };
  console.log(JSON.stringify(params));

  fetch("/update_o1", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(params),
  })
    .then((response) => {
      console.log("response:" + response);
      console.log("response:" + JSON.stringify(response));
      return response.json();
    }) //HTTP 응답
    .then((json) => {
      //{ status: "ok", result: 5 }
      console.log("json:" + json);
      console.log("response:" + JSON.stringify(json));

      window.location.href = "/admin";
    }) //실제 데이타
    .catch((error) => {
      console.log(error);
    });
}
function click_order() {
  let menu_member = document.getElementById("menu_member");
  let menu_item = document.getElementById("menu_item");
  let menu_order = document.getElementById("menu_order");

  menu_member.classList.remove("menu_height");
  menu_item.classList.remove("menu_height");
  menu_order.classList.remove("menu_height");

  menu_order.classList.add("menu_height");

  //페이지 이동
  window.location.href = "/admin_o";
}