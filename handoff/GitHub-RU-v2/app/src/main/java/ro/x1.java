package ro;

import java.util.Iterator;
import java.util.List;
import jo.f4;
import m10.ih0;
import qo.y2;
import qo.z2;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class x1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "name", "url", "state", "hasWorkflowDispatchTriggerForBranch", "runs"});

    public static y2 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ih0 ih0Var = null;
        z2 z2Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                String u = eVar.u();
                k71.k.d(u);
                ih0.Companion.getClass();
                Iterator it = ih0.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ih0) obj).r.equals(u)) {
                        break;
                    }
                }
                ih0 ih0Var2 = (ih0) obj;
                ih0Var = ih0Var2 == null ? ih0.t : ih0Var2;
            } else if (r0 == 4) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                z2Var = (z2) aa.c.c(y1.a, true).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (ih0Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "hasWorkflowDispatchTriggerForBranch");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (z2Var != null) {
            return new y2(str, str2, str3, ih0Var, booleanValue, z2Var);
        }
        k41.b.B(eVar, "runs");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, y2 y2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y2Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y2Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, y2Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, y2Var.c);
        fVar.z0("state");
        fVar.I(y2Var.d.r);
        fVar.z0("hasWorkflowDispatchTriggerForBranch");
        f4.C(y2Var.e, aa.c.f, fVar, wVar, "runs");
        aa.c.c(y1.a, true).b(fVar, wVar, y2Var.f);
    }
}
