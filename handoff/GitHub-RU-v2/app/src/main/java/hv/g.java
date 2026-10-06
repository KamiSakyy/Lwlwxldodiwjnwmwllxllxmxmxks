package hv;

import aa.x;
import java.util.List;
import m10.ah;
import m10.b00;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.l40;
import m10.wg;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, new aa.m("owner", l0.b(l40.e), (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        b00.Companion.getClass();
        aa.m mVar5 = new aa.m("state", l0.b(b00.s), "pullRequestState", rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("title", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.m mVar7 = new aa.m("url", l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        aa.m mVar8 = new aa.m("number", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar3 = wg.a;
        aa.m mVar9 = new aa.m("isDraft", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, new aa.m("repository", l0.b(i30.w0), (String) null, rVar, rVar, r2), new aa.m("isInMergeQueue", l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
