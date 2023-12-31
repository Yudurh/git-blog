window.onload = function () {
  var audio = new Audio("Select_Place.mp3");
  audio.play();
  audio.autoplay = true;
};

// 식사 장소 선택
function inStore() {
  window.location.href = "/takeOut/0";
}
function takeOut() {
  window.location.href = "/takeOut/1";
}

var storeButton = document.getElementById("storeButton");
storeButton.addEventListener("click", inStore);
var takeOutButton = document.getElementById("takeOutButton");
takeOutButton.addEventListener("click", takeOut);

document.getElementById("EngButton").addEventListener("click", function () {
  // "매장에서 식사" 영어로 변경
  document.querySelector("#dineIn").textContent = "Dine In";

  // "테이크 아웃" 영어로 변경
  document.querySelector("#takeOut").textContent = "Take Out";

  document.querySelector("#select_txt").textContent =
    "Please select a place to eat.";
});

document.getElementById("KorButton").addEventListener("click", function () {
  // "매장에서 식사" 한국어로 변경
  document.querySelector("#dineIn").textContent = "매장에서 식사";

  // "테이크 아웃" 한국어로 변경
  document.querySelector("#takeOut").textContent = "테이크 아웃";

  document.querySelector("#select_txt").textContent =
    "식사하실 장소를 선택해주세요.";
});
