fetch('data.json')
  .then(response => response.json())
  .then(data => {
    const output = document.getElementById("output");
    data.forEach(student => {
      const div = document.createElement("div");
      div.className = "card";
      div.innerHTML = `<strong>ID:</strong> ${student.id} <br>
                       <strong>Name:</strong> ${student.name} <br>
                       <strong>Course:</strong> ${student.course}`;
      output.appendChild(div);
    });
  })
  .catch(error => console.error("Error fetching JSON:", error));
