
export function clearPreviousErrorsMsgs(elements) {
    elements.forEach(id => {
        let elem = document.getElementById(id);
        let childNum = elem.children.length
        for (let i = 0; i < childNum - 1; i++)
            elem.removeChild(elem.lastChild);
    });
}

export function addErrorDiv(parent, msg) {
    const errorElement = document.createElement('div');
    errorElement.classList.add('error-message');
    errorElement.style.color = 'red';
    errorElement.style.fontSize = "12px";
    errorElement.innerText = " - " + msg;
    parent.appendChild(errorElement);
}
