package com.github.rudroid.uitoolkit.text;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 {
    public final String a;
    public final j71.a b;

    public i0(String str, j71.a aVar) {
        k71.k.g(str, "tag");
        k71.k.g(aVar, "action");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return k71.k.b(this.a, i0Var.a) && k71.k.b(this.b, i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StringAnnotation(tag=" + this.a + ", action=" + this.b + ")";
    }
}
