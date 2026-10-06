package b41;

import a81.t;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final t a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d;
    public b9.d e;

    public c(Context context) {
        t tVar = new t("AppUpdateListenerRegistry", 3);
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.d = new HashSet();
        this.e = null;
        this.a = tVar;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        b9.d dVar;
        HashSet hashSet = this.d;
        boolean isEmpty = hashSet.isEmpty();
        Context context = this.c;
        if (!isEmpty && this.e == null) {
            b9.d dVar2 = new b9.d(1, this);
            this.e = dVar2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.b;
            if (i >= 33) {
                context.registerReceiver(dVar2, intentFilter, 2);
            } else {
                context.registerReceiver(dVar2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (dVar = this.e) == null) {
            return;
        }
        context.unregisterReceiver(dVar);
        this.e = null;
    }
}
