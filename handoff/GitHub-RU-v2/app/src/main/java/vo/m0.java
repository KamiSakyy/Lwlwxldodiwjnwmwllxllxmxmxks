package vo;

import java.util.List;
import m10.n40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 implements aa.a {
    public static final m0 a = new m0();
    public static final List b = sy.d0Shadow.o("id", "name", "owner", "viewerPermission", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        n nVar = null;
        n40 n40Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                nVar = (n) aa.c.c(i0.a, true).a(eVar, wVar);
            } else if (r0 == 3) {
                n40Var = (n40) aa.c.b(n10.b.A).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (nVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new r(str, str2, nVar, n40Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r rVar = (r) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, rVar.b);
        fVar.z0("owner");
        aa.c.c(i0.a, true).b(fVar, wVar, rVar.c);
        fVar.z0("viewerPermission");
        aa.c.b(n10.b.A).b(fVar, wVar, rVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, rVar.e);
    }
    public static Object h(Object p1, Object p2, Object p3) { return null; }
    public static Object n(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
