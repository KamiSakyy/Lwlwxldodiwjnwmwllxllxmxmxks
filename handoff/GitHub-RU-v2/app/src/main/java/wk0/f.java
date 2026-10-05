package wk0;

import gn0.e10;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = sy.d0.o(new String[]{"identifier", "hidden"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e10 e10Var = null;
        Boolean bool = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                e10.Companion.getClass();
                Iterator it = e10.C.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((e10) obj).r.equals(u)) {
                        break;
                    }
                }
                e10 e10Var2 = (e10) obj;
                e10Var = e10Var2 == null ? e10.A : e10Var2;
            } else {
                if (r0 != 1) {
                    break;
                }
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (e10Var == null) {
            k41.b.B(eVar, "identifier");
            throw null;
        }
        if (bool != null) {
            return new b(e10Var, bool.booleanValue());
        }
        k41.b.B(eVar, "hidden");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b bVar = (b) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bVar, "value");
        fVar.z0("identifier");
        fVar.I(bVar.a.r);
        fVar.z0("hidden");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(bVar.b));
    }
}
