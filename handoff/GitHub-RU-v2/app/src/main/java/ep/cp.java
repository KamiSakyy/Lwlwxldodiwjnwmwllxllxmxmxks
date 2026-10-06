package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cp implements aaShadow.a {
    public static final cp a = new cp();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        eq.c c = eq.d.c(eVar, wVar);
        if (str != null) {
            return new jo.b00(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.b00 b00Var = (jo.b00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b00Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, b00Var.a);
        List list = eq.d.a;
        eq.d.d(fVar, wVar, b00Var.b);
    }
}
