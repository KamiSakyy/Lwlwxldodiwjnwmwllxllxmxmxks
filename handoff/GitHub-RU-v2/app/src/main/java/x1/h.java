package x1;

import android.view.View;
import android.view.autofill.AutofillManager;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class h {
    public static void a(View view, AutofillManager autofillManager, int i, boolean z10) {
        autofillManager.notifyViewVisibilityChanged(view, i, z10);
    }
}
