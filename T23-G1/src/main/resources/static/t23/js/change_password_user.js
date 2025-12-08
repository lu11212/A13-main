import {addErrorDiv, clearPreviousErrorsMsgs} from "./utils/renderErrors.js";
import {callChangePasswordUser} from "./utils/api.js";

document.getElementById("password_change_user_form").addEventListener("submit", async (event) => {
  e.preventDefault(); // blocco il submit classico
  const email = document.getElementById('email').value;
  const passwordResetToken = document.getElementById('passwordResetToken').value;
  const password = document.getElementById('password').value;
  const passwordCheck = document.getElementById('password').value;

  const fields_id = ["email_label_container", "resetToken_label_container", "password_label_container",
    "passwordCheck_label_container"];
  clearPreviousErrorsMsgs(fields_id);

  if (email === '') {
    addErrorDiv(document.getElementById("email_label_container"), errors.emailEmpty);
    return;
  }

  if (passwordResetToken === '') {
    addErrorDiv(document.getElementById("passwordResetToken_label_container"), errors.emailEmpty);
    return;
  }

  if (password === '') {
    addErrorDiv(document.getElementById("password_label_container"), errors.passwordEmpty);
    return;
  }

  if (passwordCheck === '') {
    addErrorDiv(document.getElementById("email_label_container"), errors.passwordNotEquals);
    return;
  }

  const data = {
    email: email,
    passwordResetToken: resetToken,
    password: password,
    passwordCheck: passwordCheck,
  };

  await callChangePasswordUser(data);
});