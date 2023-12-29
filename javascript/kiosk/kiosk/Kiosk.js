window.onload = function () {
  var audio = new Audio("Touch_Order.mp3");
  audio.play();
  audio.autoplay = true;

  function goToOrderSelection() {
    window.location.href = "OrderSelect.html";
  }

  var selectButton = document.getElementById("selectButton");
  selectButton.addEventListener("click", goToOrderSelection);

  const images = [
    "https://i.pinimg.com/564x/d6/4b/bf/d64bbf0b7b8eb8f835f6892f1e58490b.jpg",
    "https://i.pinimg.com/564x/25/18/3b/25183b486dcfbe0f75eee9137eafa9c6.jpg",
    "https://i.pinimg.com/564x/c9/ed/3f/c9ed3f7564dfde8ae4ed4816736cd30f.jpg",
  ];
  const changingImage = document.getElementById("changingImage");
  let currentIndex = 0;

  function changeImage() {
    changingImage.src = images[currentIndex];
    currentIndex = (currentIndex + 1) % images.length;
  }

  setInterval(changeImage, 3000);
};
