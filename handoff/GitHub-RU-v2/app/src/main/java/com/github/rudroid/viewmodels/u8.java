package com.github.rudroid.viewmodels;

import com.github.service.models.response.LegacyProjectWithNumber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
final class u8<T> implements y71.j {
    public final /* synthetic */ m8 r;

    public u8(m8 m8Var) {
        this.r = m8Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        w61.k kVar = (w61.k) obj;
        List list = (List) kVar.r;
        x01.i iVar = (x01.i) kVar.s;
        m8 m8Var = this.r;
        m8Var.T(iVar);
        if (m8Var.I.length() > 0) {
            LinkedHashSet linkedHashSet = m8Var.H;
            ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((LegacyProjectWithNumber) it.next()).r);
            }
            linkedHashSet.addAll(arrayList);
        } else {
            LinkedHashSet linkedHashSet2 = m8Var.G;
            ArrayList arrayList2 = new ArrayList(x61.n.F(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((LegacyProjectWithNumber) it2.next()).r);
            }
            linkedHashSet2.addAll(arrayList2);
        }
        androidx.lifecycle.p0 p0Var = m8Var.z;
        fl.e eVar = fl.f.Companion;
        ArrayList Q = m8Var.Q(false);
        eVar.getClass();
        p0Var.j(fl.e.c(Q));
        return w61.a0.a;
    }
}
