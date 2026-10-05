package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n4 implements aa.a {
    public static final n4 a = new n4();
    public static final List b = sy.d0.o("id", "diff", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.a7 a7Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                a7Var = (jo.a7) aa.c.b(aa.c.c(q4.a, false)).a(eVar, wVar);
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
            return new jo.x6(str, a7Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.x6 x6Var = (jo.x6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x6Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x6Var.a);
        fVar.z0("diff");
        aa.c.b(aa.c.c(q4.a, false)).b(fVar, wVar, x6Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, x6Var.c);
    }
}
