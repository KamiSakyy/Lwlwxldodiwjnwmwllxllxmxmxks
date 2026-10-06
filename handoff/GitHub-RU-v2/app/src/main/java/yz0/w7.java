package yz0;

import com.github.service.models.response.IssueOrPullRequestState;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w7 {
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

    public w7(String str, IssueOrPullRequestState issueOrPullRequestState, List list, List list2, List list3, v2 v2Var, s sVar, com.github.service.models.response.a aVar, ArrayList arrayList, boolean z) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        return this.a.equals(w7Var.a) && this.b == w7Var.b && this.c.equals(w7Var.c) && this.d.equals(w7Var.d) && this.e.equals(w7Var.e) && k71.k.b(this.f, w7Var.f) && k71.k.b(this.g, w7Var.g) && this.h.equals(w7Var.h) && this.i.equals(w7Var.i) && this.j == w7Var.j;
    }

    public final int hashCode() {
        int h = com.github.rudroid.copilot.h1.h(com.github.rudroid.copilot.h1.h(com.github.rudroid.copilot.h1.h((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), this.d, 31), this.e, 31);
        v2 v2Var = this.f;
        return Boolean.hashCode(this.j) + no.a.b(this.i, jo.f4.b(this.h, (this.g.hashCode() + ((h + (v2Var == null ? 0 : v2Var.hashCode())) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "UpdateIssue(id=" + this.a + ", state=" + this.b + ", assignees=" + this.c + ", labels=" + this.d + ", projects=" + this.e + ", milestone=" + this.f + ", body=" + this.g + ", actor=" + this.h + ", eventItems=" + this.i + ", viewerCanReopen=" + this.j + ")";
    }
}
