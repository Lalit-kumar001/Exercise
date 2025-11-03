


 var btn = document.getElementById("submit-btn");
  var Inputname = document.getElementById("Name");
  var Inputage = document.getElementById("Age");
  var form = document.getElementById("form");

  var nameError = document.getElementById("name-error");
  var ageError = document.getElementById("age-error");

  btn.addEventListener('click', function (event) {
    event.preventDefault();

 
    nameError.textContent = "";
    ageError.textContent = "";

    const name = Inputname.value.trim();
    const age = Inputage.value.trim();

  
    const namePattern = /^[A-Za-z\s]+$/;
    if (name === "") {
      nameError.textContent = "Please enter your name.";
      return;
    } else if (!namePattern.test(name)) {
      nameError.textContent = "Name must contain only letters.";
      return;
    }

    
    if (age === "") {
      ageError.textContent = "Please enter your age.";
      return;
    } else if (isNaN(age)) {
      ageError.textContent = "Age must be a number.";
      return;
    } else if (Number(age) < 18) {
      ageError.textContent = "Age must be 18 or above.";
      return;
    }

    alert("Form submitted successfully!");
    form.reset();
  });