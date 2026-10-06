package on;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.PullRequestState;
import jo.f4Shadow;
import yz0.d3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public String a;
    public String b;
    public String c;
    public int d;
    public d3 e;
    public String f;
    public int g;
    public int h;
    public PullRequestState i;
    public boolean j;
    public boolean k;

    public i(String str, String str2, String str3, int i, d3 d3Var, String str4, int i2, int i3, PullRequestState pullRequestState, boolean z, boolean z2) {
        k71.k.g(pullRequestState, "state");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = d3Var;
        this.f = str4;
        this.g = i2;
        this.h = i3;
        this.i = pullRequestState;
        this.j = z;
        this.k = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && k71.k.b(this.c, iVar.c) && this.d == iVar.d && k71.k.b(this.e, iVar.e) && k71.k.b(this.f, iVar.f) && this.g == iVar.g && this.h == iVar.h && this.i == iVar.i && this.j == iVar.j && this.k == iVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + x.i.e((this.i.hashCode() + s0.b(this.h, s0.b(this.g, h1.i((this.e.hashCode() + s0.b(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31)) * 31, this.f, 31), 31), 31)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder o = s0.o("PullRequestAgentResource(id=", this.a, ", title=", this.b, ", titleHTML=");
        s0.w(this.d, this.c, ", number=", ", owner=", o);
        o.append(this.e);
        o.append(", url=");
        o.append(this.f);
        o.append(", additions=");
        s0.z(o, this.g, ", deletions=", this.h, ", state=");
        o.append(this.i);
        o.append(", isDraft=");
        o.append(this.j);
        o.append(", isInMergeQueue=");
        return f4Shadow.s(o, this.k, ")");
    }
}
