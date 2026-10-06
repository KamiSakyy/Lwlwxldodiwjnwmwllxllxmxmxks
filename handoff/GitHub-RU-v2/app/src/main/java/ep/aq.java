package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class aq implements aaShadow.a {
    public static final aq a = new aq();
    public static final List b = sy.d0Shadow.o("id", "compare", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.f10 f10Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                f10Var = (jo.f10) aa.c.b(aa.c.c(zp.a, false)).a(eVar, wVar);
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
            return new jo.g10(str, f10Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.g10 g10Var = (jo.g10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g10Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g10Var.a);
        fVar.z0("compare");
        aa.c.b(aa.c.c(zp.a, false)).b(fVar, wVar, g10Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, g10Var.c);
    }
}
