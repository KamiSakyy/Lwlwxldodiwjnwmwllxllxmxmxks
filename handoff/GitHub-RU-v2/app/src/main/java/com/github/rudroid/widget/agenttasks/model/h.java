package com.github.rudroid.widget.agenttasks.model;

import java.util.ArrayList;
import java.util.List;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public h(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        g gVar;
        int i;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i2 = gVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = gVar.u;
                b71.a aVar = b71.a.r;
                i = gVar.v;
                if (i != 0) {
                    y.j(obj2);
                    List<sj.b> list = (List) obj;
                    ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                    for (sj.b bVar : list) {
                        k71.k.g(bVar, "item");
                        String str = bVar.b;
                        String str2 = bVar.a;
                        String str3 = bVar.c;
                        boolean z = bVar.d;
                        boolean z2 = bVar.e;
                        arrayList.add(new a(bVar.i, str, str2, str, str3, bVar.f, bVar.g, bVar.h, z, z2));
                    }
                    gVar.v = 1;
                    if (this.r.c(arrayList, gVar) == aVar) {
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
        gVar = new g(this, cVar);
        Object obj22 = gVar.u;
        b71.a aVar2 = b71.a.r;
        i = gVar.v;
        if (i != 0) {
        }
        return a0.a;
    }
}
