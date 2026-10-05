package f00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v implements aa.a {
    public static final v a = new v();
    public static final List b = sy.d0.o("__typename", "name", "owner", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        o oVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                oVar = (o) aa.c.c(t.a, true).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        vx.a c = vx.b.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (oVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new p(str, str2, oVar, str3, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p pVar = (p) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, pVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, pVar.b);
        fVar.z0("owner");
        aa.c.c(t.a, true).b(fVar, wVar, pVar.c);
        fVar.z0("id");
        bVar.b(fVar, wVar, pVar.d);
        List list = vx.b.a;
        vx.b.d(fVar, wVar, pVar.e);
    }
}
