package rn0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        qn0.h hVar;
        qn0.i iVar;
        vn0.m1 m1Var;
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
        if (m71.a.v(m71.a.O(new String[]{"CheckRun"}), set2, str, set)) {
            eVar.s0();
            hVar = g.c(eVar, wVar);
        } else {
            hVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RequiredStatusCheck"}), set2, str, set)) {
            eVar.s0();
            iVar = h.c(eVar, wVar);
        } else {
            iVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"StatusContext"}), set2, str, set)) {
            eVar.s0();
            m1Var = vn0.r1.c(eVar, wVar);
        } else {
            m1Var = null;
        }
        if (str2 != null) {
            return new qn0.g(str, str2, hVar, iVar, m1Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qn0.g gVar = (qn0.g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, gVar.b);
        qn0.h hVar = gVar.c;
        if (hVar != null) {
            g.d(fVar, wVar, hVar);
        }
        qn0.i iVar = gVar.d;
        if (iVar != null) {
            h.d(fVar, wVar, iVar);
        }
        vn0.m1 m1Var = gVar.e;
        if (m1Var != null) {
            vn0.r1.d(fVar, wVar, m1Var);
        }
    }
}
