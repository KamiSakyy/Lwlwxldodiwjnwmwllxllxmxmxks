package ro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m10.da0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 implements aa.a {
    public static final i1 a = new i1();
    public static final List b = sy.d0Shadow.o("state", "contexts", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        da0 da0Var = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                da0.Companion.getClass();
                Iterator it = da0.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((da0) obj).r.equals(u)) {
                        break;
                    }
                }
                da0 da0Var2 = (da0) obj;
                da0Var = da0Var2 == null ? da0.t : da0Var2;
            } else if (r0 == 1) {
                arrayList = aa.c.a(aa.c.c(e1.a, true)).c(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (da0Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (arrayList == null) {
            k41.b.B(eVar, "contexts");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new qo.z1(da0Var, arrayList, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qo.z1 z1Var = (qo.z1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z1Var, "value");
        fVar.z0("state");
        fVar.I(z1Var.a.r);
        fVar.z0("contexts");
        aa.c.a(aa.c.c(e1.a, true)).e(fVar, wVar, z1Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z1Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z1Var.d);
    }
}
