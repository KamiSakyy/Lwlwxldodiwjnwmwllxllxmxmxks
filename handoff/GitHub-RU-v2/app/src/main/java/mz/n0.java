package mz;

import java.util.List;
import qx.l2;
import qx.m2;
import qx.n2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 implements aa.a {
    public static final n0 a = new n0();
    public static final List b = sy.d0.o("__typename", "notificationThreads", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        lz.f fVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                fVar = (lz.f) aa.c.c(e.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        l2 c = n2.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (fVar == null) {
            k41.b.B(eVar, "notificationThreads");
            throw null;
        }
        if (str2 != null) {
            return new lz.o0(str, fVar, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        lz.o0 o0Var = (lz.o0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, o0Var.a);
        fVar.z0("notificationThreads");
        aa.c.c(e.a, false).b(fVar, wVar, o0Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, o0Var.c);
        List list = n2.a;
        l2 l2Var = o0Var.d;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l2Var, "value");
        fVar.z0("notificationSettings");
        aa.c.b(aa.c.c(m2.a, false)).b(fVar, wVar, l2Var.a);
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, l2Var.b);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, l2Var.c);
    }
}
