package w80;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 implements aa.a {
    public static final d0 a = new d0();
    public static final List b = sy.d0.o("__typename", "id", "author");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        x xVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                xVar = (x) aa.c.b(aa.c.c(b0.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        g70.a c = g70.b.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new z(str, str2, xVar, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z zVar = (z) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, zVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, zVar.b);
        fVar.z0("author");
        aa.c.b(aa.c.c(b0.a, true)).b(fVar, wVar, zVar.c);
        List list = g70.b.a;
        g70.b.d(fVar, wVar, zVar.d);
    }
}
