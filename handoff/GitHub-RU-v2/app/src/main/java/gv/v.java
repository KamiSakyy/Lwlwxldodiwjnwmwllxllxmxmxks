package gv;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v implements aa.a {
    public static final List a = sy.d0.n("__typename");

    public static u c(ea.e eVar, aa.w wVar) {
        q qVar;
        s sVar;
        r rVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        t tVar = null;
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"ImageFileType"}), set2, str, set)) {
            eVar.s0();
            qVar = w.c(eVar, wVar);
        } else {
            qVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PdfFileType"}), set2, str, set)) {
            eVar.s0();
            sVar = y.c(eVar, wVar);
        } else {
            sVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"MarkdownFileType"}), set2, str, set)) {
            eVar.s0();
            rVar = x.c(eVar, wVar);
        } else {
            rVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"TextFileType"}), set2, str, set)) {
            eVar.s0();
            tVar = z.c(eVar, wVar);
        }
        return new u(str, qVar, sVar, rVar, tVar);
    }

    public static void d(ea.f fVar, aa.w wVar, u uVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, uVar.a);
        q qVar = uVar.b;
        if (qVar != null) {
            List list = w.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, qVar.a);
        }
        s sVar = uVar.c;
        if (sVar != null) {
            List list2 = y.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, sVar.a);
        }
        r rVar = uVar.d;
        if (rVar != null) {
            x.d(fVar, wVar, rVar);
        }
        t tVar = uVar.e;
        if (tVar != null) {
            z.d(fVar, wVar, tVar);
        }
    }
}
