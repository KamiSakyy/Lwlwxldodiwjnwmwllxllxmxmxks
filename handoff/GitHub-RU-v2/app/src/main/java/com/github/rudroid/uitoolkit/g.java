package com.github.rudroid.uitoolkit;

import ch.a;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class g implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ CharSequence s;
    public final /* synthetic */ Serializable t;
    public final /* synthetic */ w1.r u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ long w;
    public final /* synthetic */ int x;
    public final /* synthetic */ g3.q0 y;

    public /* synthetic */ g(String str, String str2, w1.r rVar, com.github.rudroid.uitoolkit.text.l lVar, long j, int i, g3.q0 q0Var, int i2) {
        this.r = i2;
        this.s = str;
        this.t = str2;
        this.u = rVar;
        this.v = lVar;
        this.w = j;
        this.x = i;
        this.y = q0Var;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                String str = (String) this.s;
                String str2 = (String) this.t;
                com.github.rudroid.uitoolkit.text.l lVar = (com.github.rudroid.uitoolkit.text.l) this.v;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    com.github.rudroid.uitoolkit.text.k.c(this.u, lVar, androidx.compose.foundation.layout.b.f(ih.a.k, 0.0f, 0.0f, 0.0f, 14), new d2.t(this.w), null, androidx.compose.foundation.layout.l.e, str2, str == null ? str2 : str, 0L, this.x, 2, this.y, false, sVar, 196992, 6, 12560);
                } else {
                    sVar.V();
                }
                break;
            case 1:
                String str3 = (String) this.s;
                String str4 = (String) this.t;
                com.github.rudroid.uitoolkit.text.l lVar2 = (com.github.rudroid.uitoolkit.text.l) this.v;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    com.github.rudroid.uitoolkit.text.k.c(this.u, lVar2, androidx.compose.foundation.layout.b.f(ih.a.k, 0.0f, 0.0f, 0.0f, 14), new d2.t(this.w), null, androidx.compose.foundation.layout.l.e, str4, str3 == null ? str4 : str3, 0L, this.x, 2, this.y, false, sVar2, 196992, 6, 12560);
                } else {
                    sVar2.V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                com.github.rudroid.uitoolkit.markdown.components.a0.c(this.u, this.s, this.y, (ArrayList) this.t, this.w, (a.b) this.v, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.x | 1));
                break;
        }
        return w61.a0.a;
    }

    public /* synthetic */ g(w1.r rVar, g3.g gVar, g3.q0 q0Var, ArrayList arrayList, long j, a.b bVar, int i) {
        this.r = 2;
        this.u = rVar;
        this.s = gVar;
        this.y = q0Var;
        this.t = arrayList;
        this.w = j;
        this.v = bVar;
        this.x = i;
    }
}
