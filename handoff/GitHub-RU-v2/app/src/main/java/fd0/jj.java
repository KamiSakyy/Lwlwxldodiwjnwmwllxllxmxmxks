package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jj implements aaShadow.a {
    public static final jj a = new jj();
    public static final List b = sy.d0Shadow.n("reopenIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.hs hsVar = null;
        while (eVar.r0(b) == 0) {
            hsVar = (kc0.hs) aa.c.b(aa.c.c(lj.a, false)).a(eVar, wVar);
        }
        return new kc0.fs(hsVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.fs fsVar = (kc0.fs) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fsVar, "value");
        fVar.z0("reopenIssue");
        aa.c.b(aa.c.c(lj.a, false)).b(fVar, wVar, fsVar.a);
    }
}
