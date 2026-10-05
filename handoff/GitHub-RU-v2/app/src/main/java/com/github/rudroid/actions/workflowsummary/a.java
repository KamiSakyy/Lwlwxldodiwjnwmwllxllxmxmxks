package com.github.rudroid.actions.workflowsummary;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5520a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5521b;

    public a(String str, String str2) {
        k71.k.g(str, "checkSuiteId");
        this.f5520a = str;
        this.f5521b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.f5520a, aVar.f5520a) && k71.k.b(this.f5521b, aVar.f5521b);
    }

    public final int hashCode() {
        int hashCode = this.f5520a.hashCode() * 31;
        String str = this.f5521b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return x.i.g("CheckSuiteAndPrId(checkSuiteId=", this.f5520a, ", pullRequestId=", this.f5521b, ")");
    }
}
