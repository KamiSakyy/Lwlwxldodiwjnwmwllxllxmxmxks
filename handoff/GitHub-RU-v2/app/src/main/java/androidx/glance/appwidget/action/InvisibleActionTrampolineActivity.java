package androidx.glance.appwidget.action;

import android.app.Activity;
import android.os.Bundle;
import c6.f;

/* loaded from: /home/user/work/p/classes.dex */
public class InvisibleActionTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f.g(this, getIntent());
    }
}
