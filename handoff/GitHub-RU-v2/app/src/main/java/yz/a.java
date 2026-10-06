package yz;

import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import aa.x0;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.lt;
import m10.qu;
import sy.d0Shadow;
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
        List n = d0Shadow.n(new m("id", b, (String) null, rVar, rVar, rVar));
        List n2 = d0Shadow.n(new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar));
        List n3 = d0Shadow.n(new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar));
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = l.r(new s[]{new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("ProjectV2Field", d0Shadow.n("ProjectV2Field"), n), new n("ProjectV2SingleSelectField", d0Shadow.n("ProjectV2SingleSelectField"), n2), new n("ProjectV2IterationField", d0Shadow.n("ProjectV2IterationField"), n3)});
        s mVar = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List r2 = l.r(new String[]{"ProjectV2GroupAssigneeValue", "ProjectV2GroupDateValue", "ProjectV2GroupIssueTypeValue", "ProjectV2GroupIterationValue", "ProjectV2GroupMilestoneValue", "ProjectV2GroupNumberValue", "ProjectV2GroupParentIssueValue", "ProjectV2GroupRepositoryValue", "ProjectV2GroupSingleSelectValue", "ProjectV2GroupTextValue"});
        List list = d.a;
        List r3 = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2GroupValue", r2, list)});
        m mVar2 = new m("viewGroupId", xVar2, (String) null, rVar, rVar, rVar);
        m mVar3 = new m("title", xVar2, (String) null, rVar, rVar, rVar);
        lt.Companion.getClass();
        x0 x0Var = lt.a;
        k.g(x0Var, "type");
        m mVar4 = new m("field", x0Var, (String) null, rVar, rVar, r);
        qu.Companion.getClass();
        x0 x0Var2 = qu.a;
        k.g(x0Var2, "type");
        a = l.r(new m[]{mVar2, mVar3, mVar4, new m("value", x0Var2, (String) null, rVar, rVar, r3), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
