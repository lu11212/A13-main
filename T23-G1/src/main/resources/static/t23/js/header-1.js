import {VIEWS} from "./utils/endpoints.js";

document.getElementById("home_redirect_btn").addEventListener("click", () => {
    window.location.href=VIEWS.HOME;
});

document.getElementById("register_user_redirect_btn").addEventListener("click", () => {
    window.location.href=VIEWS.REGISTER_USER;
});
