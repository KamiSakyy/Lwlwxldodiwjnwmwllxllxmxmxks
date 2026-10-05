package w50;

import hc0.jc;
import hc0.lc;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "state", "stateReason", "viewerCanReopen", "__typename"});

    public static i0 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        jc jcVar = null;
        lc lcVar = null;
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
            } else if (r0 == 2) {
                bool = bool2;
                lcVar = (lc) aa.c.b(ic0.a.t).a(eVar, wVar);
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
        if (jcVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "viewerCanReopen");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str2 != null) {
            return new i0(str, jcVar, lcVar, booleanValue, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, i0 i0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i0Var.a);
        fVar.z0("state");
        fVar.I(i0Var.b.r);
        fVar.z0("stateReason");
        aa.c.b(ic0.a.t).b(fVar, wVar, i0Var.c);
        fVar.z0("viewerCanReopen");
        f4.C(i0Var.d, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, i0Var.e);
    }
}
