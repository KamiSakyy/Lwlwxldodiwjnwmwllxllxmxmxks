package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k70 {
    public final String a;
    public final String b;

    public k70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k70)) {
            return false;
        }
        k70 k70Var = (k70) obj;
        return k71.k.b(this.a, k70Var.a) && k71.k.b(this.b, k70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("PullRequest(id=", this.a, ", __typename=", this.b, ")");
    }
}
