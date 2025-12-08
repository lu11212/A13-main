/*      Utility functions        */

import {addErrorDiv} from "./renderErrors.js";
import {APIS, VIEWS as VIES, VIEWS} from "./endpoints.js";

function executeFetch(url, init) {
    return fetch(url, {
        ...init,
        credentials: 'include'
    });
}

async function handleApiErrors(response) {
    try {
        const errorBody = await response.json();
        console.error('Errore dalla risposta:', errorBody);

        if (errorBody?.errors?.length > 0) {
            errorBody.errors.forEach(err => {
                const container = document.getElementById(`${err.field}_label_container`);
                if (container) {
                    addErrorDiv(container, err.message);
                } else {
                    alert(err.message);
                }
            });
        } else {
            alert(errors.notHandled);
        }
    } catch (e) {
        console.error('Errore durante la lettura del corpo JSON:', e);
        alert(errors.notHandled);
    }
}

async function redirectOnSuccessTemplate({ url, method, headers, body, redirectTo }) {
    try {
        const response = await executeFetch(url, {method, headers, body});

        if (response.ok) {
            window.location.href = redirectTo;
            return;
        }

        await handleApiErrors(response);
    } catch (err) {
        console.error(`Errore nella chiamata ${method} ${url}:`, err);
        alert(errors.notHandled);
    }
}

/*      API calls        */

export async function callLoginUser(data) {
    await redirectOnSuccessTemplate({
        url: APIS.LOGIN_USER,
        method: "POST",
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data),
        redirectTo: VIEWS.MAIN_USER
    });
}

export async function callRegisterUser(data) {
    await redirectOnSuccessTemplate({
        url: APIS.REGISTER_USER,
        method: "POST",
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data),
        redirectTo: VIEWS.REGISTRATION_SUCCESS_USER
    });
}

export async function callLoginAdmin(data) {
    await redirectOnSuccessTemplate({
        url: APIS.LOGIN_ADMIN,
        method: "POST",
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data),
        redirectTo: VIEWS.MAIN_ADMIN
    });
}

export async function callRegisterAdmin(data) {
    await redirectOnSuccessTemplate({
        url: APIS.REGISTER_ADMIN,
        method: "POST",
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data),
        redirectTo: VIEWS.LOGIN_ADMIN
    });
}

export async function callResetPasswordAdmin(data) {
    await redirectOnSuccessTemplate({
        url: APIS.RESET_PASSWORD_ADMIN + "?" + new URLSearchParams(data),
        method: "POST",
        headers: { 'Content-Type': 'application/json' },
        body: null,
        redirectTo: VIES.CHANGE_PASSWORD_ADMIN
    });
}

export async function callChangePasswordAdmin(data) {
    await redirectOnSuccessTemplate({
        url: APIS.CHANGE_PASSWORD_ADMIN,
        method: "POST",
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data),
        redirectTo: VIEWS.LOGIN_ADMIN
    });
}

export async function callResetPasswordUser(data) {
    await redirectOnSuccessTemplate({
        url: APIS.RESET_PASSWORD_USER + "?" + new URLSearchParams(data),
        method: "POST",
        headers: { 'Content-Type': 'application/json' },
        body: null,
        redirectTo: VIES.CHANGE_PASSWORD_USER
    });
}

export async function callChangePasswordUser(data) {
    await redirectOnSuccessTemplate({
        url: APIS.CHANGE_PASSWORD_USER,
        method: "POST",
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data),
        redirectTo: VIEWS.LOGIN_USER
    });
}

