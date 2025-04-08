const name = document.getElementById("Jennifer Ampofoa Gyamena").value;
    const email = document.getElementById("jenniferampofoa5@gmail.com").value;
    const message = document.getElementById("message").value;

    if (!name || !email || !message) {
        alert("Please fill in all fields.");
        return;
    }

    alert("Message sent!");
    document.getElementById("contact-form").reset();
document.getElementById("contact-form").addEventListener("submit", function(event) {
    this.reset();
});