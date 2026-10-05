package xt0;

import java.util.Iterator;
import java.util.List;
import pz0.jc;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j1 implements aa.a {
    public static final j1 a = new j1();
    public static final List b = sy.d0.o(new String[]{"viewerViewedState", "path"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jc jcVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                jc.Companion.getClass();
                Iterator it = jc.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((jc) obj).r.equals(u)) {
                        break;
                    }
                }
                jc jcVar2 = (jc) obj;
                jcVar = jcVar2 == null ? jc.v : jcVar2;
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (jcVar == null) {
            k41.b.B(eVar, "viewerViewedState");
            throw null;
        }
        if (str != null) {
            return new o0(jcVar, str);
        }
        k41.b.B(eVar, "path");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o0 o0Var = (o0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o0Var, "value");
        fVar.z0("viewerViewedState");
        fVar.I(o0Var.a.r);
        fVar.z0("path");
        aa.c.a.b(fVar, wVar, o0Var.b);
    }
}
