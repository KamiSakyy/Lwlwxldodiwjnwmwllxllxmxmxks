package com.github.rudroid.searchandfilter.filterbar;

import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class b implements j71.e {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ j71.a t;
    public final /* synthetic */ int u;

    public /* synthetic */ b(j71.a aVar, boolean z, int i, int i2) {
        this.t = aVar;
        this.s = z;
        this.u = i;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        s sVar = (s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c.a(this.u, t.L(1), sVar, this.t, this.s);
                break;
            case 1:
                h1.j.a(this.s, this.t, sVar, t.L(this.u | 1));
                break;
            default:
                rh.k.a(this.u, t.L(1), sVar, this.t, this.s);
                break;
        }
        return a0.a;
    }

    public /* synthetic */ b(boolean z, int i, j71.a aVar, int i2) {
        this.s = z;
        this.u = i;
        this.t = aVar;
    }

    public /* synthetic */ b(boolean z, j71.a aVar, int i) {
        this.s = z;
        this.t = aVar;
        this.u = i;
    }
}
