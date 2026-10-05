package px0;

import fw0.j2;
import fw0.k2;
import fw0.l2;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 implements aa.a {
    public static final o0 a = new o0();
    public static final List b = sy.d0.o(new String[]{"__typename", "notificationThreads", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ox0.g gVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                gVar = (ox0.g) aa.c.c(f.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        j2 c = l2.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (gVar == null) {
            k41.b.B(eVar, "notificationThreads");
            throw null;
        }
        if (str2 != null) {
            return new ox0.p0(str, gVar, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ox0.p0 p0Var = (ox0.p0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p0Var.a);
        fVar.z0("notificationThreads");
        aa.c.c(f.a, false).b(fVar, wVar, p0Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, p0Var.c);
        List list = l2.a;
        j2 j2Var = p0Var.d;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j2Var, "value");
        fVar.z0("notificationSettings");
        aa.c.b(aa.c.c(k2.a, false)).b(fVar, wVar, j2Var.a);
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, j2Var.b);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, j2Var.c);
    }
}
