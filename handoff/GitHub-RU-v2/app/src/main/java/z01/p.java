package z01;

import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.IssueState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public IssueState f;
    public CloseReason g;
    public boolean h;

    public p(String str, String str2, String str3, String str4, int i, IssueState issueState, CloseReason closeReason, boolean z) {
        k71.k.g(str, "id");
        k71.k.g(str2, "title");
        k71.k.g(str3, "owner");
        k71.k.g(str4, "repoName");
        k71.k.g(issueState, "state");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = issueState;
        this.g = closeReason;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && k71.k.b(this.b, pVar.b) && k71.k.b(this.c, pVar.c) && k71.k.b(this.d, pVar.d) && this.e == pVar.e && this.f == pVar.f && this.g == pVar.g && this.h == pVar.h;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + a0.s0.b(this.e, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31)) * 31;
        CloseReason closeReason = this.g;
        return Boolean.hashCode(this.h) + ((hashCode + (closeReason == null ? 0 : closeReason.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DuplicatedIssue(id=", this.a, ", title=", this.b, ", owner=");
        f1.e.x(o, this.c, ", repoName=", this.d, ", number=");
        o.append(this.e);
        o.append(", state=");
        o.append(this.f);
        o.append(", closeReason=");
        o.append(this.g);
        o.append(", repositoryIsPrivate=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
