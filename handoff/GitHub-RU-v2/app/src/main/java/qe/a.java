package qe;

import android.os.Bundle;
import com.github.rudroid.common.i;
import com.github.service.models.ApiFailure;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.k1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Map;
import k41.g;
import k71.k;
import v41.n;
import v41.p;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements com.github.rudroid.common.e {
    public static final C0087a Companion = new C0087a();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f31048a;

    /* renamed from: qe.a$a, reason: collision with other inner class name */
    public static final class C0087a {
    }

    public a(p61.a aVar) {
        k.g(aVar, "userManager");
        this.f31048a = new ArrayList();
    }

    @Override // com.github.rudroid.common.e
    public final void c(Throwable th, Map map, boolean z10) {
        k.g(th, "error");
        k.g(map, "parameters");
        ArrayList arrayList = this.f31048a;
        if (z10) {
            this.f31048a = new ArrayList();
        }
        th.getMessage();
        if (th instanceof ApiFailure) {
        }
        r41.c a10 = r41.c.a();
        p pVar = a10.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            pVar.p.a.a(new n(pVar, System.currentTimeMillis() - pVar.d, str, 0));
        }
        for (Map.Entry entry : map.entrySet()) {
            pVar.p.a.a(new androidx.fragment.app.e(pVar, (String) entry.getKey(), (String) entry.getValue(), 4));
        }
        a10.b(th);
    }

    public final void d() {
        this.f31048a = new ArrayList();
    }

    public final void e(String str, String str2) {
        if (l41.a.a == null) {
            synchronized (l41.a.b) {
                if (l41.a.a == null) {
                    g c10 = g.c();
                    c10.a();
                    l41.a.a = FirebaseAnalytics.getInstance(c10.a);
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = l41.a.a;
        k.d(firebaseAnalytics);
        Bundle bundle = new Bundle();
        bundle.putString("screen_class", str);
        if (str2 != null) {
            bundle.putString("screen_name", str2);
        }
        k1 k1Var = firebaseAnalytics.a;
        k1Var.getClass();
        k1Var.a(new e1(k1Var, (String) null, "screen_view", bundle, false));
    }

    public final void f(i iVar) {
        k.g(iVar, "message");
        this.f31048a.add(iVar.a());
    }
}
