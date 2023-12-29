function updateAction() {

  let noValue = document.getElementById("memberNo").value;
  let idValue = document.getElementById("memberId").value;
  let pwValue = document.getElementById("memberPw").value;
  let nameValue = document.getElementById("memberName").value;
  let roleValue = document.getElementById("memberRole").value;
  let pointValue = document.getElementById("memberPoint").value;
  let datetimeValue = document.getElementById("memberJoinDatetime").value;
  console.log(idValue);
  console.log(datetimeValue);

  let params = {
    memberNo: noValue,
    memberId: idValue,
    memberPw: pwValue,
    memberName: nameValue,
    memberRole: roleValue,
    memberPoint: pointValue,
    memberJoinDatetime: datetimeValue,
  };
  console.log(JSON.stringify(params));

  fetch("/upP1", {
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

function click_member() {
  let menu_member = document.getElementById("menu_member");
  let menu_item = document.getElementById("menu_item");
  let menu_order = document.getElementById("menu_order");

  menu_member.classList.remove("menu_height");
  menu_item.classList.remove("menu_height");
  menu_order.classList.remove("menu_height");

  menu_member.classList.add("menu_height");

  //페이지 이동
  window.location.href = "/admin";
}