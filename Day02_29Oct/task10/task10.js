
console.log("JS Connected ");

const addBtn = document.getElementById("AddStudent");
const tableBody = document.getElementById("StudentTable").getElementsByTagName("tbody")[0];

// localStorage se data fetch karo
let students = JSON.parse(localStorage.getItem("studentDetail")) || [];

//  Table render karne ka function
function renderTable() {
  tableBody.innerHTML = "";

  students.forEach((student) => {
    const row = tableBody.insertRow();
    row.insertCell(0).textContent = student.name;
    row.insertCell(1).textContent = student.mark1;
    row.insertCell(2).textContent = student.mark2;
    row.insertCell(3).textContent = student.mark3;
    row.insertCell(4).textContent = student.mark4;
    row.insertCell(5).textContent = student.mark5;
    row.insertCell(6).textContent = student.total;
    row.insertCell(7).textContent = student.average.toFixed(2);
  });
}

// Add Student Button
addBtn.addEventListener("click", () => {
  let name = prompt("Enter Student Name:");
  while (!name || name.trim() === "") {
    name = prompt("Please enter a valid student name:");
  }

  const marks = [];
  for (let i = 0; i < 5; i++) {
    let mark = parseInt(prompt(`Enter marks for subject ${i + 1} (0–100):`));
    while (isNaN(mark) || mark < 0 || mark > 100) {
      mark = parseInt(prompt(`Please enter valid marks for subject ${i + 1} (0–100):`));
    }
    marks.push(mark);
  }

  const total = marks.reduce((a, b) => a + b, 0);
  const average = total / marks.length;

  const newStudent = {
    name: name.trim(),
    mark1: marks[0],
    mark2: marks[1],
    mark3: marks[2],
    mark4: marks[3],
    mark5: marks[4],
    total,
    average,
  };

  students.push(newStudent);
  localStorage.setItem("studentDetail", JSON.stringify(students));

  renderTable();
  alert("Student added successfully!");
});

renderTable();
