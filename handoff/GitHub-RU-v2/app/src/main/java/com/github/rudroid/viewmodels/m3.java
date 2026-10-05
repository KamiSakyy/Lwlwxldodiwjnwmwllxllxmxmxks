package com.github.rudroid.viewmodels;

import com.github.service.models.response.organizations.Organization;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
final class m3<T> implements y71.j {
    public final /* synthetic */ k3 r;

    public m3(k3 k3Var) {
        this.r = k3Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        w61.k kVar = (w61.k) obj;
        List list = (List) kVar.r;
        x01.i iVar = (x01.i) kVar.s;
        k71.k.g(iVar, "<set-?>");
        k3 k3Var = this.r;
        k3Var.x = iVar;
        androidx.lifecycle.p0 p0Var = k3Var.w;
        fl.e eVar = fl.f.Companion;
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.github.rudroid.organizations.z((Organization) it.next()));
        }
        eVar.getClass();
        p0Var.j(fl.e.c(arrayList));
        return w61.a0.a;
    }
}
