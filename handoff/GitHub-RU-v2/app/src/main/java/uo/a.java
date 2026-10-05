package uo;

import aa.m;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.rf0;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        k.g(xVar, "type");
        r rVar = r.r;
        m mVar = new m("viewerCopilotAgentCreatesChannel", xVar, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("viewerCopilotAgentUpdatesChannel", xVar, (String) null, rVar, rVar, rVar);
        m mVar3 = new m("viewerCopilotAgentLogUpdatesChannel", xVar, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new m[]{mVar, mVar2, mVar3, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        a = l.r(new m[]{new m("viewer", l0.b(rf0.g0), (String) null, rVar, rVar, r), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
