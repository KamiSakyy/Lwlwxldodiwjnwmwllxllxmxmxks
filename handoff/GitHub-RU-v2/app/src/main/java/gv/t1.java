package gv;

import java.util.Iterator;
import java.util.List;
import m10.qf;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t1 implements aa.a {
    public static final t1 a = new t1();
    public static final List b = sy.d0.o("viewerViewedState", "path");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        qf qfVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                qf.Companion.getClass();
                Iterator it = qf.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((qf) obj).r.equals(u)) {
                        break;
                    }
                }
                qf qfVar2 = (qf) obj;
                qfVar = qfVar2 == null ? qf.v : qfVar2;
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (qfVar == null) {
            k41.b.B(eVar, "viewerViewedState");
            throw null;
        }
        if (str != null) {
            return new y0(qfVar, str);
        }
        k41.b.B(eVar, "path");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y0 y0Var = (y0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y0Var, "value");
        fVar.z0("viewerViewedState");
        fVar.I(y0Var.a.r);
        fVar.z0("path");
        aa.c.a.b(fVar, wVar, y0Var.b);
    }
}
