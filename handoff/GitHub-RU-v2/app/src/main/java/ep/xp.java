package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xp implements aaShadow.a {
    public static final xp a = new xp();
    public static final List b = sy.d0Shadow.o("id", "comparison", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.v00 v00Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                v00Var = (jo.v00) aa.c.b(aa.c.c(rp.a, false)).a(eVar, wVar);
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
            return new jo.b10(str, v00Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.b10 b10Var = (jo.b10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b10Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b10Var.a);
        fVar.z0("comparison");
        aa.c.b(aa.c.c(rp.a, false)).b(fVar, wVar, b10Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, b10Var.c);
    }
}
