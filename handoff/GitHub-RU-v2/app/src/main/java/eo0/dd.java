package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dd implements aa.a {
    public static final dd a = new dd();
    public static final List b = sy.d0.o(new String[]{"clientMutationId", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.jj jjVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jn0.hj(str, jjVar);
                }
                jjVar = (jn0.jj) aa.c.b(aa.c.c(fd.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.hj hjVar = (jn0.hj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hjVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, hjVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(fd.a, false)).b(fVar, wVar, hjVar.b);
    }
}
