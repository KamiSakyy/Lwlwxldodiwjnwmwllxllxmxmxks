package a01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.type.StatusState;
import java.time.ZonedDateTime;
import k71.k;
import yz0.d3;

/* loaded from: /home/user/work/p/classes4.dex */
public class e {
    public String a;
    public String b;
    public String c;
    public int d;
    public d3 e;
    public String f;
    public ZonedDateTime g;
    public PullRequestState h;
    public StatusState i;

    public e(String str, String str2, String str3, int i, d3 d3Var, String str4, ZonedDateTime zonedDateTime, PullRequestState pullRequestState, StatusState statusState) {
        k.g(str, "id");
        k.g(str2, "url");
        k.g(str3, "title");
        k.g(str4, "name");
        k.g(zonedDateTime, "lastUpdated");
        k.g(pullRequestState, "state");
        k.g(statusState, "lastCommitState");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = d3Var;
        this.f = str4;
        this.g = zonedDateTime;
        this.h = pullRequestState;
        this.i = statusState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.a, eVar.a) && k.b(this.b, eVar.b) && k.b(this.c, eVar.c) && this.d == eVar.d && this.e.equals(eVar.e) && k.b(this.f, eVar.f) && k.b(this.g, eVar.g) && this.h == eVar.h && this.i == eVar.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + m0.a(this.g, h1.i((this.e.hashCode() + s0.b(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31)) * 31, this.f, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("DeploymentReviewAssociatedPr(id=", this.a, ", url=", this.b, ", title=");
        s0.w(this.d, this.c, ", number=", ", owner=", o);
        o.append(this.e);
        o.append(", name=");
        o.append(this.f);
        o.append(", lastUpdated=");
        o.append(this.g);
        o.append(", state=");
        o.append(this.h);
        o.append(", lastCommitState=");
        o.append(this.i);
        o.append(")");
        return o.toString();
    }
    public static Object c(Object p1, Object p2, Object p3) { return null; }
}
