package com.github.rudroid.repository.issues;

import com.github.rudroid.copilot.h1;
import yz0.n5;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19861a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19862b;

    /* renamed from: c, reason: collision with root package name */
    public final n5 f19863c;

    public b(boolean z10, String str, n5 n5Var) {
        k71.k.g(n5Var, "templateModel");
        this.f19861a = z10;
        this.f19862b = str;
        this.f19863c = n5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19861a == bVar.f19861a && k71.k.b(this.f19862b, bVar.f19862b) && k71.k.b(this.f19863c, bVar.f19863c);
    }

    public final int hashCode() {
        return this.f19863c.hashCode() + h1.i(Boolean.hashCode(this.f19861a) * 31, this.f19862b, 31);
    }

    public final String toString() {
        StringBuilder t10 = h1.t("CreateNewIssueModel(isRepositoryArchived=", ", repoId=", this.f19862b, ", templateModel=", this.f19861a);
        t10.append(this.f19863c);
        t10.append(")");
        return t10.toString();
    }
}
