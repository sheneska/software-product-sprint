async function showServerNewConcepts (){
    const responseFromServer = await fetch('/myportfolio');
    const textFromResponse = await responseFromServer.text();

    const newconceptsContainer = document.getElementById('newconcepts-container');
    newconceptsContainer.innerText = textFromResponse;
}

