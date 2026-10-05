package ea0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "viewerCanUnblock"});

    public static s0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        eVar.s0();
        c1 c = d1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (bool != null) {
            return new s0(str, bool.booleanValue(), c);
        }
        k41.b.B(eVar, "viewerCanUnblock");
        throw null;
    }
}
