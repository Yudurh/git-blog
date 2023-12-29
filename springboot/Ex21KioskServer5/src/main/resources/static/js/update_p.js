function update_pAction() {
  let nameValue = document.getElementById("itemName").value;
  let priceValue = document.getElementById("itemPrice").value;
  let imgValue = document.getElementById("itemImageUrl").value;
  let codeValue = document.getElementById("itemCode").value;
  let cateValue = document.getElementById("itemCate").value;
  let datetimeValue = document.getElementById("itemUpdateDatetime").value;
  let recommendValue = document.getElementById("itemRecommend").value;
  let noValue = document.getElementById("itemNo").value;



  let params = {
    itemName: nameValue,
    itemPrice: priceValue,
    itemCate: cateValue,
    itemImageUrl: imgValue,
    itemCode: codeValue,
    itemUpdateDatetime: datetimeValue,
    itemRecommend: recommendValue,
    itemNo: noValue,
  };
  console.log(JSON.stringify(params));

  fetch("/update_p1", {
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

      window.location.href = "/admin_p";
    }) //실제 데이타
    .catch((error) => {
      console.log(error);
    });
}
function click_item() {
  let menu_member = document.getElementById("menu_member");
  let menu_item = document.getElementById("menu_item");
  let menu_order = document.getElementById("menu_order");

  menu_member.classList.remove("menu_height");
  menu_item.classList.remove("menu_height");
  menu_order.classList.remove("menu_height");

  menu_item.classList.add("menu_height");

  //페이지 이동
  window.location.href = "/admin_p";
}