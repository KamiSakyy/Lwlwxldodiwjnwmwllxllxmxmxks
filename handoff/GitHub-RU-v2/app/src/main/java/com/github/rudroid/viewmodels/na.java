package com.github.rudroid.viewmodels;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class na implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ sa s;

    public /* synthetic */ na(sa saVar, int i) {
        this.r = i;
        this.s = saVar;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.r) {
            case 0:
                androidx.lifecycle.p0 p0Var = this.s.w;
                fl.e eVar = fl.f.Companion;
                fl.f fVar = (fl.f) p0Var.d();
                List list = fVar != null ? (List) fVar.b : null;
                eVar.getClass();
                p0Var.j(fl.e.a(bVar, list));
                break;
            default:
                androidx.lifecycle.p0 p0Var2 = this.s.w;
                fl.e eVar2 = fl.f.Companion;
                fl.f fVar2 = (fl.f) p0Var2.d();
                List list2 = fVar2 != null ? (List) fVar2.b : null;
                eVar2.getClass();
                p0Var2.j(fl.e.a(bVar, list2));
                break;
        }
        return w61.a0.a;
    }
}
