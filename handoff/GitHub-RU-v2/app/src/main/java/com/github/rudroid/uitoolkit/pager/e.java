package com.github.rudroid.uitoolkit.pager;

import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class e implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ j71.c s;
    public final /* synthetic */ int t;

    public /* synthetic */ e(int i, int i2, j71.c cVar) {
        this.r = i2;
        this.s = cVar;
        this.t = i;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                j71.c cVar = this.s;
                if (cVar != null) {
                    cVar.k(Integer.valueOf(this.t));
                }
                break;
            default:
                this.s.k(Integer.valueOf(this.t));
                break;
        }
        return a0.a;
    }
}
