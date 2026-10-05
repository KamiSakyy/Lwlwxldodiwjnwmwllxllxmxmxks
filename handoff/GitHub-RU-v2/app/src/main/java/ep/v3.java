package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v3 implements aa.a {
    public static final v3 a = new v3();
    public static final List b = sy.d0.o("repository", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.b6 b6Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                b6Var = (jo.b6) aa.c.b(aa.c.c(x3.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jo.z5(b6Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.z5 z5Var = (jo.z5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z5Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(x3.a, false)).b(fVar, wVar, z5Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z5Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z5Var.c);
    }
}
