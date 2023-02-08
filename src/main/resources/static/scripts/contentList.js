const checkbox = document.
getElementById("content-cb");
alert(checkbox)
checkbox.addEventListener("click", unrollList);


const content = document.querySelector(".page-content")

alert(content.classList)

function unrollList(){
    if(checkbox.checked){
        content.classList.add("active")
        console.log("b")
    } else {
        console.log("a")
        content.classList.remove("active")
    }
}