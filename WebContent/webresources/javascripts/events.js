var alternador = document.querySelector('.js-botao-chaveador');

alternador.onclick = function(){
	var menu = document.querySelector('.js-menu');

	/*toggle é chavear, então quando não estiver com essa classe css seta ele quando estiver retira */
	menu.classList.toggle('menu--exibindo');
}

