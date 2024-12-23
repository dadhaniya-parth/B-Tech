let array = [];

function addItem() {
    const input = document.getElementById("input").value;
    array.push(input);
    displayArray();
}

function updateItem() {
    const index = document.getElementById("index").value;
    const input = document.getElementById("input").value;
    if (index >= 0 && index < array.length) {
        array[index] = input;
        displayArray();
    } else {
        alert("Invalid index.");
    }
}

function deleteItem() {
    const index = document.getElementById("index").value;
    if (index >= 0 && index < array.length) {
        array.splice(index, 1);
        displayArray();
    } else {
        alert("Invalid index.");
    }
}

function displayArray() {
    const output = document.getElementById("output");
    output.textContent = "Array: " + array.join(", ");
}