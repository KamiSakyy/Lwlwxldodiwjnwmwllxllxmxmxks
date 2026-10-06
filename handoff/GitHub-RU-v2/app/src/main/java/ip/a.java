package ip;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import m10.ah;
import m10.b00;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.gh;
import m10.i30;
import m10.l40;
import m10.wg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = l.r(new m[]{mVar, new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, new m("owner", l0.b(l40.e), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        b00.Companion.getClass();
        m mVar5 = new m("state", l0.b(b00.s), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar3 = wg.a;
        m mVar6 = new m("isDraft", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("isInMergeQueue", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("title", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        gh.Companion.getClass();
        m mVar9 = new m("titleHTML", l0.b(gh.a), "titleHTMLString", rVar, rVar, rVar);
        ch.Companion.getClass();
        x xVar4 = ch.a;
        m mVar10 = new m("number", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        m mVar11 = new m("repository", l0.b(i30.w0), (String) null, rVar, rVar, r2);
        cc0.Companion.getClass();
        a = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, new m("url", l0.b(cc0.a), (String) null, rVar, rVar, rVar), new m("additions", l0.b(xVar4), (String) null, rVar, rVar, rVar), new m("deletions", l0.b(xVar4), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
