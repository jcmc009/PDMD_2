package dam.pmdm.tarea2_manjoncarrascojosecarlos

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class SettingsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Avisamos que este fragmento quiere modificar el menú
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    // --- PARTE VISUAL: AL ENTRAR ---
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val activity = requireActivity() as AppCompatActivity

        //  Cambiar título
        activity.supportActionBar?.title = getString(R.string.ajustes_title)

        // ACTIVAR LA FLECHA DE RETROCESO
        activity.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        activity.supportActionBar?.setDisplayShowHomeEnabled(true)
    }

    // Borra los iconos de la Activity (Settings, About) para que no salgan aquí
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {

        menu.clear()
        super.onCreateOptionsMenu(menu, inflater)
    }

    //  PARTE VISUAL AL SALIR (Volver a Main)
    override fun onDestroyView() {
        super.onDestroyView()

        val activity = requireActivity() as AppCompatActivity

        //Restaurar título original
        activity.supportActionBar?.title = getString(R.string.app_name)

        // OCULTAR LA FLECHA (para que no salga en la pantalla principal)
        activity.supportActionBar?.setDisplayHomeAsUpEnabled(false)
        activity.supportActionBar?.setDisplayShowHomeEnabled(false)
    }
}