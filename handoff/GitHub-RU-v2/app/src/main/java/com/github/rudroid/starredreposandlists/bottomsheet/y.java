package com.github.rudroid.starredreposandlists.bottomsheet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import yz0.e8;

/* loaded from: /home/user/work/p/classes3.dex */
final class y<T> implements y71.j {
    public final /* synthetic */ w r;

    public y(w wVar) {
        this.r = wVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        zm.a aVar = (zm.a) obj;
        w wVar = this.r;
        if (wVar.x == null) {
            List list = aVar.a;
            ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((e8) it.next()).r);
            }
            wVar.x = arrayList;
        }
        wVar.A = aVar.b;
        wVar.P();
        return w61.a0.a;
    }
}
