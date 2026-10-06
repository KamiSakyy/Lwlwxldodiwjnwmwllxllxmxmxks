package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rb implements aaShadow.a {
    public static final rb a = new rb();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "replyTo"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        kc0.mh mhVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                mhVar = (kc0.mh) aa.c.b(aa.c.c(wb.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        yf0.i c = yf0.l.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new kc0.gh(str, str2, mhVar, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.gh ghVar = (kc0.gh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ghVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ghVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ghVar.b);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(wb.a, false)).b(fVar, wVar, ghVar.c);
        List list = yf0.l.a;
        yf0.l.d(fVar, wVar, ghVar.d);
    }
}
