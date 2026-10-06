package com.github.rudroid.starredreposandlists.bottomsheet;

import androidx.compose.foundation.layout.d2;
import h0.h1Shadow;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class j implements j71.e {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ List s;
    public final /* synthetic */ j71.c t;
    public final /* synthetic */ j71.a u;

    public /* synthetic */ j(List list, j71.a aVar, j71.c cVar) {
        this.s = list;
        this.u = aVar;
        this.t = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (r3 == androidx.compose.runtime.n.a) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj, Object obj2) {
        Object obj3;
        switch (this.r) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    float f = ih.a.l;
                    w1.r B = androidx.compose.foundation.layout.b.B(w1.o.a, 0.0f, f, 0.0f, f, 5);
                    List list = this.s;
                    boolean h = sVar.h(list);
                    j71.a aVar = this.u;
                    boolean f2 = h | sVar.f(aVar);
                    j71.c cVar = this.t;
                    boolean f3 = f2 | sVar.f(cVar);
                    Object N = sVar.N();
                    if (!f3) {
                        obj3 = N;
                        break;
                    }
                    c6.b bVar = new c6.b(list, aVar, cVar, 24);
                    sVar.n0(bVar);
                    obj3 = bVar;
                    com.google.common.util.concurrent.a.b(B, (m0.s) null, (d2) null, (androidx.compose.foundation.layout.k) null, (w1.d) null, (h1Shadow) null, false, (f0.j) null, (j71.c) obj3, sVar, 0, 510);
                } else {
                    sVar.V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                p.b(this.s, this.t, this.u, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                break;
        }
        return w61.a0.a;
    }

    public /* synthetic */ j(List list, j71.c cVar, j71.a aVar, int i) {
        this.s = list;
        this.t = cVar;
        this.u = aVar;
    }
}
