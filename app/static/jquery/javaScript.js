 <!--//jQuery(function($){
   //$("#date").inputmask("99/99/9999",{placeholder:"mm/dd/yyyy"});
   //$("#telefone").inputmask("(27) 99999-9999");		   
//});-->

/*function validateForm()
{	
	var x =window.document.getElementById("formCadastroOs");
	//window.alert(x);
	//alert(x.length);
	var y;
	var i;
	var campos=[];
	var confirmar=true;
	for (i = 0; i < (x.length-1); i++) {
		
		y=x[i]; //nome do form e nome do campo são case sensitive (a <> A)
		//alert(y.id);
		if ((y.value==null || y.value=="") && y.id!="botao-salvar-os")
		{	
			campos.push(y.id);
			confirmar=false;
			//alert(campos);
			//alert("O campo nome é obrigatorio");
			//validateForm.preventDefault();			
		}
	}

	if (confirmar==true) {
		return confirmar;
	}else{
		alert("Os campos "+campos+" são obrigatórios!");
		return confirmar;
	}
	
	
	
}*/

function duplicarCampos(){
	var clone = document.getElementById('origem').cloneNode(true);
	var destino = document.getElementById('destino');
	destino.appendChild (clone);
	var camposClonados = clone.getElementsById('copiar');
	for(i=0; i<camposClonados.length;i++){
		camposClonados[i].value = '';
	}
}
function removerCampos(id){
	var node1 = document.getElementById('destino');
	node1.removeChild(node1.childNodes[0]);
}

$('.input-daterange').datepicker({
});

function validateForm(z)
{	
	var x =window.document.getElementById(z);
	//window.alert(x);
	//alert(x.length);

	var y;
	var i;
	var campos=[];
	var confirmar;
	for (i = 0; i < (x.length-1); i++) {
		
		y=x[i]; //nome do form e nome do campo são case sensitive (a <> A)
		//alert(y.value);
		if (((y.getAttribute('goiabinha')!=null) && (y.getAttribute('goiabinha')!=2) && (y.id!="botao-salvar-usuario")&& (y.id!="botao-voltar") && (y.id!="botao-salvar-os")) || ((y.value==null || y.value=="")&&(y.id!="idbairro")&&(y.id!="botao-salvar-usuario")&&(y.id!="botao-salvar-os")&&(y.id!="idos")))
		{	
			campos.push(y.id);
			confirmar=false;
			//alert(campos);
			//alert("O campo nome é obrigatorio");
			//validateForm.preventDefault();			
		}
	}

	if (confirmar==true) {
		return confirmar;
	}else if(confirmar==false){
		bootbox.alert("O(s) campo(s) "+campos+" é(são) obrigatório(s)!");
		//alert("Os campos "+campos+" são obrigatórios!");
		return confirmar;
	}


}


function confirmar(){

	var clone = document.getElementById('origem').cloneNode(true);
	var destino = document.getElementById('destino');
	destino.appendChild (clone);
	var camposClonados = clone.getElementsById('copiar');
	for(i=0; i<camposClonados.length;i++){
		camposClonados[i].value = '';
	}

}

function confirmarUsuario($id){
	
	bootbox.confirm("Tem certeza que deseja deletar ?",function(res){
		if (res == true) {
			window.location = "http://localhost/Homologacao/src/controllerusuariodeletar.php/id="+$id;
		}
	});

}

function confirmarBairro($id){
	
	bootbox.confirm("Tem certeza que deseja deletar ?",function(res){
		if (res == true) {
			window.location = "http://localhost/Homologacao/src/controllerbairrodeletar.php/id="+$id;
		}
	});

}

function confirmarTipo($id){
	
	bootbox.confirm("Tem certeza que deseja deletar ?",function(res){
		if (res == true) {
			window.location = "http://localhost/Homologacao/src/controllertipodeletar.php/id="+$id;
		}
	});

}

function confirmarSaida($id){
	
	bootbox.confirm("Tem certeza que deseja sair ?",function(res){
		if (res == true) {
			window.location = "http://localhost/Homologacao/src/controllertipodeletar.php/id="+$id;
		}
	});

}
