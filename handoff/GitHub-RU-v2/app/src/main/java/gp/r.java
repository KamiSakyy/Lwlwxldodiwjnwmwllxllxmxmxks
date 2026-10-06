package gp;

import fp.q0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = sy.d0Shadow.o("__typename", "taskId");

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
        hp.o c = hp.p.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new q0(str, str2, c);
        }
        k41.b.B(eVar, "taskId");
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
        fVar.z0("taskId");
        bVar.b(fVar, wVar, q0Var.b);
        List list = hp.p.a;
        hp.p.d(fVar, wVar, q0Var.c);
    }
}
