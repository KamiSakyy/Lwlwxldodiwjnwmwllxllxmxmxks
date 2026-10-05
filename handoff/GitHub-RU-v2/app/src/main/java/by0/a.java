package by0;

import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import aa.x0;
import java.util.List;
import k71.k;
import pz0.go;
import pz0.jp;
import pz0.td;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("id", b, (String) null, rVar, rVar, rVar));
        List n2 = d0.n(new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar));
        List n3 = d0.n(new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar));
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r = l.r(new s[]{new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("ProjectV2Field", d0.n("ProjectV2Field"), n), new n("ProjectV2SingleSelectField", d0.n("ProjectV2SingleSelectField"), n2), new n("ProjectV2IterationField", d0.n("ProjectV2IterationField"), n3)});
        s mVar = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List r2 = l.r(new String[]{"ProjectV2GroupAssigneeValue", "ProjectV2GroupDateValue", "ProjectV2GroupIssueTypeValue", "ProjectV2GroupIterationValue", "ProjectV2GroupMilestoneValue", "ProjectV2GroupNumberValue", "ProjectV2GroupRepositoryValue", "ProjectV2GroupSingleSelectValue", "ProjectV2GroupTextValue"});
        List list = d.a;
        List r3 = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2GroupValue", r2, list)});
        m mVar2 = new m("viewGroupId", xVar2, (String) null, rVar, rVar, rVar);
        m mVar3 = new m("title", xVar2, (String) null, rVar, rVar, rVar);
        go.Companion.getClass();
        x0 x0Var = go.a;
        k.g(x0Var, "type");
        m mVar4 = new m("field", x0Var, (String) null, rVar, rVar, r);
        jp.Companion.getClass();
        x0 x0Var2 = jp.a;
        k.g(x0Var2, "type");
        a = l.r(new m[]{mVar2, mVar3, mVar4, new m("value", x0Var2, (String) null, rVar, rVar, r3), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
