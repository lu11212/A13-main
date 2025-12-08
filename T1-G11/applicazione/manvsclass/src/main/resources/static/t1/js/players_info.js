
const dataTable_lang_urls = {
    it: "/t1/js/i18n/it-IT.json",
    en: "/t1/js/i18n/en-GB.json",
}

const lang = getCookie("lang");

document.addEventListener("DOMContentLoaded", async function () {
    // Effettua una richiesta FETCH per ottenere la lista dei giocatori/studenti
    const playersData = await callGetAllPlayers();

    // Effettua una richiesta FETCH per ottenere i dati delle partite
    const gamesData = await callGetAllGames();

    if (playersData === null || gamesData === null)
        return;

    // Creiamo un oggetto per tenere traccia del conteggio, del tempo totale e dello score per ogni 'accountId'
    const accountStats = {};

    // Funzione per calcolare la differenza di tempo in secondi tra due date
    function calculateTimeDifference(startedAt, closedAt) {
        if (!closedAt) {
            return 0;
        }

        const startTimestamp = new Date(startedAt).getTime();
        const closedTimestamp = new Date(closedAt).getTime();
        return (closedTimestamp - startTimestamp) / 60000; // Ritorna la differenza in minuti
    }

    // Scansioniamo i dati e calcoliamo il conteggio, il tempo totale e lo score per ogni 'accountId'
    gamesData.forEach(entry => {
        const timeDifference = calculateTimeDifference(entry.startedAt, entry.closedAt);

        entry.players.forEach(player => {
            console.log("player", player);
            const accountId = player;

            // Aggiorniamo il conteggio, il tempo totale e lo score per ogni 'accountId'
            if (!accountStats[accountId]) {
                accountStats[accountId] = {
                    count: 1,
                    totalTime: timeDifference,
                    score: entry.score ? entry.score : 0
                };
            } else {
                accountStats[accountId].count++;
                accountStats[accountId].totalTime += timeDifference;
                accountStats[accountId].score += entry.score ? entry.score : 0;
            }
        });
    });

    // Aggiungiamo un campo 'position' per indicare la posizione in classifica
    playersData.forEach((student, index) => {
        student.position = index + 1;
    });

    // Combina le informazioni da studentsData e gameData.data in un'unica array
    const combinedData = playersData.map(student => {
        console.log("student", student);
        const accountId = student.id;  // Modifica la chiave in base alla tua struttura JSON
        const stats = accountStats[accountId] || {count: 0, totalTime: 0, score: 0};

        return {
            ...student,
            accountId: accountId,
            count: stats.count,
            totalTime: stats.totalTime.toFixed(2),
        };
    }).sort((a, b) => b.points - a.points)
        .map((student, index) => ({...student, position: index + 1}));

    // Manipola i dati combinati e crea la tabella con DataTables
    const table = $('#studentTable').DataTable({
        data: combinedData,
        columns: [
            {data: 'position'},
            {data: 'name'},
            {data: 'surname'},
            {data: 'email'},
            {data: 'studies'},
            {data: 'count'},
            {data: 'totalTime'}
        ],
        language: {
            url: dataTable_lang_urls[lang],
        }
    });

    $("#studentTable").css({"display": "block"});

});
