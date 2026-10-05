package di;

import a5.c1;
import a5.t0;
import a71.h;
import android.os.Build;
import android.view.View;
import androidx.compose.foundation.lazy.layout.q1;
import androidx.lifecycle.d1;
import com.github.rudroid.activities.m0;
import com.github.rudroid.activities.p2;
import java.util.WeakHashMap;
import k.i;
import k71.k;
import v71.a0;
import v71.b0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static void a(View view) {
        q1 q1Var = new q1(6, (Object) null, view);
        WeakHashMap weakHashMap = c1.a;
        t0.m(view, q1Var);
    }

    public static final void b(p2 p2Var, int i, int i2) {
        k.g(p2Var, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            p2Var.overrideActivityTransition(1, i, i2);
        } else {
            p2Var.overridePendingTransition(i, i2);
        }
    }

    public static final void c(m0 m0Var, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 34) {
            m0Var.overrideActivityTransition(0, i, i2);
        } else {
            m0Var.overridePendingTransition(i, i2);
        }
    }

    public static void d(i iVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = iVar.getWindow().getDecorView().getId();
        }
        int i3 = (i2 & 2) != 0 ? 2131099701 : 2131099700;
        int i4 = (i2 & 4) != 0 ? 2131099701 : 2131099700;
        int i5 = (i2 & 8) != 0 ? 2131099701 : 2131099700;
        View findViewById = iVar.findViewById(i);
        if (findViewById != null) {
            q1 q1Var = new q1(6, Integer.valueOf(i3), findViewById);
            WeakHashMap weakHashMap = c1.a;
            t0.m(findViewById, q1Var);
        }
        b0.z(d1.i(iVar), (h) null, (a0) null, new b(i4, i5, null, iVar), 3);
    }
}
