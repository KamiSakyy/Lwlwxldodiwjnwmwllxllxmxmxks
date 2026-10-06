package com.github.rudroid.issueorpullrequest.subissues.editsubissues;

/* loaded from: /home/user/work/p/classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public String f16094a;

    /* renamed from: b, reason: collision with root package name */
    public String f16095b;

    public b0(String str, String str2) {
        k71.k.g(str, "subIssueIdToRemove");
        k71.k.g(str2, "parentIssueId");
        this.f16094a = str;
        this.f16095b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.f16094a, b0Var.f16094a) && k71.k.b(this.f16095b, b0Var.f16095b);
    }

    public final int hashCode() {
        return this.f16095b.hashCode() + (this.f16094a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("RemovingSubIssueState(subIssueIdToRemove=", this.f16094a, ", parentIssueId=", this.f16095b, ")");
    }
}
