package mg0;

import gn0.xc;
import gn0.zc;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "state", "stateReason", "viewerCanReopen", "__typename"});

    public static k0 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        xc xcVar = null;
        zc zcVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                String u = eVar.u();
                k71.k.d(u);
                xc.Companion.getClass();
                Iterator it = xc.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((xc) obj).r.equals(u)) {
                        break;
                    }
                }
                xc xcVar2 = (xc) obj;
                xcVar = xcVar2 == null ? xc.v : xcVar2;
            } else if (r0 == 2) {
                bool = bool2;
                zcVar = (zc) aa.c.b(hn0.a.t).a(eVar, wVar);
            } else if (r0 == 3) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (xcVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "viewerCanReopen");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str2 != null) {
            return new k0(str, xcVar, zcVar, booleanValue, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, k0 k0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k0Var.a);
        fVar.z0("state");
        fVar.I(k0Var.b.r);
        fVar.z0("stateReason");
        aa.c.b(hn0.a.t).b(fVar, wVar, k0Var.c);
        fVar.z0("viewerCanReopen");
        f4.C(k0Var.d, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, k0Var.e);
    }
}
