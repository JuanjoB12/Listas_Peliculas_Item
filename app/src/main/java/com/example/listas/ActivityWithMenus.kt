package com.example.listas

import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class ActivityWithMenus: AppCompatActivity() {
    companion object {
        var acitividadActual = 0;
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_principal, menu)
        if (menu != null) {
            for (i in 0 until menu.size()) {
                if (i == acitividadActual) menu.getItem(i).isEnabled = false
                else menu.getItem(i).isEnabled = true


            }

        }
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.ItemPeliculas -> {
                val intent = Intent(this,MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                acitividadActual=0;
                startActivity(intent)
                true

            }
            R.id.ItemApp -> {
                val intent = Intent(this,MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                acitividadActual=1;
                startActivity(intent)
                true

            }
            R.id.ItemAñadirPelicula -> {
                val intent = Intent(this,MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                acitividadActual=2;
                startActivity(intent)
                true

            }
            R.id.ItemSalir -> {
                val intent = Intent(this,MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                acitividadActual=3;
                val miDialogo = MiDialogFragment()
                miDialogo.showsDialog

                startActivity(intent)
                true

            }

            else -> super.onOptionsItemSelected(item)
        }
    }

}