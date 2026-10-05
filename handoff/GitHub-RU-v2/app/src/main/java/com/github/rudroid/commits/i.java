package com.github.rudroid.commits;

import com.github.rudroid.commits.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import yz0.j4;

/* loaded from: /home/user/work/p/classes.dex */
final class i implements j71.c {
    public final Object k(Object obj) {
        List list = (List) obj;
        k71.k.g(list, "it");
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new l0.a((j4) it.next()));
        }
        return arrayList;
    }
}
