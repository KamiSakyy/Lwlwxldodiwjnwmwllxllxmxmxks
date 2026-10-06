package ep;

import java.util.Iterator;
import java.util.List;
import m10.gb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j9 implements aaShadow.a {
    public static final j9 a = new j9();
    public static final List b = sy.d0.o("link", "linkType");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        gb0 gb0Var = null;
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
                gb0.Companion.getClass();
                Iterator it = gb0.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((gb0) obj).r.equals(u)) {
                        break;
                    }
                }
                gb0 gb0Var2 = (gb0) obj;
                gb0Var = gb0Var2 == null ? gb0.u : gb0Var2;
            }
        }
        if (str == null) {
            k41.b.B(eVar, "link");
            throw null;
        }
        if (gb0Var != null) {
            return new jo.zd(str, gb0Var);
        }
        k41.b.B(eVar, "linkType");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.zd zdVar = (jo.zd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zdVar, "value");
        fVar.z0("link");
        aa.c.a.b(fVar, wVar, zdVar.a);
        fVar.z0("linkType");
        fVar.I(zdVar.b.r);
    }
}
