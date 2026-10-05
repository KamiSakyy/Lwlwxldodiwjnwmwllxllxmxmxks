package com.github.rudroid.viewmodels.notifications;

import java.util.ArrayList;
import y71.y1;
import yz0.b3;
import yz0.z2;

/* loaded from: /home/user/work/p/classes3.dex */
final class x<T> implements y71.j {
    public final /* synthetic */ s r;
    public final /* synthetic */ boolean s;

    public x(s sVar, boolean z) {
        this.r = sVar;
        this.s = z;
    }

    public final Object c(Object obj, a71.c cVar) {
        w61.k kVar = (w61.k) obj;
        b3 b3Var = (b3) kVar.r;
        x01.i iVar = (x01.i) kVar.s;
        b3Var.c().size();
        s sVar = this.r;
        sVar.l0 = iVar;
        int i = 0;
        sVar.g0 = (b3Var.b() || b3Var.a()) ? false : true;
        ArrayList a = j1.a(b3Var.c());
        ArrayList arrayList = new ArrayList(x61.n.F(a, 10));
        int size = a.size();
        while (i < size) {
            Object obj2 = a.get(i);
            i++;
            z2 z2Var = (z2) obj2;
            arrayList.add(new le.s(z2Var, new le.a0(z2Var.e(), z2Var.j(), z2Var.l()), sVar.i0));
        }
        com.github.rudroid.utilities.w0.p(sVar.X, arrayList);
        if (this.s) {
            y1 y1Var = sVar.d0;
            Boolean bool = Boolean.TRUE;
            y1Var.getClass();
            y1Var.k((Object) null, bool);
        }
        return w61.a0.a;
    }
}
