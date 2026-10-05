package com.github.rudroid.uitoolkit.avatarslayout;

import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class d implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ w1.r s;
    public final /* synthetic */ float t;
    public final /* synthetic */ r1.d u;
    public final /* synthetic */ int v;

    public /* synthetic */ d(w1.r rVar, float f, r1.d dVar, int i, int i2) {
        this.r = i2;
        this.s = rVar;
        this.t = f;
        this.u = dVar;
        this.v = i;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                g.b(this.s, this.t, this.u, sVar, androidx.compose.runtime.t.L(this.v | 1));
                break;
            default:
                t.b(this.s, this.t, this.u, sVar, androidx.compose.runtime.t.L(this.v | 1));
                break;
        }
        return a0.a;
    }
}
