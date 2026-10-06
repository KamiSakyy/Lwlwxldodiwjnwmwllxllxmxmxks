package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class va implements aaShadow.a {
    public static final va a = new va();
    public static final List b = sy.d0.o(new String[]{"id", "gitObject", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.wf wfVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                wfVar = (jn0.wf) aa.c.b(aa.c.c(qa.a, true)).a(eVar, wVar);
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
            return new jn0.bg(str, wfVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.bg bgVar = (jn0.bg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bgVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, bgVar.a);
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(qa.a, true)).b(fVar, wVar, bgVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, bgVar.c);
    }
}
