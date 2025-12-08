
// Mappa id pulsanti a view
const links = {
    navDashboardAdmin: VIEWS.DASHBOARD_ADMIN,
    navOpponentsMain: VIEWS.OPPONENTS_MAIN,
    navDashboardAdmin2: VIEWS.DASHBOARD_ADMIN,
    navOpponentsUpload: VIEWS.OPPONENTS_UPLOAD,
    linkSortByDate: VIEWS.OPPONENTS_SORT_BY_DATE,
    linkSortByName: VIEWS.OPPONENTS_SORT_BY_NAME,
    linkFilterDifficultyEasy: VIEWS.OPPONENTS_FILTER_DIFFICULTY_EASY,
    linkFilterDifficultyMedium: VIEWS.OPPONENTS_FILTER_DIFFICULTY_MEDIUM,
    linkFilterDifficultyHard: VIEWS.OPPONENTS_FILTER_DIFFICULTY_HARD,
};

assignUrls(links);

document.getElementById("searchForm").addEventListener("search", event => {
    event.preventDefault(); // Previene il comportamento di submit standard

    const searchValue = document.getElementById('searchInput').value.trim();
    const url = new URL(VIEWS.OPPONENTS_MAIN, window.location.origin);

    if (searchValue) {
        url.searchParams.set("search", searchValue);
    }

    // Mantengo gli eventuali parametri già presenti
    const currentParams = new URLSearchParams(window.location.search);
    if (currentParams.has("sortBy")) {
        url.searchParams.set("sortBy", currentParams.get("sortBy"));
    }
    if (currentParams.has("filterByDifficulty")) {
        url.searchParams.set("filterByDifficulty", currentParams.get("filterByDifficulty"));
    }

    window.location.href = url.toString();
});

async function downloadClassUT(classUTName) {
    try {
        const blob = await callDownloadClassUT(classUTName);

        if (!blob) {
            throw new Error("Blob non valido o download fallito");
        }

        const link = document.createElement('a');
        link.href = URL.createObjectURL(blob);
        link.download = classUTName + ".java";
        document.body.appendChild(link);
        link.click();
        document.body.removeChild(link);
        URL.revokeObjectURL(link.href);
    } catch (err) {
        console.error("Errore nel download:", err);
        alert("Si è verificato un errore durante il download.");
    }
}

async function deleteClassUT(classUTName) {
    await callDeleteClassUT(classUTName);
}
