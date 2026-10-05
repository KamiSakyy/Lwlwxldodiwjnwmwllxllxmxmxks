package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d5 {
    public final boolean a;
    public final String b;

    public d5(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        return this.a == d5Var.a && k71.k.b(this.b, d5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return com.github.rudroid.m0.f("SupportContact(isEmail=", ", supportLink=", this.b, ")", this.a);
    }
}
