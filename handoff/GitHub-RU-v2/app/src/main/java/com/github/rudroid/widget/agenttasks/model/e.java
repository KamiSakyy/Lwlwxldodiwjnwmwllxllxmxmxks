package com.github.rudroid.widget.agenttasks.model;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import java.util.ArrayList;
import sy.y;
import w61.a0;
import yz0.d3;
import yz0.j3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e<T> implements y71.j {
    public final /* synthetic */ y71.j r;
    public final /* synthetic */ oa.j s;

    public e(y71.j jVar, oa.j jVar2) {
        this.r = jVar;
        this.s = jVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        d dVar;
        int i;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i2 = dVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.u;
                b71.a aVar = b71.a.r;
                i = dVar.v;
                if (i != 0) {
                    y.j(obj2);
                    java.lang.Object r1 = (java.lang.Object) (((xz0.g) obj).a);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : r1) {
                        if (obj3 instanceof j3) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj4 = arrayList.get(i3);
                        i3++;
                        j3 j3Var = (j3) obj4;
                        k71.k.g(j3Var, "item");
                        String str = j3Var.b;
                        String str2 = j3Var.a;
                        String rawValue = j3Var.q.getRawValue();
                        boolean z = j3Var.p;
                        boolean z2 = j3Var.t;
                        String str3 = j3Var.k;
                        d3 d3Var = j3Var.f;
                        ArrayList arrayList3 = arrayList;
                        arrayList2.add(new a(j3Var.l, str, str2, str, rawValue, str3, d3Var.a, d3Var.b, z, z2));
                        arrayList = arrayList3;
                    }
                    g1.a aVar2 = g1.Companion;
                    b bVar = new b(arrayList2, this.s);
                    aVar2.getClass();
                    t1 t1Var = new t1(bVar);
                    dVar.v = 1;
                    if (this.r.c(t1Var, dVar) == aVar) {
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
        dVar = new d(this, cVar);
        Object obj22 = dVar.u;
        b71.a aVar3 = b71.a.r;
        i = dVar.v;
        if (i != 0) {
        }
        return a0.a;
    }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
