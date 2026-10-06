package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v5 implements aa.a {
    public static final v5 a = new v5();
    public static final List b = sy.d0Shadow.o("id", "refUpdateRule", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        b5 b5Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                b5Var = (b5) aa.c.b(aa.c.c(o6.a, false)).a(eVar, wVar);
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
            return new i4(str, b5Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i4 i4Var = (i4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i4Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i4Var.a);
        fVar.z0("refUpdateRule");
        aa.c.b(aa.c.c(o6.a, false)).b(fVar, wVar, i4Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, i4Var.c);
    }
}
