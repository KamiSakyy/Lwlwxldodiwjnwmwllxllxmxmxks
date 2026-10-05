package yz;

import aa.m;
import aa.n;
import aa.p;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import m10.eh;
import m10.qa;
import m10.yg;
import sy.d0;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        p a2 = l0.a(l0.b(xVar));
        r rVar = r.r;
        List n = d0.n(new m("logins", a2, (String) null, rVar, rVar, rVar));
        qa.Companion.getClass();
        x xVar2 = qa.a;
        k.g(xVar2, "type");
        List n2 = d0.n(new m("date", xVar2, (String) null, rVar, rVar, rVar));
        List n3 = d0.n(new m("iterationId", xVar, (String) null, rVar, rVar, rVar));
        List n4 = d0.n(new m("title", xVar, (String) null, rVar, rVar, rVar));
        yg.Companion.getClass();
        x xVar3 = yg.a;
        k.g(xVar3, "type");
        a = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("ProjectV2GroupAssigneeValue", d0.n("ProjectV2GroupAssigneeValue"), n), new n("ProjectV2GroupDateValue", d0.n("ProjectV2GroupDateValue"), n2), new n("ProjectV2GroupIterationValue", d0.n("ProjectV2GroupIterationValue"), n3), new n("ProjectV2GroupMilestoneValue", d0.n("ProjectV2GroupMilestoneValue"), n4), new n("ProjectV2GroupNumberValue", d0.n("ProjectV2GroupNumberValue"), d0.n(new m("number", xVar3, (String) null, rVar, rVar, rVar))), new n("ProjectV2GroupRepositoryValue", d0.n("ProjectV2GroupRepositoryValue"), d0.n(new m("nameWithOwner", xVar, (String) null, rVar, rVar, rVar))), new n("ProjectV2GroupSingleSelectValue", d0.n("ProjectV2GroupSingleSelectValue"), d0.n(new m("optionId", xVar, (String) null, rVar, rVar, rVar))), new n("ProjectV2GroupTextValue", d0.n("ProjectV2GroupTextValue"), d0.n(new m("text", xVar, (String) null, rVar, rVar, rVar)))});
    }
}
