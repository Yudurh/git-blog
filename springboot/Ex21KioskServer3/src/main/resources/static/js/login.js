window.onload = function () {};

function loginAction() {
  let inputId = document.getElementById("inputId").value;
  let inputPw = document.getElementById("inputPw").value;
  console.log("inputId:" + inputId);
  console.log("inputPw:" + inputPw);

  let params = {
    inputid: inputId,
    inputpw: inputPw,
  };

  fetch("/loginAction", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(params),
  })
    .then((response) => {
      console.log("response:" + response);
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
