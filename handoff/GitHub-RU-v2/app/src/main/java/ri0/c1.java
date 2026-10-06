package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 implements aa.a {
    public static final c1 a = new c1();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        r0 r0Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"ImageFileType"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            r0Var = m1.c(eVar, wVar);
        }
        return new i0(str, r0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i0 i0Var = (i0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, i0Var.a);
        r0 r0Var = i0Var.b;
        if (r0Var != null) {
            List list = m1.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, r0Var.a);
        }
    }
}
