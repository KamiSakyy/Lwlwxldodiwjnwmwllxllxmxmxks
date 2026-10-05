package rc;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: /home/user/work/p/classes.dex */
public final class e {
    public static final void a(View view) {
        k71.k.g(view, "<this>");
        Context context = view.getContext();
        if (context != null) {
            Object systemService = context.getSystemService("input_method");
            k71.k.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static final void b(EditText editText) {
        k71.k.g(editText, "<this>");
        editText.requestFocus();
        Context context = editText.getContext();
        if (context != null) {
            Object systemService = context.getSystemService("input_method");
            k71.k.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(editText, 1);
        }
    }
}
