package fd0;

import java.util.Iterator;
import java.util.List;
import kc0.k90;
import kc0.l90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jv implements aaShadow.a {
    public static final jv a = new jv();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "subjectType", "pullRequest", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        gn0.dn dnVar = null;
        k90 k90Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                gn0.dn.Companion.getClass();
                Iterator it = gn0.dn.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((gn0.dn) obj).r.equals(u)) {
                        break;
                    }
                }
                gn0.dn dnVar2 = (gn0.dn) obj;
                dnVar = dnVar2 == null ? gn0.dn.v : dnVar2;
            } else if (r0 == 2) {
                k90Var = (k90) aa.c.c(iv.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        ri0.s7 c = ri0.w7.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (dnVar == null) {
            k41.b.B(eVar, "subjectType");
            throw null;
        }
        if (k90Var == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new l90(str, dnVar, k90Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l90 l90Var = (l90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l90Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l90Var.a);
        fVar.z0("subjectType");
        fVar.I(l90Var.b.r);
        fVar.z0("pullRequest");
        aa.c.c(iv.a, false).b(fVar, wVar, l90Var.c);
        fVar.z0("id");
        bVar.b(fVar, wVar, l90Var.d);
        List list = ri0.w7.a;
        ri0.w7.d(fVar, wVar, l90Var.e);
    }
}
