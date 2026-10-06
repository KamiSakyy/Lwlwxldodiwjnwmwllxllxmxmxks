package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r4 implements aaShadow.a {
    public static final r4 a = new r4();
    public static final List b = sy.d0Shadow.n("createRef");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.d7 d7Var = null;
        while (eVar.r0(b) == 0) {
            d7Var = (kc0.d7) aa.c.b(aa.c.c(q4.a, false)).a(eVar, wVar);
        }
        return new kc0.e7(d7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.e7 e7Var = (kc0.e7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e7Var, "value");
        fVar.z0("createRef");
        aa.c.b(aa.c.c(q4.a, false)).b(fVar, wVar, e7Var.a);
    }
}
