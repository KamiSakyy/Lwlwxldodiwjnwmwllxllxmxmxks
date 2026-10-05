package com.github.rudroid.widget.contribution;

import java.util.List;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class i implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ Object v;

    public /* synthetic */ i(Object obj, float f, float f2, boolean z, int i, int i2) {
        this.r = i2;
        this.v = obj;
        this.s = f;
        this.t = f2;
        this.u = z;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Integer) obj2).getClass();
                int L = androidx.compose.runtime.t.L(1);
                k.c((List) this.v, this.s, this.t, this.u, (androidx.compose.runtime.s) obj, L);
                break;
            default:
                ((Integer) obj2).getClass();
                int L2 = androidx.compose.runtime.t.L(1);
                k.a((n6.a) this.v, this.s, this.t, this.u, (androidx.compose.runtime.s) obj, L2);
                break;
        }
        return a0.a;
    }
}
