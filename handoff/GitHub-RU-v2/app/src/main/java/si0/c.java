package si0;

import aa.x;
import gn0.mx;
import gn0.tb;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        mx.Companion.getClass();
        x xVar = mx.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = d0.n(new aa.m("url", xVar, (String) null, rVar, rVar, rVar));
        List n2 = d0.n(new aa.m("url", xVar, (String) null, rVar, rVar, rVar));
        tb.Companion.getClass();
        x xVar2 = tb.a;
        a = x61.l.r(new aa.s[]{new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("ImageFileType", d0.n("ImageFileType"), n), new aa.n("PdfFileType", d0.n("PdfFileType"), n2), new aa.n("MarkdownFileType", d0.n("MarkdownFileType"), d0.n(new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar))), new aa.n("TextFileType", d0.n("TextFileType"), d0.n(new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)))});
    }
}
