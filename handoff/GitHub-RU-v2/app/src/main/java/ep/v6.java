package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v6 implements aa.a {
    public static final v6 a = new v6();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        gv.l8 c = gv.p8.c(eVar, wVar);
        eVar.s0();
        gv.j0 j0Var = gv.j0.a;
        gv.f0 c2 = gv.j0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jo.ja(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ja jaVar = (jo.ja) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jaVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jaVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, jaVar.b);
        List list = gv.p8.a;
        gv.p8.d(fVar, wVar, jaVar.c);
        gv.j0 j0Var = gv.j0.a;
        gv.j0.d(fVar, wVar, jaVar.d);
    }
}
