package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b8 implements aa.a {
    public static final b8 a = new b8();
    public static final List b = sy.d0.n("enablePullRequestAutoMerge");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.dc dcVar = null;
        while (eVar.r0(b) == 0) {
            dcVar = (kc0.dc) aa.c.b(aa.c.c(c8.a, false)).a(eVar, wVar);
        }
        return new kc0.cc(dcVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.cc ccVar = (kc0.cc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ccVar, "value");
        fVar.z0("enablePullRequestAutoMerge");
        aa.c.b(aa.c.c(c8.a, false)).b(fVar, wVar, ccVar.a);
    }
}
