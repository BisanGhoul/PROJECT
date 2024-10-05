const experience= document.getElementById('experience');

experience.addEventListener('mouseenter', () => {
    experience.style.backgroundColor= 'yellow'; 
  });
  experience.addEventListener('mouseleave', () => {
    experience.style.backgroundColor = 'transparent'; // Change background color when hovered
  });

  function showFact(){
    const experience= document.getElementById('fact');
    experience.style.display='block';


  }

  function checkFields(){
    const email= document.getElementById('email');
    let emailStr = email.value;
    let arr = emailStr.split('@');
    const name = document.getElementById('name').value;

    if (name === '') {
        alert("name is required");
        return false; 
    }
    if(arr.length === 2 && emailStr.includes('.com'))
        return true;
    else {
        alert("enter a valid email");
        return false;
    }
  }

  function toggle() {
    const contactForm= document.getElementById('contactmeid');
    if (contactForm.style.display === 'none') {
        contactForm.style.display = 'block'; 
    } else {
        contactForm.style.display = 'none'; 
    }
}
