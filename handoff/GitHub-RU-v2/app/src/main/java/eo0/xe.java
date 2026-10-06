package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xe implements aaShadow.a {
    public static final xe a = new xe();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        jn0.gm gmVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
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
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            gmVar = ye.c(eVar, wVar);
        } else {
            gmVar = null;
        }
        if (str2 != null) {
            return new jn0.fm(str, str2, gmVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.fm fmVar = (jn0.fm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fmVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fmVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, fmVar.b);
        jn0.gm gmVar = fmVar.c;
        if (gmVar != null) {
            ye.d(fVar, wVar, gmVar);
        }
    }
}
