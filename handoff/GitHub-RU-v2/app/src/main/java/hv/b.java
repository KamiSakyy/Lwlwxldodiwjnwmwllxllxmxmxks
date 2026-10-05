package hv;

import aa.x;
import java.util.List;
import m10.ch;
import m10.eh;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List r = x61.l.r(new aa.m[]{new aa.m("__typename", b, (String) null, rVar, rVar, rVar), new aa.m("baseCommitOid", xVar, (String) null, rVar, rVar, rVar), new aa.m("headCommitOid", xVar, (String) null, rVar, rVar, rVar), new aa.m("commitOid", xVar, (String) null, rVar, rVar, rVar)});
        aa.m mVar = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar2 = new aa.m("baseCommitOid", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("headCommitOid", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("commitOid", xVar, (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        x xVar2 = ch.a;
        k71.k.g(xVar2, "type");
        a = x61.l.r(new aa.s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("FileComment", d0.n("FileComment"), r), new aa.n("LineComment", d0.n("LineComment"), x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, new aa.m("line", xVar2, (String) null, rVar, rVar, rVar)})), new aa.n("MultilineComment", d0.n("MultilineComment"), x61.l.r(new aa.m[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("baseCommitOid", xVar, (String) null, rVar, rVar, rVar), new aa.m("headCommitOid", xVar, (String) null, rVar, rVar, rVar), new aa.m("endCommitOid", xVar, (String) null, rVar, rVar, rVar), new aa.m("startCommitOid", xVar, (String) null, rVar, rVar, rVar), new aa.m("startLine", xVar2, (String) null, rVar, rVar, rVar), new aa.m("endLine", xVar2, (String) null, rVar, rVar, rVar)})), new aa.n("IndeterminateComment", d0.n("IndeterminateComment"), d0.n(new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)))});
    }
}
