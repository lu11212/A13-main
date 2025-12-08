const API_PREFIX = "/api/userService";

const VIEWS = {
    HOME: "/home",
    LOGIN_USER: "/login",
    LOGIN_ADMIN: "/admin/login",
    REGISTER_USER: "/register",
    REGISTER_ADMIN: "/admin/register",
    RESET_PASSWORD_USER: "/reset_password",
    RESET_PASSWORD_ADMIN: "/admin/reset_password",
    CHANGE_PASSWORD_USER: "/change_password",
    CHANGE_PASSWORD_ADMIN: "/admin/change_password",
    REGISTRATION_SUCCESS_USER: "/register/success",
    MAIN_ADMIN: "/dashboard",
    MAIN_USER: "/main",
};

const APIS = {
    LOGIN_USER: `${API_PREFIX}/auth/login`,
    LOGIN_ADMIN: `${API_PREFIX}/auth/admin/login`,
    REGISTER_USER: `${API_PREFIX}/auth/register`,
    REGISTER_ADMIN: `${API_PREFIX}/auth/admin/register`,
    RESET_PASSWORD_USER: `${API_PREFIX}/auth/reset_password`,
    RESET_PASSWORD_ADMIN: `${API_PREFIX}/auth/admin/reset_password`,
    CHANGE_PASSWORD_USER: `${API_PREFIX}/auth/change_password`,
    CHANGE_PASSWORD_ADMIN: `${API_PREFIX}/auth/admin/change_password`,
};

export { APIS, VIEWS };
