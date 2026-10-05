package com.github.rudroid.widget.shortcuts;

import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class w implements j71.f {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ w(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.r) {
            case 0:
                com.github.rudroid.widget.shortcuts.model.h hVar = (com.github.rudroid.widget.shortcuts.model.h) this.s;
                ((Integer) obj3).getClass();
                k71.k.g((d6.f) obj, "$this$item");
                a0.a(null, hVar.b, (androidx.compose.runtime.s) obj2, 0);
                break;
            case 1:
                com.github.rudroid.widget.shortcuts.model.h hVar2 = (com.github.rudroid.widget.shortcuts.model.h) this.s;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                k71.k.g((i6.g) obj, "$this$Column");
                a0.b(null, hVar2.b, sVar, 0);
                m7.y.f(k41.b.y(z5.l.a, ih.a.k), sVar, 0);
                boolean h = sVar.h(hVar2);
                Object N = sVar.N();
                if (h || N == androidx.compose.runtime.n.a) {
                    N = new c0(2, hVar2);
                    sVar.n0(N);
                }
                m71.a.a((z5.n) null, (j71.c) N, sVar, 0);
                break;
            default:
                m6.e eVar = (m6.e) this.s;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                k71.k.g((i6.q) obj, "$this$Row");
                m71.a.d(i4.p0(2131954617, sVar2), (z5.n) null, eVar, 1, sVar2, 3072, 2);
                break;
        }
        return w61.a0.a;
    }
}
