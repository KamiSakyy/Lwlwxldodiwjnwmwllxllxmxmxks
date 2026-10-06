package com.github.rudroid.settings.applock.settings;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.w0;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import v71.b0;
import v71.q1;
import w61.a0;
import y71.i1;
import y71.n1;
import y71.y1;
import yf.c;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o extends k1 {
    public final com.github.rudroid.settings.applock.usecases.a s;
    public final com.github.rudroid.settings.applock.usecases.d t;
    public final com.github.rudroid.settings.applock.usecases.j u;
    public final i v;
    public final y1 w;
    public final i1 x;
    public final q1 y;

    public o(com.github.rudroid.settings.applock.usecases.a aVar, com.github.rudroid.settings.applock.usecases.d dVar, com.github.rudroid.settings.applock.usecases.j jVar, i iVar) {
        k71.k.g(aVar, "observeAppLockPreferencesUseCase");
        k71.k.g(dVar, "setAppLockEnabledUseCase");
        k71.k.g(jVar, "setAutomaticLockDurationUseCase");
        this.s = aVar;
        this.t = dVar;
        this.u = jVar;
        this.v = iVar;
        y1 c = n1.c(new yf.b(false, 0, false, null));
        this.w = c;
        final int i = 1;
        this.x = w0.f(c, d1.k(this), new j71.c() { // from class: com.github.rudroid.settings.applock.settings.d
            public final Object k(Object obj) {
                Object obj2;
                switch (i) {
                    case 0:
                        AppLockSettingsActivity appLockSettingsActivity = (AppLockSettingsActivity) this;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q1 q1Var = appLockSettingsActivity.w0;
                        if (q1Var != null) {
                            q1Var.m((CancellationException) null);
                        }
                        com.github.rudroid.settings.applock.v vVar = appLockSettingsActivity.t0;
                        if (vVar == null) {
                            k71.k.m("appLockStore");
                            throw null;
                        }
                        appLockSettingsActivity.w0 = w0.a(com.github.rudroid.settings.applock.v.d(vVar, appLockSettingsActivity), appLockSettingsActivity, androidx.lifecycle.w.u, new e(booleanValue, appLockSettingsActivity, null));
                        return a0.a;
                    default:
                        o oVar = (o) this;
                        yf.b bVar = (yf.b) obj;
                        k71.k.g(bVar, "it");
                        oVar.v.getClass();
                        boolean z = bVar.a;
                        c.a aVar2 = yf.c.Companion;
                        int i2 = bVar.b;
                        aVar2.getClass();
                        Iterator it = yf.c.u.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (((yf.c) obj2).r == i2) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        yf.c cVar = (yf.c) obj2;
                        if (cVar == null) {
                            cVar = yf.c.s;
                        }
                        return new zf.a(z, cVar);
                }
            }
        });
        q1 q1Var = this.y;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.y = b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new l(this, null), 3);
    }
}
