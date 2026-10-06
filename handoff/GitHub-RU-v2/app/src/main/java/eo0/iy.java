package eo0;

import java.util.Iterator;
import java.util.List;
import jn0.kd0;
import jn0.ld0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iy implements aaShadow.a {
    public static final iy a = new iy();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "subjectType", "pullRequest", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        pz0.cu cuVar = null;
        kd0 kd0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                pz0.cu.Companion.getClass();
                Iterator it = pz0.cu.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((pz0.cu) obj).r.equals(u)) {
                        break;
                    }
                }
                pz0.cu cuVar2 = (pz0.cu) obj;
                cuVar = cuVar2 == null ? pz0.cu.v : cuVar2;
            } else if (r0 == 2) {
                kd0Var = (kd0) aa.c.c(hy.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        xt0.k7 c = xt0.o7.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (cuVar == null) {
            k41.b.B(eVar, "subjectType");
            throw null;
        }
        if (kd0Var == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new ld0(str, cuVar, kd0Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ld0 ld0Var = (ld0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ld0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ld0Var.a);
        fVar.z0("subjectType");
        fVar.I(ld0Var.b.r);
        fVar.z0("pullRequest");
        aa.c.c(hy.a, false).b(fVar, wVar, ld0Var.c);
        fVar.z0("id");
        bVar.b(fVar, wVar, ld0Var.d);
        List list = xt0.o7.a;
        xt0.o7.d(fVar, wVar, ld0Var.e);
    }
}
