package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c4 implements aaShadow.a {
    public static final c4 a = new c4();
    public static final List b = sy.d0Shadow.o("node", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.p6 p6Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                p6Var = (jo.p6) aa.c.b(aa.c.c(h4.a, true)).a(eVar, wVar);
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
            return new jo.k6(p6Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.k6 k6Var = (jo.k6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k6Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(h4.a, true)).b(fVar, wVar, k6Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k6Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k6Var.c);
    }
}
