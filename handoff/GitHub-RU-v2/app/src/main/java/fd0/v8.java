package fd0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v8 implements aaShadow.a {
    public static final v8 a = new v8();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        kc0.id idVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        kc0.jd jdVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"MarkdownFileType"}), set2, str, set)) {
            eVar.s0();
            idVar = x8.c(eVar, wVar);
        } else {
            idVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"TextFileType"}), set2, str, set)) {
            eVar.s0();
            jdVar = y8.c(eVar, wVar);
        }
        return new kc0.gd(str, idVar, jdVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.gd gdVar = (kc0.gd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gdVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, gdVar.a);
        kc0.id idVar = gdVar.b;
        if (idVar != null) {
            List list = x8.a;
            fVar.z0("contentRaw");
            aa.c.i.b(fVar, wVar, idVar.a);
        }
        kc0.jd jdVar = gdVar.c;
        if (jdVar != null) {
            List list2 = y8.a;
            fVar.z0("contentRaw");
            aa.c.i.b(fVar, wVar, jdVar.a);
        }
    }
}
