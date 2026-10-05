package fd0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class id implements aa.a {
    public static final id a = new id();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        kc0.ck ckVar;
        kc0.dk dkVar;
        kc0.bk bkVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            ckVar = kd.c(eVar, wVar);
        } else {
            ckVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            dkVar = ld.c(eVar, wVar);
        } else {
            dkVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), set2, str, set)) {
            eVar.s0();
            bkVar = jd.c(eVar, wVar);
        } else {
            bkVar = null;
        }
        if (str2 != null) {
            return new kc0.ak(str, str2, ckVar, dkVar, bkVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ak akVar = (kc0.ak) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(akVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, akVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, akVar.b);
        kc0.ck ckVar = akVar.c;
        if (ckVar != null) {
            kd.d(fVar, wVar, ckVar);
        }
        kc0.dk dkVar = akVar.d;
        if (dkVar != null) {
            ld.d(fVar, wVar, dkVar);
        }
        kc0.bk bkVar = akVar.e;
        if (bkVar != null) {
            jd.d(fVar, wVar, bkVar);
        }
    }
}
