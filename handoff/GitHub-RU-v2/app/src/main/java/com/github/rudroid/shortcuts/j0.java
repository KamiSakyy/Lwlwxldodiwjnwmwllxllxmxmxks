package com.github.rudroid.shortcuts;

import com.github.rudroid.shortcuts.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
final class j0<T> implements y71.j {
    public final /* synthetic */ List r;
    public final /* synthetic */ List s;
    public final /* synthetic */ n0 t;

    public j0(List list, List list2, n0 n0Var) {
        this.r = list;
        this.s = list2;
        this.t = n0Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        List<wm.b> list = (List) obj;
        ArrayList l0 = x61.m.l0(this.r, this.s);
        k71.k.g(list, "shortcuts");
        ArrayList arrayList = new ArrayList();
        int size = l0.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = l0.get(i2);
            i2++;
            wm.b bVar = (wm.b) obj2;
            if (!list.isEmpty()) {
                for (wm.b bVar2 : list) {
                    if (bVar.K() != bVar2.K() || !k71.k.b(bVar.i(), bVar2.i()) || !com.google.common.util.concurrent.a.p(bVar2.g(), bVar.g())) {
                    }
                }
            }
            arrayList.add(obj2);
        }
        n0 n0Var = this.t;
        y1 y1Var = n0Var.A;
        fl.e eVar = fl.f.Companion;
        n0Var.t.getClass();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new q.d(2131954629));
        ArrayList arrayList3 = new ArrayList(x61.n.F(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(new q.e((wm.b) it.next()));
        }
        arrayList2.addAll(arrayList3);
        if (arrayList3.isEmpty()) {
            arrayList2.add(q.c.t);
        }
        arrayList2.add(q.b.t);
        if (!arrayList.isEmpty()) {
            arrayList2.add(new q.d(2131954630));
            ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList, 10));
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj3 = arrayList.get(i);
                i++;
                arrayList4.add(new q.f((wm.b) obj3));
            }
            arrayList2.addAll(arrayList4);
        }
        List F0 = x61.m.F0(arrayList2);
        eVar.getClass();
        fl.f c = fl.e.c(F0);
        y1Var.getClass();
        y1Var.k((Object) null, c);
        return w61.a0.a;
    }
}
