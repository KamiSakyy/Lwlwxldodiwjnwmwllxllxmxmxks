package c30;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 implements aa.a {
    public static final a0 a = new a0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        r rVar;
        q qVar;
        s sVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        t tVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"MarkdownFileType"}), set2, str, set)) {
            eVar.s0();
            rVar = f0.c(eVar, wVar);
        } else {
            rVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ImageFileType"}), set2, str, set)) {
            eVar.s0();
            qVar = e0.c(eVar, wVar);
        } else {
            qVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PdfFileType"}), set2, str, set)) {
            eVar.s0();
            sVar = g0.c(eVar, wVar);
        } else {
            sVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"TextFileType"}), set2, str, set)) {
            eVar.s0();
            tVar = h0.c(eVar, wVar);
        }
        return new m(str, rVar, qVar, sVar, tVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m mVar = (m) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, mVar.a);
        r rVar = mVar.b;
        if (rVar != null) {
            f0.d(fVar, wVar, rVar);
        }
        q qVar = mVar.c;
        if (qVar != null) {
            List list = e0.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, qVar.a);
        }
        s sVar = mVar.d;
        if (sVar != null) {
            List list2 = g0.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, sVar.a);
        }
        t tVar = mVar.e;
        if (tVar != null) {
            h0.d(fVar, wVar, tVar);
        }
    }
}
