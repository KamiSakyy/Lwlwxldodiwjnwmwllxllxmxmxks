package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j1 implements aa.a {
    public static final j1 a = new j1();
    public static final List b = sy.d0Shadow.o("baseCommitOid", "headCommitOid", "patches");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        d1 d1Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                d1Var = (d1) aa.c.c(y1.a, false).a(eVar, wVar);
            }
        }
        if (str2 == null) {
            k41.b.B(eVar, "headCommitOid");
            throw null;
        }
        if (d1Var != null) {
            return new p0(str, str2, d1Var);
        }
        k41.b.B(eVar, "patches");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p0 p0Var = (p0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p0Var, "value");
        fVar.z0("baseCommitOid");
        aa.c.i.b(fVar, wVar, p0Var.a);
        fVar.z0("headCommitOid");
        aa.c.a.b(fVar, wVar, p0Var.b);
        fVar.z0("patches");
        aa.c.c(y1.a, false).b(fVar, wVar, p0Var.c);
    }
}
