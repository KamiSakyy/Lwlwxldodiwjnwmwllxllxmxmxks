package com.github.rudroid.copilot;

/* loaded from: /home/user/work/p/classes.dex */
public final class f5 {

    /* renamed from: a, reason: collision with root package name */
    public String f9557a;

    /* renamed from: b, reason: collision with root package name */
    public k91.a f9558b;

    public f5(String str, k91.a aVar) {
        k71.k.g(str, "content");
        k71.k.g(aVar, "rootNode");
        this.f9557a = str;
        this.f9558b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        return k71.k.b(this.f9557a, f5Var.f9557a) && k71.k.b(this.f9558b, f5Var.f9558b);
    }

    public final int hashCode() {
        return this.f9558b.hashCode() + (this.f9557a.hashCode() * 31);
    }

    public final String toString() {
        return "ModelPolicyTermsMarkdown(content=" + this.f9557a + ", rootNode=" + this.f9558b + ")";
    }
}
