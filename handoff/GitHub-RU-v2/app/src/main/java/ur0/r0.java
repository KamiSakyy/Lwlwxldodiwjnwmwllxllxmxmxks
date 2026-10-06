package ur0;

import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import pz0.bf;
import pz0.df;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "state", "stateReason", "viewerCanReopen", "parent", "__typename"});

    public static p0 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        bf bfVar = null;
        df dfVar = null;
        o0 o0Var = null;
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
                bf.Companion.getClass();
                Iterator it = bf.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((bf) obj).r.equals(u)) {
                        break;
                    }
                }
                bf bfVar2 = (bf) obj;
                bfVar = bfVar2 == null ? bf.v : bfVar2;
            } else if (r0 == 2) {
                bool = bool2;
                dfVar = (df) aa.c.b(qz0.a.x).a(eVar, wVar);
            } else if (r0 == 3) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 4) {
                bool = bool2;
                o0Var = (o0) aa.c.b(aa.c.c(q0.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 5) {
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
        if (bfVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "viewerCanReopen");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str2 != null) {
            return new p0(str, bfVar, dfVar, booleanValue, o0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, p0 p0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p0Var.a);
        fVar.z0("state");
        fVar.I(p0Var.b.r);
        fVar.z0("stateReason");
        aa.c.b(qz0.a.x).b(fVar, wVar, p0Var.c);
        fVar.z0("viewerCanReopen");
        f4.C(p0Var.d, aa.c.f, fVar, wVar, "parent");
        aa.c.b(aa.c.c(q0.a, true)).b(fVar, wVar, p0Var.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p0Var.f);
    }
}
