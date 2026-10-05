package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l3 implements aa.a {
    public static final l3 a = new l3();
    public static final List b = sy.d0.o("__typename", "duplicateOf", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.i5 i5Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                i5Var = (jo.i5) aa.c.b(aa.c.c(k3.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        ct.w0 c = ct.z0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jo.j5(str, i5Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.j5 j5Var = (jo.j5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j5Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j5Var.a);
        fVar.z0("duplicateOf");
        aa.c.b(aa.c.c(k3.a, true)).b(fVar, wVar, j5Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, j5Var.c);
        List list = ct.z0.a;
        ct.z0.d(fVar, wVar, j5Var.d);
    }
}
