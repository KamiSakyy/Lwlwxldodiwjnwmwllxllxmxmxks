package com.github.rudroid.actions.checkdetail;

/* loaded from: /home/user/work/p/classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public String f4652a;

    /* renamed from: b, reason: collision with root package name */
    public String f4653b;

    public b1(String str, String str2) {
        k71.k.g(str, "checkRunId");
        this.f4652a = str;
        this.f4653b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return k71.k.b(this.f4652a, b1Var.f4652a) && k71.k.b(this.f4653b, b1Var.f4653b);
    }

    public final int hashCode() {
        int hashCode = this.f4652a.hashCode() * 31;
        String str = this.f4653b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return x.i.g("RunAndPrId(checkRunId=", this.f4652a, ", pullRequestId=", this.f4653b, ")");
    }
}
