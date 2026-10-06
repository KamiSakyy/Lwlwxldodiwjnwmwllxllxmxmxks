package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j3 implements aaShadow.a {
    public static final j3 a = new j3();
    public static final List b = sy.d0.n("closeIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.f5 f5Var = null;
        while (eVar.r0(b) == 0) {
            f5Var = (jo.f5) aa.c.b(aa.c.c(i3.a, false)).a(eVar, wVar);
        }
        return new jo.h5(f5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.h5 h5Var = (jo.h5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h5Var, "value");
        fVar.z0("closeIssue");
        aa.c.b(aa.c.c(i3.a, false)).b(fVar, wVar, h5Var.a);
    }
}
