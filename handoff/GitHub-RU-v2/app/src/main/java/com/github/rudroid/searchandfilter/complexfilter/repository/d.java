package com.github.rudroid.searchandfilter.complexfilter.repository;

import com.github.service.models.response.SimpleRepository;
import java.util.ArrayList;
import sy.y;
import w61.a0;
import yz0.t7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public d(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        c cVar2;
        int i;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i2 = cVar2.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.v = i2 - Integer.MIN_VALUE;
                Object obj2 = cVar2.u;
                b71.a aVar = b71.a.r;
                i = cVar2.v;
                if (i != 0) {
                    y.j(obj2);
                    u01.b bVar = (u01.b) obj;
                    ArrayList arrayList = bVar.a;
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        t7 t7Var = (t7) obj3;
                        k71.k.g(t7Var, "<this>");
                        arrayList2.add(new SimpleRepository(t7Var.u, t7Var.r, t7Var.s, t7Var.t, t7Var.w));
                    }
                    w61.k kVar = new w61.k(arrayList2, bVar.b);
                    cVar2.v = 1;
                    if (this.r.c(kVar, cVar2) == aVar) {
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
        cVar2 = new c(this, cVar);
        Object obj22 = cVar2.u;
        b71.a aVar2 = b71.a.r;
        i = cVar2.v;
        if (i != 0) {
        }
        return a0.a;
    }

}
