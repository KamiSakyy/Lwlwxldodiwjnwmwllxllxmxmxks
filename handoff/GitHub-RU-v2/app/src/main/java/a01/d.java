package a01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.CheckStatusState;
import java.util.List;
import jo.f4;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public final String a;
    public final String b;
    public final CheckStatusState c;
    public final String d;
    public final String e;
    public final com.github.service.models.response.a f;
    public final com.github.service.models.response.a g;
    public final f h;
    public final List i;
    public final List j;

    public d(String str, String str2, CheckStatusState checkStatusState, String str3, String str4, com.github.service.models.response.a aVar, com.github.service.models.response.a aVar2, f fVar, List list, List list2) {
        k.g(checkStatusState, "status");
        this.a = str;
        this.b = str2;
        this.c = checkStatusState;
        this.d = str3;
        this.e = str4;
        this.f = aVar;
        this.g = aVar2;
        this.h = fVar;
        this.i = list;
        this.j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && this.c == dVar.c && k.b(this.d, dVar.d) && k.b(this.e, dVar.e) && k.b(this.f, dVar.f) && k.b(this.g, dVar.g) && k.b(this.h, dVar.h) && k.b(this.i, dVar.i) && k.b(this.j, dVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + f1.e.c(this.i, (this.h.hashCode() + f4.b(this.g, f4.b(this.f, h1.i(h1.i((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31), this.e, 31), 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("DeploymentReview(deploymentId=", this.a, ", url=", this.b, ", status=");
        o.append(this.c);
        o.append(", repositoryName=");
        o.append(this.d);
        o.append(", repositoryId=");
        o.append(this.e);
        o.append(", repositoryOwner=");
        o.append(this.f);
        o.append(", creator=");
        o.append(this.g);
        o.append(", deploymentReviewWorkFlowRun=");
        o.append(this.h);
        o.append(", checkRuns=");
        o.append(this.i);
        o.append(", deploymentAssociatedPr=");
        o.append(this.j);
        o.append(")");
        return o.toString();
    }
}
