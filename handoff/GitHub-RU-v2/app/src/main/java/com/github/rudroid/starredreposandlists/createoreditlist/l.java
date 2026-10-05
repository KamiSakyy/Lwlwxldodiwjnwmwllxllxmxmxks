package com.github.rudroid.starredreposandlists.createoreditlist;

import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class l implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ l(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object k(Object obj) {
        switch (this.r) {
            case 0:
                r rVar = (r) this.s;
                fl.b bVar = (fl.b) obj;
                rVar.getClass();
                k71.k.g(bVar, "executionError");
                rVar.s.a(bVar);
                v71.b0.z(androidx.lifecycle.d1.k(rVar), (a71.h) null, (v71.a0) null, new m(rVar, null), 3);
                break;
            case 1:
                y1 y1Var = ((r) this.s).y;
                Boolean bool = Boolean.TRUE;
                y1Var.getClass();
                y1Var.k((Object) null, bool);
                break;
            default:
                androidx.compose.runtime.f1 f1Var = (androidx.compose.runtime.f1) this.s;
                String str = (String) obj;
                k71.k.g(str, "it");
                if (str.length() <= 160) {
                    f1Var.setValue(str);
                }
                return w61.a0.a;
        }
        return w61.a0.a;
    }
}
