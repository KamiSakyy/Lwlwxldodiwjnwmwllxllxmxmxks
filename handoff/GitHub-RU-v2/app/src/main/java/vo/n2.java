package vo;

import java.util.List;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n2 implements aa.a {
    public static final n2 a = new n2();
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
        z2 c = j3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new k2(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k2 k2Var = (k2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, k2Var.b);
        List list = j3.a;
        z2 z2Var = k2Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z2Var, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, z2Var.a);
        fVar.z0("title");
        aa.c.i.b(fVar, wVar, z2Var.b);
        fVar.z0("runNumber");
        fVar.z(z2Var.c);
        fVar.z0("eventType");
        fVar.I(z2Var.d.r);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, z2Var.e);
        fVar.z0("workflow");
        aa.c.c(i3.a, false).b(fVar, wVar, z2Var.f);
        fVar.z0("checkSuite");
        aa.c.c(b3.a, false).b(fVar, wVar, z2Var.g);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, z2Var.h);
    }
}
