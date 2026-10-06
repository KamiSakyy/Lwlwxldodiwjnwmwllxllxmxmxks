package gv;

import java.util.Iterator;
import java.util.List;
import m10.da0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e7 implements aa.a {
    public static final e7 a = new e7();
    public static final List b = sy.d0Shadow.o("id", "context", "state", "description", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        da0 da0Var = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
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
            } else if (r0 == 3) {
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str4 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "context");
            throw null;
        }
        if (da0Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str4 != null) {
            return new r5(str, str2, da0Var, str3, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r5 r5Var = (r5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r5Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r5Var.a);
        fVar.z0("context");
        bVar.b(fVar, wVar, r5Var.b);
        fVar.z0("state");
        fVar.I(r5Var.c.r);
        fVar.z0("description");
        aa.c.i.b(fVar, wVar, r5Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, r5Var.e);
    }
}
