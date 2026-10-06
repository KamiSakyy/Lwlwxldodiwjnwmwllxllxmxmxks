package com.github.rudroid.searchandfilter.complexfilter.user;

import java.util.ArrayList;
import java.util.List;
import sy.d0Shadow;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r<T> implements y71.j {
    public final /* synthetic */ y71.j r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ oa.j u;

    public r(y71.j jVar, String str, String str2, oa.j jVar2) {
        this.r = jVar;
        this.s = str;
        this.t = str2;
        this.u = jVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        q qVar;
        int i;
        Object l0;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i2 = qVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = qVar.u;
                b71.a aVar = b71.a.r;
                i = qVar.v;
                if (i != 0) {
                    y.j(obj2);
                    yz0.e eVar = (yz0.e) obj;
                    String str = this.s;
                    if ((str == null || t71.p.T(str)) && t71.p.T(this.t)) {
                        oa.j jVar = this.u;
                        List n = d0Shadow.n(new dm.b(jVar.c));
                        List c = eVar.c();
                        ArrayList arrayList = new ArrayList();
                        for (T t : c) {
                            if (!k71.k.b(((yz0.f) t).d(), jVar.c)) {
                                arrayList.add(t);
                            }
                        }
                        l0 = x61.m.l0(n, arrayList);
                    } else {
                        l0 = eVar.c();
                    }
                    w61.k kVar = new w61.k(l0, eVar.b());
                    qVar.v = 1;
                    if (this.r.c(kVar, qVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        qVar = new q(this, cVar);
        Object obj22 = qVar.u;
        b71.a aVar2 = b71.a.r;
        i = qVar.v;
        if (i != 0) {
        }
        return a0.a;
    }
}
