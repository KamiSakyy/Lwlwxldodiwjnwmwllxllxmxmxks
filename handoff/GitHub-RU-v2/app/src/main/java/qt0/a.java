package qt0;

import aa.m;
import aa.n;
import aa.q0;
import aa.s;
import aa.x;
import aa.x0;
import java.util.List;
import k71.k;
import pz0.cc;
import pz0.d50;
import pz0.h50;
import pz0.pd;
import pz0.q9;
import pz0.rm;
import pz0.td;
import pz0.vd;
import pz0.x30;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;
import x61.r;
import yt0.c;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        h50.Companion.getClass();
        x xVar = h50.a;
        k.g(xVar, "type");
        r rVar = r.r;
        List n = d0.n(new m("url", xVar, (String) null, rVar, rVar, rVar));
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r = l.r(new s[]{new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("ImageFileType", d0.n("ImageFileType"), n)});
        m mVar = new m("path", xVar2, (String) null, rVar, rVar, rVar);
        cc.Companion.getClass();
        x0 x0Var = cc.a;
        k.g(x0Var, "type");
        List r2 = l.r(new m[]{mVar, new m("fileType", x0Var, (String) null, rVar, rVar, r)});
        List n2 = d0.n(new m("gitUrl", l0.b(xVar), (String) null, rVar, rVar, rVar));
        s mVar2 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List r3 = l.r(new String[]{"ImageFileType", "MarkdownFileType", "PdfFileType", "TextFileType"});
        List list = c.a;
        List r4 = l.r(new s[]{mVar2, no.a.c(list, "selections", "File", r3, list)});
        m mVar3 = new m("path", xVar2, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar3 = pd.a;
        m mVar4 = new m("isGenerated", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        x30.Companion.getClass();
        q0 q0Var = x30.a;
        k.g(q0Var, "type");
        m mVar5 = new m("submodule", q0Var, (String) null, rVar, rVar, n2);
        vd.Companion.getClass();
        x xVar4 = vd.a;
        k.g(xVar4, "type");
        List r5 = l.r(new m[]{mVar3, mVar4, mVar5, new m("lineCount", xVar4, (String) null, rVar, rVar, rVar), new m("fileType", x0Var, (String) null, rVar, rVar, r4)});
        s mVar6 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n3 = d0.n("DiffLine");
        List list2 = xq0.a.a;
        List r6 = l.r(new s[]{mVar6, no.a.c(list2, "selections", "DiffLine", n3, list2)});
        td.Companion.getClass();
        m mVar7 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("linesAdded", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("linesDeleted", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        d50.Companion.getClass();
        q0 q0Var2 = d50.a;
        k.g(q0Var2, "type");
        m mVar10 = new m("oldTreeEntry", q0Var2, (String) null, rVar, rVar, r2);
        m mVar11 = new m("newTreeEntry", q0Var2, (String) null, rVar, rVar, r5);
        q9.Companion.getClass();
        m mVar12 = new m("diffLines", l0.a(q9.a), (String) null, rVar, rVar, r6);
        m mVar13 = new m("isBinary", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar14 = new m("isLargeDiff", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar15 = new m("isSubmodule", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        rm.Companion.getClass();
        a = l.r(new m[]{mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, new m("status", l0.b(rm.s), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
