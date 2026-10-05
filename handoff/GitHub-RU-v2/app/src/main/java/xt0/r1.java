package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r1 implements aa.a {
    public static final r1 a = new r1();
    public static final List b = sy.d0.n("gitUrl");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new w0(str);
        }
        k41.b.B(eVar, "gitUrl");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w0 w0Var = (w0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w0Var, "value");
        fVar.z0("gitUrl");
        aa.c.a.b(fVar, wVar, w0Var.a);
    }
}
