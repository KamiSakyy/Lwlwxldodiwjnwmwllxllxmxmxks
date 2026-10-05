package com.github.rudroid.viewmodels;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u6 {
    public final String a;
    public final ArrayList b;

    public u6(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        return this.a.equals(u6Var.a) && this.b.equals(u6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RepositoryPullRequestsUiModel(repoName=" + this.a + ", pullRequests=" + this.b + ")";
    }
}
