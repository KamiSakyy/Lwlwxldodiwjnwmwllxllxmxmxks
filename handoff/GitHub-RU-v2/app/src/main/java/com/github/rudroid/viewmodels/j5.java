package com.github.rudroid.viewmodels;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
final class j5<T> implements y71.j {
    public final /* synthetic */ r5 r;

    public j5(r5 r5Var) {
        this.r = r5Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        yz0.m3 m3Var = (yz0.m3) obj;
        ArrayList arrayList = m3Var.b;
        x01.i iVar = m3Var.c;
        r5 r5Var = this.r;
        r5Var.z = iVar;
        androidx.lifecycle.p0 p0Var = r5Var.y;
        fl.e eVar = fl.f.Companion;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            yz0.j3 j3Var = (yz0.j3) obj2;
            arrayList2.add(oe.d.b(j3Var, he.r.a(j3Var.v), 1));
        }
        eVar.getClass();
        p0Var.k(fl.e.c(arrayList2));
        return w61.a0.a;
    }
}
