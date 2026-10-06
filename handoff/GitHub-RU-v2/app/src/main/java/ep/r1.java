package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r1 implements aaShadow.a {
    public static final r1 a = new r1();
    public static final List b = sy.d0.o("viewer", "node", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.l3 l3Var = null;
        jo.c3 c3Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l3Var = (jo.l3) aa.c.c(c2.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                c3Var = (jo.c3) aa.c.b(aa.c.c(t1.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (l3Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jo.a3(l3Var, c3Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.a3 a3Var = (jo.a3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a3Var, "value");
        fVar.z0("viewer");
        aa.c.c(c2.a, true).b(fVar, wVar, a3Var.a);
        fVar.z0("node");
        aa.c.b(aa.c.c(t1.a, true)).b(fVar, wVar, a3Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a3Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, a3Var.d);
    }
}
