package com.github.rudroid.searchandfilter.complexfilter.repository;

import com.github.service.models.response.SimpleRepository;
import java.util.ArrayList;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public g(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        f fVar;
        int i;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i2 = fVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = fVar.u;
                b71.a aVar = b71.a.r;
                i = fVar.v;
                if (i != 0) {
                    y.j(obj2);
                    w61.k kVar = (w61.k) obj;
                    Iterable<p01.n> iterable = (Iterable) kVar.r;
                    ArrayList arrayList = new ArrayList(x61.n.F(iterable, 10));
                    for (p01.n nVar : iterable) {
                        k71.k.g(nVar, "<this>");
                        String str = nVar.u;
                        String str2 = nVar.r;
                        com.github.service.models.response.a aVar2 = nVar.s;
                        arrayList.add(new SimpleRepository(aVar2.y, str, str2, aVar2.x, nVar.C));
                    }
                    w61.k kVar2 = new w61.k(arrayList, kVar.s);
                    fVar.v = 1;
                    if (this.r.c(kVar2, fVar) == aVar) {
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
        fVar = new f(this, cVar);
        Object obj22 = fVar.u;
        b71.a aVar3 = b71.a.r;
        i = fVar.v;
        if (i != 0) {
        }
        return a0.a;
    }
}
