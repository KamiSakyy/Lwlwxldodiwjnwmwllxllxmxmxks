package yz0;

import com.github.service.models.response.IssueOrPullRequestState;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y7 {
    public String a;
    public IssueOrPullRequestState b;
    public Object c;
    public Object d;
    public Object e;
    public v2 f;
    public s g;
    public com.github.service.models.response.a h;
    public ArrayList i;
    public boolean j;
    public boolean k;

    public y7(String str, IssueOrPullRequestState issueOrPullRequestState, List list, List list2, List list3, v2 v2Var, s sVar, com.github.service.models.response.a aVar, ArrayList arrayList, boolean z, boolean z2) {
        k71.k.g(issueOrPullRequestState, "state");
        k71.k.g(sVar, "body");
        this.a = str;
        this.b = issueOrPullRequestState;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = v2Var;
        this.g = sVar;
        this.h = aVar;
        this.i = arrayList;
        this.j = z;
        this.k = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        return this.a.equals(y7Var.a) && this.b == y7Var.b && this.c.equals(y7Var.c) && this.d.equals(y7Var.d) && this.e.equals(y7Var.e) && k71.k.b(this.f, y7Var.f) && k71.k.b(this.g, y7Var.g) && this.h.equals(y7Var.h) && this.i.equals(y7Var.i) && this.j == y7Var.j && this.k == y7Var.k;
    }

    public final int hashCode() {
        int h = com.github.rudroid.copilot.h1.h(com.github.rudroid.copilot.h1.h(com.github.rudroid.copilot.h1.h((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), this.d, 31), this.e, 31);
        v2 v2Var = this.f;
        return Boolean.hashCode(this.k) + x.i.e(no.a.b(this.i, jo.f4.b(this.h, (this.g.hashCode() + ((h + (v2Var == null ? 0 : v2Var.hashCode())) * 31)) * 31, 31), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdatePullRequest(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", assignees=");
        sb.append(this.c);
        sb.append(", labels=");
        sb.append(this.d);
        sb.append(", projects=");
        sb.append(this.e);
        sb.append(", milestone=");
        sb.append(this.f);
        sb.append(", body=");
        sb.append(this.g);
        sb.append(", actor=");
        sb.append(this.h);
        sb.append(", eventItems=");
        sb.append(this.i);
        sb.append(", viewerCanDeleteHeadRef=");
        sb.append(this.j);
        sb.append(", viewerCanReopen=");
        return jo.f4.s(sb, this.k, ")");
    }

    public Object i;
}
