package mn;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.WorkflowRunEvent;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final String a;
    public final String b;
    public final com.github.service.models.response.a c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final com.github.service.models.response.a h;
    public final CheckStatusState i;
    public final CheckConclusionState j;
    public final int k;
    public final m l;
    public final e m;
    public final e n;
    public final j o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final int s;
    public final Integer t;
    public final Avatar u;
    public final WorkflowRunEvent v;

    public g(String str, String str2, com.github.service.models.response.a aVar, String str3, String str4, String str5, String str6, com.github.service.models.response.a aVar2, CheckStatusState checkStatusState, CheckConclusionState checkConclusionState, int i, m mVar, e eVar, e eVar2, j jVar, String str7, boolean z, boolean z2, int i2, Integer num, Avatar avatar, WorkflowRunEvent workflowRunEvent) {
        k71.k.g(str, "checkSuiteId");
        k71.k.g(str2, "prTitle");
        k71.k.g(str3, "repoName");
        k71.k.g(str4, "abbreviatedOid");
        k71.k.g(str5, "commitId");
        k71.k.g(checkStatusState, "status");
        k71.k.g(str7, "url");
        k71.k.g(workflowRunEvent, "event");
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = aVar2;
        this.i = checkStatusState;
        this.j = checkConclusionState;
        this.k = i;
        this.l = mVar;
        this.m = eVar;
        this.n = eVar2;
        this.o = jVar;
        this.p = str7;
        this.q = z;
        this.r = z2;
        this.s = i2;
        this.t = num;
        this.u = avatar;
        this.v = workflowRunEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && k71.k.b(this.c, gVar.c) && k71.k.b(this.d, gVar.d) && k71.k.b(this.e, gVar.e) && k71.k.b(this.f, gVar.f) && k71.k.b(this.g, gVar.g) && k71.k.b(this.h, gVar.h) && this.i == gVar.i && this.j == gVar.j && this.k == gVar.k && k71.k.b(this.l, gVar.l) && k71.k.b(this.m, gVar.m) && k71.k.b(this.n, gVar.n) && k71.k.b(this.o, gVar.o) && k71.k.b(this.p, gVar.p) && this.q == gVar.q && this.r == gVar.r && this.s == gVar.s && k71.k.b(this.t, gVar.t) && k71.k.b(this.u, gVar.u) && this.v == gVar.v;
    }

    public final int hashCode() {
        int i = h1.i(h1.i(h1.i(f4.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31), this.e, 31), this.f, 31);
        String str = this.g;
        int hashCode = (this.i.hashCode() + f4.b(this.h, (i + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        CheckConclusionState checkConclusionState = this.j;
        int hashCode2 = (this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + s0.b(this.k, (hashCode + (checkConclusionState == null ? 0 : checkConclusionState.hashCode())) * 31, 31)) * 31)) * 31)) * 31;
        j jVar = this.o;
        int b = s0.b(this.s, x.i.e(x.i.e(h1.i((hashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31, this.p, 31), 31, this.q), 31, this.r), 31);
        Integer num = this.t;
        int hashCode3 = (b + (num == null ? 0 : num.hashCode())) * 31;
        Avatar avatar = this.u;
        return this.v.hashCode() + ((hashCode3 + (avatar != null ? avatar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String a = qb.b.a(this.e);
        StringBuilder o = s0.o("ActionCheckSuiteSummary(checkSuiteId=", this.a, ", prTitle=", this.b, ", repoOwner=");
        o.append(this.c);
        o.append(", repoName=");
        o.append(this.d);
        o.append(", abbreviatedOid=");
        f1.e.x(o, a, ", commitId=", this.f, ", branchName=");
        o.append(this.g);
        o.append(", creator=");
        o.append(this.h);
        o.append(", status=");
        o.append(this.i);
        o.append(", conclusion=");
        o.append(this.j);
        o.append(", totalCheckRuns=");
        o.append(this.k);
        o.append(", jobStatusCount=");
        o.append(this.l);
        o.append(", checkRuns=");
        o.append(this.m);
        o.append(", failedCheckRuns=");
        o.append(this.n);
        o.append(", workFlowRun=");
        o.append(this.o);
        o.append(", url=");
        o.append(this.p);
        o.append(", viewerCanManageActions=");
        m0.A(o, this.q, ", rerunnable=", this.r, ", duration=");
        o.append(this.s);
        o.append(", artifactCount=");
        o.append(this.t);
        o.append(", checkSuiteAppAvatar=");
        o.append(this.u);
        o.append(", event=");
        o.append(this.v);
        o.append(")");
        return o.toString();
    }
}
