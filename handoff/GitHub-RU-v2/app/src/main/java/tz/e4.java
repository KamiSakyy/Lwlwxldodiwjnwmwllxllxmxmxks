package tz;

import java.util.List;
import m10.n40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e4 implements aa.a {
    public static final e4 a = new e4();
    public static final List b = sy.d0Shadow.o("__typename", "id", "name", "owner", "viewerPermission");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        t1 t1Var = null;
        n40 n40Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                t1Var = (t1) aa.c.c(b4.a, true).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                n40Var = (n40) aa.c.b(n10.b.A).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (t1Var != null) {
            return new v1(str, str2, str3, t1Var, n40Var);
        }
        k41.b.B(eVar, "owner");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v1 v1Var = (v1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, v1Var.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, v1Var.c);
        fVar.z0("owner");
        aa.c.c(b4.a, true).b(fVar, wVar, v1Var.d);
        fVar.z0("viewerPermission");
        aa.c.b(n10.b.A).b(fVar, wVar, v1Var.e);
    }
}
