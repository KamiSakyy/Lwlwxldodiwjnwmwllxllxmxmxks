package com.github.rudroid.viewmodels.notifications;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class c0 implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ s s;
    public final /* synthetic */ j71.c t;
    public final /* synthetic */ List u;

    public /* synthetic */ c0(s sVar, j71.c cVar, List list, int i) {
        this.r = i;
        this.s = sVar;
        this.t = cVar;
        this.u = list;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.r) {
            case 0:
                com.github.rudroid.utilities.w0.r(this.s.X, new com.github.rudroid.searchandfilter.filterbar.j(2, this.u));
                this.t.k(bVar);
                break;
            case 1:
                com.github.rudroid.utilities.w0.r(this.s.X, new com.github.rudroid.searchandfilter.filterbar.j(4, this.u));
                this.t.k(bVar);
                break;
            case 2:
                com.github.rudroid.utilities.w0.r(this.s.X, new com.github.rudroid.searchandfilter.filterbar.j(6, this.u));
                this.t.k(bVar);
                break;
            default:
                com.github.rudroid.utilities.w0.r(this.s.X, new com.github.rudroid.searchandfilter.filterbar.j(8, this.u));
                this.t.k(bVar);
                break;
        }
        return w61.a0.a;
    }
}
