package ep;

import java.util.List;
import jo.mj0;
import jo.qj0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j20 implements aa.a {
    public static final j20 a = new j20();
    public static final List b = sy.d0.o("id", "issueOrPullRequest", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        mj0 mj0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                mj0Var = (mj0) aa.c.b(aa.c.c(f20.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new qj0(str, mj0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qj0 qj0Var = (qj0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qj0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qj0Var.a);
        fVar.z0("issueOrPullRequest");
        aa.c.b(aa.c.c(f20.a, true)).b(fVar, wVar, qj0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, qj0Var.c);
    }
}
