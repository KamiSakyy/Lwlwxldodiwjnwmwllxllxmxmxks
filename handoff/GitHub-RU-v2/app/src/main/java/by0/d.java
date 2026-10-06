package by0;

import aa.m;
import aa.n;
import aa.p;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import pz0.m7;
import pz0.rd;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        p a2 = l0.a(l0.b(xVar));
        rShadow rVar = rShadow.r;
        List n = d0Shadow.n(new m("logins", a2, (String) null, rVar, rVar, rVar));
        m7.Companion.getClass();
        x xVar2 = m7.a;
        k.g(xVar2, "type");
        List n2 = d0Shadow.n(new m("date", xVar2, (String) null, rVar, rVar, rVar));
        List n3 = d0Shadow.n(new m("iterationId", xVar, (String) null, rVar, rVar, rVar));
        List n4 = d0Shadow.n(new m("title", xVar, (String) null, rVar, rVar, rVar));
        rd.Companion.getClass();
        x xVar3 = rd.a;
        k.g(xVar3, "type");
        a = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("ProjectV2GroupAssigneeValue", d0Shadow.n("ProjectV2GroupAssigneeValue"), n), new n("ProjectV2GroupDateValue", d0Shadow.n("ProjectV2GroupDateValue"), n2), new n("ProjectV2GroupIterationValue", d0Shadow.n("ProjectV2GroupIterationValue"), n3), new n("ProjectV2GroupMilestoneValue", d0Shadow.n("ProjectV2GroupMilestoneValue"), n4), new n("ProjectV2GroupNumberValue", d0Shadow.n("ProjectV2GroupNumberValue"), d0Shadow.n(new m("number", xVar3, (String) null, rVar, rVar, rVar))), new n("ProjectV2GroupRepositoryValue", d0Shadow.n("ProjectV2GroupRepositoryValue"), d0Shadow.n(new m("nameWithOwner", xVar, (String) null, rVar, rVar, rVar))), new n("ProjectV2GroupSingleSelectValue", d0Shadow.n("ProjectV2GroupSingleSelectValue"), d0Shadow.n(new m("optionId", xVar, (String) null, rVar, rVar, rVar))), new n("ProjectV2GroupTextValue", d0Shadow.n("ProjectV2GroupTextValue"), d0Shadow.n(new m("text", xVar, (String) null, rVar, rVar, rVar)))});
    }
}
