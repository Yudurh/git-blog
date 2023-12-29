function noneSelect() {
  const selectedItems = JSON.parse(localStorage.getItem("selectedItems")) || [];

  if (selectedItems.length > 0) {
    const cartItems = JSON.parse(localStorage.getItem("cartItems")) || [];

    selectedItems.forEach((selectedItem) => {
      const existingItem = cartItems.find(
        (cartItem) => cartItem.id === selectedItem.id
      );

      if (existingItem) {
        existingItem.count += 1;
      } else {
        cartItems.push({ ...selectedItem, count: 1 });
      }
    });

    localStorage.setItem("cartItems", JSON.stringify(cartItems));
  }
  window.location.href = "Payment.html";
}

// 추천 메뉴 화면
const recommendItems = JSON.parse(localStorage.getItem("recommendItems")) || [];
const addItemsElement = document.querySelector(".addItems");

recommendItems.forEach((item) => {
  const itemElement = document.createElement("div");
  itemElement.classList.add("item");
  itemElement.setAttribute("data-item-id", item.id);
  itemElement.innerHTML = `
    <img src="${item.imageUrl}" alt="${item.title}" />
    <p class="itemTitle">${item.title}</p>
    <p class="itemPrice">${item.price}원</p>
  `;

  itemElement.addEventListener("click", () => {
    const itemId = itemElement.getAttribute("data-item-id");
    const selectedItem = recommendItems.find((item) => item.id === itemId);

    console.log("Selected Item:", selectedItem); // 디버깅용 출력

    if (selectedItem) {
      addItemToSelectedItems(selectedItem);
    }
  });

  addItemsElement.appendChild(itemElement);
});

// MenuSelect로 이동
function goToBack() {
  const selectedItems = JSON.parse(localStorage.getItem("selectedItems")) || [];
  const cartItems = JSON.parse(localStorage.getItem("cartItems")) || [];

  selectedItems.forEach((selectedItem) => {
    const existingItem = cartItems.find(
      (cartItem) => cartItem.id === selectedItem.id
    );

    if (existingItem) {
      existingItem.count += 1;
    } else {
      cartItems.push({ ...selectedItem, count: 1 });
    }
  });

  localStorage.setItem("cartItems", JSON.stringify(cartItems));
  localStorage.removeItem("selectedItems"); // 선택한 아이템 초기화
  window.location.href = "MenuSelect.html";
}

// 아이템을 카트에 추가하는 함수
function addItemToSelectedItems(item) {
  const selectedItems = JSON.parse(localStorage.getItem("selectedItems")) || [];
  const updatedItem = { ...item, name: item.title, imageUrl: item.imageUrl }; // 이미지 URL도 추가
  selectedItems.push(updatedItem);
  localStorage.setItem("selectedItems", JSON.stringify(selectedItems));
}
