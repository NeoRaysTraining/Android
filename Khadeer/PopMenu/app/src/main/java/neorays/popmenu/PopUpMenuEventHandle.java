package neorays.popmenu;

import android.content.Context;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.Toast;

/**
 * Created by khussain on 4/15/2016.
 */
public class PopUpMenuEventHandle implements PopupMenu.OnMenuItemClickListener {
    Context context;
    public  PopUpMenuEventHandle(Context context)
    {
        this.context=context;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        if(item.getItemId()==R.id.id_admin) {
            Toast.makeText(context, "Login As Admin", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId()==R.id.id_user) {
            Toast.makeText(context, "Login As User", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
        }
    }

