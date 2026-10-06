package ep;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class po implements aaShadow.a {
    public static final po a = new po();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        jo.cz czVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        jo.bz bzVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            czVar = ko.c(eVar, wVar);
        } else {
            czVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            bzVar = jo.c(eVar, wVar);
        }
        return new jo.hz(str, czVar, bzVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.hz hzVar = (jo.hz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hzVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, hzVar.a);
        jo.cz czVar = hzVar.b;
        if (czVar != null) {
            ko.d(fVar, wVar, czVar);
        }
        jo.bz bzVar = hzVar.c;
        if (bzVar != null) {
            jo.d(fVar, wVar, bzVar);
        }
    }
}
