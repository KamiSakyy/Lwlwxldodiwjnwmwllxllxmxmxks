package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bk implements aa.a {
    public static final bk a = new bk();
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
        qx.q0 c = qx.r0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jo.gt(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.gt gtVar = (jo.gt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gtVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gtVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, gtVar.b);
        List list = qx.r0.a;
        qx.q0 q0Var = gtVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q0Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, q0Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, q0Var.b);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, q0Var.c);
        fVar.z0("login");
        bVar2.b(fVar, wVar, q0Var.d);
        List list2 = eq.h.a;
        eq.h.d(fVar, wVar, q0Var.e);
    }
}
