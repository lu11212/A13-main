import {VIEWS} from "./utils/endpoints.js";
import {callRegisterUser} from "./utils/api.js";
import {addErrorDiv, clearPreviousErrorsMsgs} from "./utils/renderErrors.js";


document.getElementById("login_admin_redirect_btn").addEventListener("click", () => {
  window.location.href=VIEWS.LOGIN_ADMIN;
});

document.getElementById("login_user_redirect_btn").addEventListener("click", () => {
  window.location.href=VIEWS.LOGIN_USER;
});

document.getElementById("registerUser_from").addEventListener('submit', async (event) => {
  event.preventDefault();

  const name = document.getElementById("name").value.trim();
  const surname = document.getElementById("surname").value.trim();
  const email = document.getElementById("email").value.trim();
  const password = document.getElementById("password").value.trim();
  const passwordCheck = document.getElementById("passwordCheck").value.trim();
  const studies = document.getElementById("studies").value;

  const fields_id = ["name_label_container", "surname_label_container", "email_label_container",
    "password_label_container", "passwordCheck_label_container", "studies_label_container"];
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

  await callRegisterUser({name, surname, email, password, passwordCheck, studies});
});

