package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m1 implements aa.a {
    public static final m1 a = new m1();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b1 b1Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"ImageFileType"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            b1Var = w1.c(eVar, wVar);
        }
        return new s0(str, b1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s0 s0Var = (s0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, s0Var.a);
        b1 b1Var = s0Var.b;
        if (b1Var != null) {
            List list = w1.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, b1Var.a);
        }
    }
}
