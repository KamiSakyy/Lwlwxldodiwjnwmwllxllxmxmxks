package com.github.rudroid.viewmodels;

import com.github.service.models.response.LegacyProjectWithNumber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
final class p8<T> implements y71.j {
    public final /* synthetic */ m8 r;

    public p8(m8 m8Var) {
        this.r = m8Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        w61.k kVar = (w61.k) obj;
        List list = (List) kVar.r;
        x01.i iVar = (x01.i) kVar.s;
        m8 m8Var = this.r;
        m8Var.T(iVar);
        LinkedHashSet linkedHashSet = m8Var.F;
        LinkedHashSet linkedHashSet2 = m8Var.H;
        if (m8Var.I.length() > 0) {
            linkedHashSet2.clear();
            ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((LegacyProjectWithNumber) it.next()).r);
            }
            linkedHashSet2.addAll(arrayList);
        } else if (linkedHashSet.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(x61.n.F(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((LegacyProjectWithNumber) it2.next()).r);
            }
            linkedHashSet.addAll(arrayList2);
        }
        androidx.lifecycle.p0 p0Var = m8Var.z;
        fl.e eVar = fl.f.Companion;
        ArrayList Q = m8Var.Q(false);
        eVar.getClass();
        p0Var.j(fl.e.c(Q));
        return w61.a0.a;
    }
}
