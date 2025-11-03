// (function pageLoad() {
//     console.log("working")
//     var submitBtn = document.getElementById("Submit-product");
//     var product_container = document.getElementById("product-container");
//     var form = document.getElementById("pop-up");
//     var maxProduct = document.getElementById("maxPrice");
//     const priceArr = [];

//     // max function 

//     function Maxx() {
//         console.log(arguments)
//         if (arguments.length != 0) {
//             let maxi = arguments[0];
//             for (let i = 1; i < arguments.length; i++) {
//                 if (maxi < arguments[i]) {
//                     maxi = arguments[i];
//                 }
//             }
//  maxProduct.innerHTML = `Maximum Product price is ${maxi}`;
//             // console.log(maxi);

//         }
//     }

//     //constructor function 

//     function Product(name, price, category) {
//         this.name = name;
//         this.price = price;
//         this.category = category;
//     }

//     Product.prototype.getDiscount = function (percent) {
//         return this.price - (this.price * percent) / 100;
//     };


//     submitBtn.addEventListener("click", (event) => {
//         event.preventDefault();
//         // console.log("submit");

//         //fetching values
//         var name = document.getElementById("product-name").value;
//         var price = document.getElementById("product-price").value;
//         var category = document.getElementById("product-category").value;



//         priceArr.push(price);
//         console.log(priceArr)


//         // creating product 
//         var newProduct = new Product(name, price, category);


//         //adding on display
//         const productBox = document.createElement('div');
//         const prodName = document.createElement('h1');
//         prodName.textContent = newProduct.name;
//         const prodPrice = document.createElement('h2');
//         prodPrice.textContent = newProduct.price;
//         const prodCat = document.createElement('h3');
//         prodCat.textContent = newProduct.price;

//         // discount percentage input
//         const discountInput = document.createElement("input");
//         discountInput.setAttribute("type", "number");
//         discountInput.setAttribute("placeholder", "Enter discount %");

//         // discount percentage output /

//         const discountPrice = document.createElement("p");
//         discountPrice.textContent = "discount price";


//         const submitDiscount = document.createElement("button", "Submit");
//         submitDiscount.classList.add("btn");
//         submitDiscount.textContent = "submit";


//         submitDiscount.addEventListener("click", () => {
//             let percent = parseFloat(discountInput.value);
//             if (isNaN(percent) || percent < 0) {
//                 discountedPrice.textContent = "Invalid discount";
//             } else {
//                 let final = newProduct.getDiscount(percent);
//                 discountPrice.textContent = `Discounted Price: ₹${final.toFixed(2)}`;
//             }
//         })


//         productBox.appendChild(prodName);
//         productBox.appendChild(prodPrice);
//         productBox.appendChild(prodCat);
//         productBox.appendChild(discountInput);
//         productBox.appendChild(submitDiscount);
//         productBox.appendChild(discountPrice);
//         product_container.appendChild(productBox);

//         //adding hover event

//         productBox.addEventListener("mouseover", () => {
//             productBox.classList.toggle('scale-up');
//         })
//         productBox.addEventListener("mouseout", () => {
//             productBox.classList.toggle('scale-up');
//         })

//         //call max functiom 

//         if (priceArr.length != 0) {
//             Maxx.apply(null, priceArr);
//             // Maxx(priceArr);
//         }



//         form.reset();
//     })






// })()

(function pageLoad() {
    console.log("working");
    var submitBtn = document.getElementById("Submit-product");
    var product_container = document.getElementById("product-container");
    var form = document.getElementById("pop-up");
    var maxProduct = document.getElementById("maxPrice");
    const priceArr = [];

    // max function 
    function Maxx() {
        if (arguments.length != 0) {
            let maxi = arguments[0];
            for (let i = 1; i < arguments.length; i++) {
                if (maxi < arguments[i]) {
                    maxi = arguments[i];
                }
            }
            maxProduct.innerHTML = `Maximum Product price is ${maxi}`;
        }
    }

    // constructor function 
    function Product(name, price, category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    Product.prototype.getDiscount = function (percent) {
        return this.price - (this.price * percent) / 100;
    };

    submitBtn.addEventListener("click", (event) => {
        event.preventDefault();

        //fetching values
        var name = document.getElementById("product-name").value.trim();
        var price = document.getElementById("product-price").value.trim();
        var category = document.getElementById("product-category").value.trim();

        if (name === "" || price === "" || category === "") {
            alert("Please fill all product details before submitting!");
            return;
        }

        // price check kr raha hu number h ki nahi
        if (isNaN(price) || price <= 0) {
            alert("Please enter a valid price!");
            return;
        }

        price = parseFloat(price);
        priceArr.push(price);

        // creating product 
        var newProduct = new Product(name, price, category);

        //display pr show krna
        const productBox = document.createElement('div');
        productBox.classList.add('product-box');

        const prodName = document.createElement('h1');
        prodName.textContent = newProduct.name;

        const prodPrice = document.createElement('h2');
        prodPrice.textContent = `₹${newProduct.price}`;

        const prodCat = document.createElement('h3');
        prodCat.textContent = newProduct.category;

        // discount input
        const discountInput = document.createElement("input");
        discountInput.setAttribute("type", "number");
        discountInput.setAttribute("placeholder", "Enter discount %");

        const discountPrice = document.createElement("p");
        discountPrice.textContent = "Discounted Price: ";

        const submitDiscount = document.createElement("button");
        submitDiscount.classList.add("btn");
        submitDiscount.textContent = "Apply Discount";

        submitDiscount.addEventListener("click", () => {
            let percent = parseFloat(discountInput.value);
            if (isNaN(percent) || percent < 0) {
                discountPrice.textContent = "Invalid discount!";
            } else {
                let final = newProduct.getDiscount(percent);
                discountPrice.textContent = `Discounted Price: ₹${final.toFixed(2)}`;
            }
        });

        productBox.appendChild(prodName);
        productBox.appendChild(prodPrice);
        productBox.appendChild(prodCat);
        productBox.appendChild(discountInput);
        productBox.appendChild(submitDiscount);
        productBox.appendChild(discountPrice);
        product_container.appendChild(productBox);

    
        productBox.addEventListener("mouseover", () => {
            productBox.classList.add('scale-up');
        });
        productBox.addEventListener("mouseout", () => {
            productBox.classList.remove('scale-up');
        });

        // calling maxx function 
        if (priceArr.length != 0) {
            Maxx.apply(null, priceArr);
        }

        form.reset();
    });
})();
