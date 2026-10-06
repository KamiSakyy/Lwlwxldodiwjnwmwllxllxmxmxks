package com.github.rudroid.uitoolkit.codesearch;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final String a;
    public final String b;

    public e(String str, String str2) {
        k71.k.g(str, "displayValue");
        k71.k.g(str2, "outputValue");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Qualifier(displayValue=", this.a, ", outputValue=", this.b, ")");
    }
}
