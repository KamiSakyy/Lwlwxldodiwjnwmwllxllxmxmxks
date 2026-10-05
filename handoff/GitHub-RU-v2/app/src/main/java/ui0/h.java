package ui0;

import aa.w;
import gn0.yv;
import java.util.Iterator;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0.o(new String[]{"__typename", "state", "id"});

    public final Object a(ea.e eVar, w wVar) {
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        yv yvVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k.d(u);
                yv.Companion.getClass();
                Iterator it = yv.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((yv) obj).r.equals(u)) {
                        break;
                    }
                }
                yv yvVar2 = (yv) obj;
                yvVar = yvVar2 == null ? yv.t : yvVar2;
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (yvVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str2 != null) {
            return new c(yvVar, str, str2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        c cVar = (c) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("state");
        fVar.I(cVar.b.r);
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.c);
    }
}
