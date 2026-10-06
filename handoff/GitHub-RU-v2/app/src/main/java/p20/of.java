package p20;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class of implements aaShadow.a {
    public static final of a = new of();
    public static final List b = sy.d0Shadow.o("__typename", "url", "state", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        hc0.jl jlVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                hc0.jl.Companion.getClass();
                Iterator it = hc0.jl.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((hc0.jl) obj).r.equals(u)) {
                        break;
                    }
                }
                hc0.jl jlVar2 = (hc0.jl) obj;
                jlVar = jlVar2 == null ? hc0.jl.t : jlVar2;
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        c40.c c = c40.e.c(eVar, wVar);
        eVar.s0();
        i80.e eVar2 = i80.e.a;
        i80.c c2 = i80.e.c(eVar, wVar);
        eVar.s0();
        aa0.c c3 = aa0.d.c(eVar, wVar);
        eVar.s0();
        g70.a c4 = g70.b.c(eVar, wVar);
        eVar.s0();
        y60.c cVar = y60.c.a;
        y60.a c5 = y60.c.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (jlVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str3 != null) {
            return new u10.dn(str, str2, jlVar, str3, c, c2, c3, c4, c5);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.dn dnVar = (u10.dn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dnVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dnVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, dnVar.b);
        fVar.z0("state");
        fVar.I(dnVar.c.r);
        fVar.z0("id");
        bVar.b(fVar, wVar, dnVar.d);
        List list = c40.e.a;
        c40.e.d(fVar, wVar, dnVar.e);
        i80.e eVar = i80.e.a;
        i80.e.d(fVar, wVar, dnVar.f);
        List list2 = aa0.d.a;
        aa0.d.d(fVar, wVar, dnVar.g);
        List list3 = g70.b.a;
        g70.b.d(fVar, wVar, dnVar.h);
        y60.c cVar = y60.c.a;
        y60.c.d(fVar, wVar, dnVar.i);
    }
}
