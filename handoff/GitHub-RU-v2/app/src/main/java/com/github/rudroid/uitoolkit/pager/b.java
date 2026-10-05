package com.github.rudroid.uitoolkit.pager;

import a71.h;
import d3.c0;
import k71.k;
import o0.x;
import v71.a0;
import v71.b0;
import v71.z;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class b implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    public final Object k(Object obj) {
        switch (this.r) {
            case 0:
                b0.z((z) this.s, (h) null, (a0) null, new f(((Integer) obj).intValue(), null, (x) this.t), 3);
                break;
            default:
                String str = (String) this.s;
                String str2 = (String) this.t;
                c0 c0Var = (c0) obj;
                k.g(c0Var, "$this$semantics");
                d3.z.g(c0Var, str);
                d3.z.n(c0Var, str2);
                break;
        }
        return w61.a0.a;
    }
}
