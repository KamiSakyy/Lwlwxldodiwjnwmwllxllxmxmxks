package hv;

import aa.x;
import java.util.List;
import m10.cc0;
import m10.eh;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        cc0.Companion.getClass();
        x xVar = cc0.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new aa.m("url", xVar, (String) null, rVar, rVar, rVar));
        List n2 = d0Shadow.n(new aa.m("url", xVar, (String) null, rVar, rVar, rVar));
        eh.Companion.getClass();
        x xVar2 = eh.a;
        a = x61.l.r(new aa.s[]{new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("ImageFileType", d0Shadow.n("ImageFileType"), n), new aa.n("PdfFileType", d0Shadow.n("PdfFileType"), n2), new aa.n("MarkdownFileType", d0Shadow.n("MarkdownFileType"), d0Shadow.n(new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar))), new aa.n("TextFileType", d0Shadow.n("TextFileType"), d0Shadow.n(new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)))});
    }
}
