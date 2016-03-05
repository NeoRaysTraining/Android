import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.itcs.checkbox.R;

/**
 * Created by khussain on 2/26/2016.
 */
public class Second extends Activity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
         textView=(TextView)findViewById(R.id.edit_TextView);
        textView.setText("Welcome");



    }
}
