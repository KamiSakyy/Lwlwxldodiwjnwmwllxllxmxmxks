package zu;

import aa.m;
import aa.n;
import aa.q0;
import aa.s;
import aa.x;
import aa.x0;
import hv.d;
import java.util.List;
import k71.k;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.gf;
import m10.na0;
import m10.uc;
import m10.wg;
import m10.wr;
import m10.yb0;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        cc0.Companion.getClass();
        x xVar = cc0.a;
        k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        List n = d0Shadow.n(new m("url", xVar, (String) null, rVar, rVar, rVar));
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = l.r(new s[]{new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("ImageFileType", d0Shadow.n("ImageFileType"), n)});
        m mVar = new m("path", xVar2, (String) null, rVar, rVar, rVar);
        gf.Companion.getClass();
        x0 x0Var = gf.a;
        k.g(x0Var, "type");
        List r2 = l.r(new m[]{mVar, new m("fileType", x0Var, (String) null, rVar, rVar, r)});
        List n2 = d0Shadow.n(new m("gitUrl", l0.b(xVar), (String) null, rVar, rVar, rVar));
        s mVar2 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List r3 = l.r(new String[]{"ImageFileType", "MarkdownFileType", "PdfFileType", "TextFileType"});
        List list = d.a;
        List r4 = l.r(new s[]{mVar2, no.a.c(list, "selections", "File", r3, list)});
        m mVar3 = new m("path", xVar2, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar3 = wg.a;
        m mVar4 = new m("isGenerated", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        na0.Companion.getClass();
        q0 q0Var = na0.a;
        k.g(q0Var, "type");
        m mVar5 = new m("submodule", q0Var, (String) null, rVar, rVar, n2);
        ch.Companion.getClass();
        x xVar4 = ch.a;
        k.g(xVar4, "type");
        List r5 = l.r(new m[]{mVar3, mVar4, mVar5, new m("lineCount", xVar4, (String) null, rVar, rVar, rVar), new m("fileType", x0Var, (String) null, rVar, rVar, r4)});
        s mVar6 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n3 = d0Shadow.n("DiffLine");
        List list2 = fs.a.a;
        List r6 = l.r(new s[]{mVar6, no.a.c(list2, "selections", "DiffLine", n3, list2)});
        ah.Companion.getClass();
        m mVar7 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("linesAdded", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("linesDeleted", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        yb0.Companion.getClass();
        q0 q0Var2 = yb0.a;
        k.g(q0Var2, "type");
        m mVar10 = new m("oldTreeEntry", q0Var2, (String) null, rVar, rVar, r2);
        m mVar11 = new m("newTreeEntry", q0Var2, (String) null, rVar, rVar, r5);
        uc.Companion.getClass();
        m mVar12 = new m("diffLines", l0.a(uc.a), (String) null, rVar, rVar, r6);
        m mVar13 = new m("isBinary", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar14 = new m("isLargeDiff", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar15 = new m("isSubmodule", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        wr.Companion.getClass();
        a = l.r(new m[]{mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, new m("status", l0.b(wr.s), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
