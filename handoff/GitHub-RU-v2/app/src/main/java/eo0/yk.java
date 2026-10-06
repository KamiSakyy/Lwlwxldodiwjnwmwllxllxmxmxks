package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yk implements aaShadow.a {
    public static final yk a = new yk();
    public static final List b = sy.d0Shadow.o(new String[]{"issue", "subIssue"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.eu euVar = null;
        jn0.iu iuVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                euVar = (jn0.eu) aa.c.b(aa.c.c(vk.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jn0.hu(euVar, iuVar);
                }
                iuVar = (jn0.iu) aa.c.b(aa.c.c(zk.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.hu huVar = (jn0.hu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(huVar, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(vk.a, true)).b(fVar, wVar, huVar.a);
        fVar.z0("subIssue");
        aa.c.b(aa.c.c(zk.a, false)).b(fVar, wVar, huVar.b);
    }
}
