package br.com.apess.contatos

import android.content.pm.PackageManager
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastra_contato.*
import java.util.jar.Manifest

class CadastraContatoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastra_contato)

        /** flBtnAdd.setOnLongClickListener {
        getPermissionImagemGaleria()
        }


        }

        private fun getPermissionImagemGaleria(): Boolean {

        //verifica se a versãp é maior ou igual a API M, esse código funciona a partir dessa versão

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        if(checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)==PackageManager.PERMISSION_DENIED){
        //permissão negada
        val permissiona:Array<String> = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE)
        requestPermissions(android.Manifest.permission, REQUEST_IMAGE_GALLERY)
        }

        }else {
        Toast.makeText("não suportado para a versão do seu S.O", Toast.LENGTH_LONG).show()
        }
        }
         */


    }
}
