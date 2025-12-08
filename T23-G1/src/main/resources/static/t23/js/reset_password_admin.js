import {VIEWS} from "./utils/endpoints.js";
import {addErrorDiv, clearPreviousErrorsMsgs} from "./utils/renderErrors.js";
import {callResetPasswordAdmin} from "./utils/api.js";


document.getElementById("password_change_admin_redirect_btn").addEventListener("click", () => {
    window.location.href=VIEWS.CHANGE_PASSWORD_ADMIN;
});

document.getElementById("adminResetPassword_form").addEventListener("submit", async function (e) {
    e.preventDefault(); // blocco il submit classico
    const email = document.getElementById('email').value;

    const fields_id = ["email_label_container"];
    clearPreviousErrorsMsgs(fields_id);

    if (email === '') {
        addErrorDiv(document.getElementById("email_label_container"), errors.emailEmpty);
        return;
    }

    const data = {
        email: email
    };

    await callResetPasswordAdmin(data);
});