const APIURL = 'http://localhost/robot?mes='

const main = document.getElementById('main')
const form = document.getElementById('form')
const search = document.getElementById('search')

async function getUser(username) {
    try {
        const { data } = await axios.get(APIURL + username)
        createUserCard(data)
    } catch(err) {
        if(err.response.status == 404) {
            createErrorCard('i donot know!!!0o0')
        }
    }
}

function createUserCard(user) {
    const cardHTML = `
    <div class="card">
    <div>
      <img src="https://avatars.githubusercontent.com/u/1836624?v=4" class="avatar">
    </div>
    <div class="user-info">
      <h2>Gin Robot</h2>
      <p>hi i am RoBbo by panther</p>
      <ul>
        <li>${user.content} <strong>^_^</strong></li>
      </ul>
      <div id="repos"></div>
    </div>
  </div>
    `
    main.innerHTML = cardHTML

}

function createErrorCard(msg) {
    const cardHTML = `
        <div class="card">
            <h1>${msg}</h1>
        </div>
    `
    main.innerHTML = cardHTML
}

form.addEventListener('submit', (e) => {
    e.preventDefault()

    const user = search.value

    if(user) {
        getUser(user)
        search.value = ''
    }
})

