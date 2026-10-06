package p20;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oc implements aaShadow.a {
    public static final oc a = new oc();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        u10.aj ajVar;
        u10.bj bjVar;
        u10.zi ziVar;
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
            ajVar = qc.c(eVar, wVar);
        } else {
            ajVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            bjVar = rc.c(eVar, wVar);
        } else {
            bjVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), set2, str, set)) {
            eVar.s0();
            ziVar = pc.c(eVar, wVar);
        } else {
            ziVar = null;
        }
        if (str2 != null) {
            return new u10.yi(str, str2, ajVar, bjVar, ziVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.yi yiVar = (u10.yi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yiVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, yiVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, yiVar.b);
        u10.aj ajVar = yiVar.c;
        if (ajVar != null) {
            qc.d(fVar, wVar, ajVar);
        }
        u10.bj bjVar = yiVar.d;
        if (bjVar != null) {
            rc.d(fVar, wVar, bjVar);
        }
        u10.zi ziVar = yiVar.e;
        if (ziVar != null) {
            pc.d(fVar, wVar, ziVar);
        }
    }
}
