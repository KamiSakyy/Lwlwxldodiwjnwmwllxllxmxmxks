package com.github.rudroid.viewmodels.notifications;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import y71.y1;
import yz0.b3;
import yz0.z2;

/* loaded from: /home/user/work/p/classes3.dex */
final class z<T> implements y71.j {
    public final /* synthetic */ s r;

    public z(s sVar) {
        this.r = sVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        w61.k kVar = (w61.k) obj;
        b3 b3Var = (b3) kVar.r;
        x01.i iVar = (x01.i) kVar.s;
        s sVar = this.r;
        sVar.l0 = iVar;
        int i = 0;
        sVar.g0 = (b3Var.b() || b3Var.a()) ? false : true;
        y1 y1Var = sVar.X;
        x61.r rVar = (List) ((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData();
        if (rVar == null) {
            rVar = x61.r.r;
        }
        ArrayList a = j1.a(b3Var.c());
        ArrayList arrayList = new ArrayList((Collection) rVar);
        HashSet hashSet = new HashSet();
        Iterator<T> it = rVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((le.s) it.next()).q);
        }
        int size = a.size();
        while (i < size) {
            Object obj2 = a.get(i);
            i++;
            z2 z2Var = (z2) obj2;
            k71.k.g(z2Var, "notification");
            if (hashSet.add(z2Var.getId())) {
                arrayList.add(new le.s(z2Var, new le.a0(z2Var.e(), z2Var.j(), z2Var.l()), sVar.i0));
            }
        }
        com.github.rudroid.utilities.w0.p(y1Var, arrayList);
        return w61.a0.a;
    }
}
