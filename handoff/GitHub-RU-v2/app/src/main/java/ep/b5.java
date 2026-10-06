package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b5 implements aaShadow.a {
    public static final b5 a = new b5();
    public static final List b = sy.d0Shadow.n("createDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.q7 q7Var = null;
        while (eVar.r0(b) == 0) {
            q7Var = (jo.q7) aa.c.b(aa.c.c(a5.a, false)).a(eVar, wVar);
        }
        return new jo.r7(q7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.r7 r7Var = (jo.r7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r7Var, "value");
        fVar.z0("createDiscussion");
        aa.c.b(aa.c.c(a5.a, false)).b(fVar, wVar, r7Var.a);
    }
}
