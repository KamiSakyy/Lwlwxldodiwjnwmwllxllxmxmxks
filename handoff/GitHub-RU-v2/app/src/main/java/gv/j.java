package gv;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j implements aa.a {
    public static final List a = sy.d0.n("__typename");

    public static i c(ea.e eVar, aa.w wVar) {
        e eVar2;
        g gVar;
        h hVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        f fVar = null;
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"FileComment"}), set2, str, set)) {
            eVar.s0();
            eVar2 = k.c(eVar, wVar);
        } else {
            eVar2 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"LineComment"}), set2, str, set)) {
            eVar.s0();
            gVar = m.c(eVar, wVar);
        } else {
            gVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"MultilineComment"}), set2, str, set)) {
            eVar.s0();
            hVar = n.c(eVar, wVar);
        } else {
            hVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"IndeterminateComment"}), set2, str, set)) {
            eVar.s0();
            fVar = l.c(eVar, wVar);
        }
        return new i(str, eVar2, gVar, hVar, fVar);
    }
}
