
document.addEventListener("DOMContentLoaded", async function () {

    const dataTable_lang_urls = {
        it: "/t1/js/i18n/it-IT.json",
        en: "/t1/js/i18n/en-GB.json",
    }

    const lang = getCookie("lang");

    const admins = await callGetAllAdmins();

    if (admins) {
        console.log(admins);
        const table = $('#adminTable').DataTable({
            data: admins,
            columns: [
                {data: 'email'},
                {data: 'name'},
                {data: 'surname'},
            ],
            language: {
                url: dataTable_lang_urls[lang],
            }
        });

        // Mostra la tabella una volta caricati i dati
        table.draw();

        // Aggiungi la funzionalità di ricerca
        $('#searchInput').on('keyup', function () {
            table.search(this.value).draw();
        });
    }
});