async function showServerNewConcepts (){
    const responseFromServer = await fetch('/myportfolio');
    const textFromResponse = await responseFromServer.text();

    const desserts = await responseFromServer.json();

    console.log(desserts.cheesecake);
    console.log(desserts.cupcake);
    console.log(desserts.Icecream);
    
    /*const newconceptsContainer = document.getElementById('newconcepts-container');
    newconceptsContainer.innerText = textFromResponse;*/
}

