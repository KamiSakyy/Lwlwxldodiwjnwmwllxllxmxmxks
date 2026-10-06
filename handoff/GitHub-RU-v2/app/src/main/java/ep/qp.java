package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qp implements aaShadow.a {
    public static final qp a = new qp();
    public static final List b = sy.d0Shadow.o("id", "diff", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.x00 x00Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                x00Var = (jo.x00) aa.c.b(aa.c.c(tp.a, false)).a(eVar, wVar);
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
            return new jo.u00(str, x00Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.u00 u00Var = (jo.u00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u00Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u00Var.a);
        fVar.z0("diff");
        aa.c.b(aa.c.c(tp.a, false)).b(fVar, wVar, u00Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, u00Var.c);
    }
}
