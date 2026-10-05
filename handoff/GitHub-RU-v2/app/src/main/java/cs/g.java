package cs;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g implements aa.a {
    public static final List a = x61.l.r(new String[]{"currentUserCanApprove", "environment", "reviewers"});

    public static f c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        a aVar = null;
        e eVar2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 1) {
                aVar = (a) aa.c.c(h.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                eVar2 = (e) aa.c.c(l.a, false).a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "currentUserCanApprove");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (aVar == null) {
            k41.b.B(eVar, "environment");
            throw null;
        }
        if (eVar2 != null) {
            return new f(booleanValue, aVar, eVar2);
        }
        k41.b.B(eVar, "reviewers");
        throw null;
    }

}
