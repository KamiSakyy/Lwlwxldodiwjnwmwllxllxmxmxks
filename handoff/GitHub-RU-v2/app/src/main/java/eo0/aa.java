package eo0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class aa implements aa.a {
    static final aa a = new aa();
    static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        jn0.ze zeVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        jn0.af afVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"MarkdownFileType"}), set2, str, set)) {
            eVar.s0();
            zeVar = ca.c(eVar, wVar);
        } else {
            zeVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"TextFileType"}), set2, str, set)) {
            eVar.s0();
            afVar = da.c(eVar, wVar);
        }
        return new jn0.xe(str, zeVar, afVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.xe xeVar = (jn0.xe) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xeVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, xeVar.a);
        jn0.ze zeVar = xeVar.b;
        if (zeVar != null) {
            List list = ca.a;
            fVar.z0("contentRaw");
            aa.c.i.b(fVar, wVar, zeVar.a);
        }
        jn0.af afVar = xeVar.c;
        if (afVar != null) {
            List list2 = da.a;
            fVar.z0("contentRaw");
            aa.c.i.b(fVar, wVar, afVar.a);
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a<T1,T2,T3,T4> {
        public a() {
        }
    }
}
