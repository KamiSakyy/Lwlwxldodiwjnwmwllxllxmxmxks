package jv;

import aa.w;
import java.util.Iterator;
import java.util.List;
import k71.k;
import m10.da0;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0.o("__typename", "state", "id");

    public final Object a(ea.e eVar, w wVar) {
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        da0 da0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k.d(u);
                da0.Companion.getClass();
                Iterator it = da0.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((da0) obj).r.equals(u)) {
                        break;
                    }
                }
                da0 da0Var2 = (da0) obj;
                da0Var = da0Var2 == null ? da0.t : da0Var2;
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
        if (da0Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str2 != null) {
            return new c(str, str2, da0Var);
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
