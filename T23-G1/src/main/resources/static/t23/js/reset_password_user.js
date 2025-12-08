import {VIEWS} from "./utils/endpoints.js";
import {addErrorDiv, clearPreviousErrorsMsgs} from "./utils/renderErrors.js";
import {callResetPasswordUser} from "./utils/api.js";


document.getElementById("password_change_user_redirect_button").addEventListener("click", () => {
    window.location.href=VIEWS.HOME;
});

document.getElementById("passwordResetUser_form").addEventListener("submit", async function (e) {
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

    await callResetPasswordUser(data);
});
