package com.github.rudroid.searchandfilter.complexfilter;

import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class l implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ k s;

    public /* synthetic */ l(k kVar, int i) {
        this.r = i;
        this.s = kVar;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.r) {
            case 0:
                k kVar = this.s;
                y1 y1Var = kVar.x;
                fl.e eVar = fl.f.Companion;
                List R = kVar.R();
                eVar.getClass();
                fl.f a = fl.e.a(bVar, R);
                y1Var.getClass();
                y1Var.k((Object) null, a);
                break;
            default:
                k kVar2 = this.s;
                y1 y1Var2 = kVar2.x;
                fl.e eVar2 = fl.f.Companion;
                List R2 = kVar2.R();
                eVar2.getClass();
                fl.f a2 = fl.e.a(bVar, R2);
                y1Var2.getClass();
                y1Var2.k((Object) null, a2);
                break;
        }
        return w61.a0.a;
    }
}
