package uz;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import m10.ch;
import m10.eh;
import m10.qa;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("titleHTML", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        m mVar4 = new m("duration", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        qa.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("startDate", l0.b(qa.a), (String) null, rVar, rVar, rVar)});
    }
}
