package com.github.rudroid.viewmodels;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t6 {
    public final String a;
    public final List b;
    public final boolean c;

    public t6(String str, List list, boolean z) {
        k71.k.g(list, "issues");
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        return k71.k.b(this.a, t6Var.a) && k71.k.b(this.b, t6Var.b) && this.c == t6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f1.e.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepositoryIssuesUiModel(repoName=");
        sb.append(this.a);
        sb.append(", issues=");
        sb.append(this.b);
        sb.append(", areIssueTypesAvailable=");
        return jo.f4.s(sb, this.c, ")");
    }
}
