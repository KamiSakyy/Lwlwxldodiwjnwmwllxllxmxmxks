package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ql implements aaShadow.a {
    public static final ql a = new ql();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ov ovVar = null;
        while (eVar.r0(b) == 0) {
            ovVar = (kc0.ov) aa.c.b(aa.c.c(vl.a, false)).a(eVar, wVar);
        }
        return new kc0.jv(ovVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.jv jvVar = (kc0.jv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jvVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(vl.a, false)).b(fVar, wVar, jvVar.a);
    }
}
