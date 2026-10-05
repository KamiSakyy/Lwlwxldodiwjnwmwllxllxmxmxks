package ov;

import aa.m;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.ch;
import m10.eh;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ch.Companion.getClass();
        x xVar = ch.a;
        k.g(xVar, "type");
        r rVar = r.r;
        m mVar = new m("startLine", xVar, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("line", xVar, "endLine", rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        k.g(xVar2, "type");
        m mVar3 = new m("startLineType", xVar2, (String) null, rVar, rVar, rVar);
        m mVar4 = new m("endLineType", xVar2, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
