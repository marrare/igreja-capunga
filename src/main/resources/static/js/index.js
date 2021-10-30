$(document).ready(function(){
    if($('.slider').length) $('.slider').slider();
    if($('.stepper').length) $('.stepper').activateStepper();
    if($('select').length) $('select').formSelect();
    if($('select').length) $('.datepicker').datepicker();
});

function checkBatismo(checked) {
	if(checked) $("#batismo").show();
	else $("#batismo").hide();
}

function checkAclamacao(checked) {
	if(checked) $("#aclamacao").show();
	else $("#aclamacao").hide();
}

function checkCarta(checked) {
	if(checked) $("#carta").show();
	else $("#carta").hide();
}