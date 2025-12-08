import {addErrorDiv, clearPreviousErrorsMsgs} from "./utils/renderErrors.js";
import {callRegisterAdmin} from "./utils/api.js";

document.getElementById("adminRegister_form").addEventListener("submit", async function (e) {
    e.preventDefault(); // blocco il submit classico

    const name = document.getElementById("name").value.trim();
    const surname = document.getElementById("surname").value.trim();
    const email = document.getElementById("email").value.trim();
    const password = document.getElementById("password").value.trim();
    const passwordCheck = document.getElementById("passwordCheck").value.trim();

    const fields_id = ["name_label_container", "surname_label_container", "email_label_container",
        "password_label_container", "passwordCheck_label_container"];
    clearPreviousErrorsMsgs(fields_id);

    // Validazione lato client
    if (name === '') {
        addErrorDiv(document.getElementById("name_label_container"), errors.nameEmpty);
        return;
    }

    if (surname === '') {
        addErrorDiv(document.getElementById("surname_label_container"), errors.surnameEmpty);
        return;
    }

    if (email === '') {
        addErrorDiv(document.getElementById("email_label_container"), errors.emailEmpty);
        return;
    }

    if (password === '') {
        addErrorDiv(document.getElementById("password_label_container"), errors.passwordEmpty);
        return;
    }

    if (passwordCheck === '' || password !== passwordCheck) {
        addErrorDiv(document.getElementById("passwordCheck_label_container"), errors.passwordNotEquals);
        return;
    }

    await callRegisterAdmin({name, surname, email, password, passwordCheck});
});
