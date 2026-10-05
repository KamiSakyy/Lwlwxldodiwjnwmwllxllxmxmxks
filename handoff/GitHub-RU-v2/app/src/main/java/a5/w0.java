package a5;

import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class w0 {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i) {
        view.setImportantForAutofill(i);
    }
}
