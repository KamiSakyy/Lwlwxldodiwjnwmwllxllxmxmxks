package kk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.k;
import x61.n;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final mj.b a;

    public e(mj.b bVar) {
        k.g(bVar, "commentMapper");
        this.a = bVar;
    }

    public final jk.d a(b01.g gVar) {
        ArrayList arrayList;
        k.g(gVar, "serverDiscussionComment");
        mj.b bVar = this.a;
        lj.b a = bVar.a(gVar);
        Integer num = gVar.d;
        boolean z = gVar.e;
        boolean z2 = gVar.f;
        boolean z3 = gVar.g;
        boolean z4 = gVar.h;
        String str = gVar.i;
        boolean z5 = gVar.j;
        List list = gVar.l;
        if (list != null) {
            arrayList = new ArrayList(n.F(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(bVar.a((b01.g) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new jk.d(a, num, z, z2, z3, z4, str, z5, arrayList, gVar.m);
    }
}
