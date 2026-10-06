package eo0;

import java.util.Iterator;
import java.util.List;
import pz0.l40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t8 implements aaShadow.a {
    public static final t8 a = new t8();
    public static final List b = sy.d0Shadow.o(new String[]{"link", "linkType"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        l40 l40Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                l40.Companion.getClass();
                Iterator it = l40.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((l40) obj).r.equals(u)) {
                        break;
                    }
                }
                l40 l40Var2 = (l40) obj;
                l40Var = l40Var2 == null ? l40.u : l40Var2;
            }
        }
        if (str == null) {
            k41.b.B(eVar, "link");
            throw null;
        }
        if (l40Var != null) {
            return new jn0.cd(str, l40Var);
        }
        k41.b.B(eVar, "linkType");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.cd cdVar = (jn0.cd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cdVar, "value");
        fVar.z0("link");
        aa.c.a.b(fVar, wVar, cdVar.a);
        fVar.z0("linkType");
        fVar.I(cdVar.b.r);
    }
}
