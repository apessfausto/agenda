package br.com.apess.contatos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_contato.*

class ContatoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contato)

        txtTelefone.setOnClickListener {
            makePhoneCall(txtTelefone.text.toString())
        }

        txtTelefone.setOnLongClickListener {
            sendSMS(txtTelefone.text.toString())
        }

        txtEmail.setOnClickListener {
            sendEmail(txtEmail.text.toString())
        }
    }


    //carregar o menu na tela
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_edit_contato, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when (item!!.itemId) {
            R.id.menuEditar -> {
                val intent = Intent(this, R.layout.activity_cadastra_contato::class.java)
                startActivity(intent)
                return true
            }
            R.id.menuExcluirContato -> {
                Toast.makeText(this, "Colocar método excluir", Toast.LENGTH_SHORT).show()
                return true

            }

            R.id.menuFavorito -> {
                Toast.makeText(this, "Colocar método favorito", Toast.LENGTH_SHORT).show()

                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }
}
