package w80;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h1 implements aa.a {
    public static final h1 a = new h1();
    public static final List b = sy.d0Shadow.o("__typename", "id");

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
        g60.a c = g60.b.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new q0(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q0 q0Var = (q0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, q0Var.b);
        List list = g60.b.a;
        g60.a aVar = q0Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("name");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, aVar.a);
        fVar.z0("spdxId");
        aa.c.i.b(fVar, wVar, aVar.b);
        fVar.z0("id");
        bVar2.b(fVar, wVar, aVar.c);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, aVar.d);
    }
    public static final Object i = null;
}
