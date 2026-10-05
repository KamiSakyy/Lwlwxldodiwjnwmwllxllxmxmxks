package d;

import a5.q2;
import a5.r2;
import a5.t2;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes.dex */
public class n {
    public void a(Window window) {
    }

    public void b(a0 a0Var, a0 a0Var2, Window window, View view, boolean z10, boolean z11) {
        k71.k.g(a0Var, "statusBarStyle");
        k71.k.g(a0Var2, "navigationBarStyle");
        k71.k.g(window, "window");
        k71.k.g(view, "view");
        b4.g0(window, false);
        window.setStatusBarColor(z10 ? a0Var.f20881b : a0Var.f20880a);
        window.setNavigationBarColor(z11 ? a0Var2.f20881b : a0Var2.f20880a);
        y51.c cVar = new y51.c(view);
        int i = Build.VERSION.SDK_INT;
        d5 t2Var = i >= 35 ? new t2(window, cVar) : i >= 30 ? new r2(window, cVar) : new q2(window, cVar);
        t2Var.W(!z10);
        t2Var.V(!z11);
    }
}
