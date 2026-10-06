package xt0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l implements aa.a {
    public static final List a = sy.d0Shadow.n("__typename");

    public static k c(ea.e eVar, aa.w wVar) {
        g gVar;
        i iVar;
        h hVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        j jVar = null;
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"ImageFileType"}), set2, str, set)) {
            eVar.s0();
            gVar = m.c(eVar, wVar);
        } else {
            gVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PdfFileType"}), set2, str, set)) {
            eVar.s0();
            iVar = o.c(eVar, wVar);
        } else {
            iVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"MarkdownFileType"}), set2, str, set)) {
            eVar.s0();
            hVar = n.c(eVar, wVar);
        } else {
            hVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"TextFileType"}), set2, str, set)) {
            eVar.s0();
            jVar = p.c(eVar, wVar);
        }
        return new k(str, gVar, iVar, hVar, jVar);
    }

    public static void d(ea.f fVar, aa.w wVar, k kVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, kVar.a);
        g gVar = kVar.b;
        if (gVar != null) {
            List list = m.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, gVar.a);
        }
        i iVar = kVar.c;
        if (iVar != null) {
            List list2 = o.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, iVar.a);
        }
        h hVar = kVar.d;
        if (hVar != null) {
            n.d(fVar, wVar, hVar);
        }
        j jVar = kVar.e;
        if (jVar != null) {
            p.d(fVar, wVar, jVar);
        }
    }
}
