package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m6 implements aaShadow.a {
    public static final m6 a = new m6();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new jo.s9(str);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.s9 s9Var = (jo.s9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s9Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, s9Var.a);
    }
}
