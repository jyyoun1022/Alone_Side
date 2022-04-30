

let clicked = []
const onSelect = (item) => {
    if(clicked.length === 0 ){
    let allButton = document.querySelectorAll('.lang-btn');
    allButton.forEach((item)=>{
        item.classList.add('off');
    })
    item.classList.add('clicked'); 
    item.classList.remove('off')
    clicked.push(item.value)  
    
    } 

    else if(item.className === 'lang-btn clicked' && clicked.length === 1){
        item.classList.remove('clicked');

        let allOffButton = document.querySelectorAll('.off');
        allOffButton.forEach((item)=>{
            
            item.classList.remove('off');
        })
        clicked.pop();
    }
    
    else if(item.className === 'lang-btn clicked'){
        item.classList.remove('clicked');
        item.classList.add('off');
        clicked.pop();
    }

    else if(item.className === 'lang-btn off'){
        item.classList.remove('off');
        item.classList.add('clicked');
        clicked.push(item.value);
    }

   
       
   
    
}