package mo0;

import aa.w;
import java.util.List;
import lo0.m;
import lo0.n;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = d0Shadow.o(new String[]{"clientMutationId", "draftIssue"});

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        m mVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new n(str, mVar);
                }
                mVar = (m) aa.c.b(aa.c.c(j.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        n nVar = (n) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, nVar.a);
        fVar.z0("draftIssue");
        aa.c.b(aa.c.c(j.a, false)).b(fVar, wVar, nVar.b);
    }
}
