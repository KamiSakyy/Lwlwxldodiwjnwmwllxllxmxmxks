package fy;

import aa.w;
import ey.s;
import java.util.ArrayList;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p implements aa.a {
    public static final p a = new p();
    public static final List b = d0.n("summary");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        while (eVar.r0(b) == 0) {
            arrayList = aa.c.a(aa.c.c(q.a, false)).c(eVar, wVar);
        }
        if (arrayList != null) {
            return new s(arrayList);
        }
        k41.b.B(eVar, "summary");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        s sVar = (s) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sVar, "value");
        fVar.z0("summary");
        aa.c.a(aa.c.c(q.a, false)).e(fVar, wVar, sVar.a);
    }

}
