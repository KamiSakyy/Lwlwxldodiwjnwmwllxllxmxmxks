package com.github.rudroid.uitoolkit.menu;

import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import f1.ua;
import f1.va;
import w1.r;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class f implements j71.e {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ r t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ int v;
    public final /* synthetic */ Object w;

    public /* synthetic */ f(r rVar, String str, boolean z, boolean z2, int i) {
        this.t = rVar;
        this.w = str;
        this.s = z;
        this.u = z2;
        this.v = i;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Integer) obj2).getClass();
                h.b(this.t, (String) this.w, this.s, this.u, (s) obj, t.L(this.v | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                va.a(this.s, this.t, this.u, (ua) this.w, (s) obj, t.L(this.v | 1));
                break;
        }
        return a0.a;
    }

    public /* synthetic */ f(boolean z, r rVar, boolean z2, ua uaVar, int i) {
        this.s = z;
        this.t = rVar;
        this.u = z2;
        this.w = uaVar;
        this.v = i;
    }
}
