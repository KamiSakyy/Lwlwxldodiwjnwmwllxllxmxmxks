package yz0;

import com.github.service.models.response.IssueOrPullRequest$ReviewerReviewState;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d2 {
    public final String a;
    public final ArrayList b;
    public final IssueOrPullRequest$ReviewerReviewState c;
    public final boolean d;

    public d2(String str, ArrayList arrayList, IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState, boolean z) {
        k71.k.g(issueOrPullRequest$ReviewerReviewState, "latestReviewState");
        this.a = str;
        this.b = arrayList;
        this.c = issueOrPullRequest$ReviewerReviewState;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.a.equals(d2Var.a) && this.b.equals(d2Var.b) && this.c == d2Var.c && this.d == d2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder p = com.github.rudroid.m0.p("Review(id=", this.a, ", onBehalfOf=", this.b, ", latestReviewState=");
        p.append(this.c);
        p.append(", isEmpty=");
        p.append(this.d);
        p.append(")");
        return p.toString();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class IssueOrPullRequest$ReviewerReviewState<T1,T2,T3,T4> {
        public IssueOrPullRequest$ReviewerReviewState() {
        }
    }

    public d2(Object... a) {
    }
}
