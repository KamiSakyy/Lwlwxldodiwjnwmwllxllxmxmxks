package com.github.rudroid.viewmodels;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
final class n1<T> implements y71.j {
    public final /* synthetic */ v1 r;

    public n1(v1 v1Var) {
        this.r = v1Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        yz0.e4 e4Var = (yz0.e4) obj;
        x01.i iVar = e4Var.c;
        v1 v1Var = this.r;
        v1Var.z = iVar;
        androidx.lifecycle.p0 p0Var = v1Var.y;
        fl.e eVar = fl.f.Companion;
        ArrayList arrayList = e4Var.b.b;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(oe.b.a((yz0.y1) obj2, (String) null));
        }
        eVar.getClass();
        p0Var.j(fl.e.c(arrayList2));
        return w61.a0.a;
    }
}
