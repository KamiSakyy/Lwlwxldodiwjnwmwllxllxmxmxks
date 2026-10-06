package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u9 implements aaShadow.a {
    public static final u9 a = new u9();
    public static final List b = sy.d0Shadow.o("id", "repositories", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.ne neVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                neVar = (jo.ne) aa.c.c(t9.a, false).a(eVar, wVar);
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
        if (neVar == null) {
            k41.b.B(eVar, "repositories");
            throw null;
        }
        if (str2 != null) {
            return new jo.oe(str, neVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.oe oeVar = (jo.oe) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oeVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oeVar.a);
        fVar.z0("repositories");
        aa.c.c(t9.a, false).b(fVar, wVar, oeVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, oeVar.c);
    }
}
