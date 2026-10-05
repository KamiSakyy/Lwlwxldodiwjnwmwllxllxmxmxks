package com.github.rudroid.widget;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import com.github.rudroid.auth.SimplifiedLoginActivity;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public static final void a(m6.e eVar, s sVar, int i) {
        s sVar2;
        k71.k.g(eVar, "textStyle");
        sVar.e0(-1940568715);
        int i2 = (sVar.f(eVar) ? 4 : 2) | i;
        if (sVar.S(i2 & 1, (i2 & 3) != 2)) {
            Intent intent = new Intent((Context) sVar.j(z5.g.b), (Class<?>) SimplifiedLoginActivity.class);
            intent.setAction("android.intent.action.VIEW");
            sVar2 = sVar;
            b31.b.a(b31.b.L(j.a(sVar), c6.f.a(intent)), i6.c.e, r1.i.d(1152448855, new m(eVar), sVar), sVar2, 384, 0);
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new m(eVar, i);
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
