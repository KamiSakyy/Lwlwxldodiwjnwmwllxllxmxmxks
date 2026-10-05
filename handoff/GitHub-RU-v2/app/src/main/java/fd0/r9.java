package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r9 implements aa.a {
    public static final r9 a = new r9();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.qe qeVar = null;
        while (eVar.r0(b) == 0) {
            qeVar = (kc0.qe) aa.c.b(aa.c.c(v9.a, false)).a(eVar, wVar);
        }
        return new kc0.me(qeVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.me meVar = (kc0.me) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(meVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(v9.a, false)).b(fVar, wVar, meVar.a);
    }
}
