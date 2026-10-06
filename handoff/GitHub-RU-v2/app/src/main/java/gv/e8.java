package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e8 {
    public final String a;
    public final String b;

    public e8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        return k71.k.b(this.a, e8Var.a) && k71.k.b(this.b, e8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ViewerLatestReviewRequest(id=", this.a, ", __typename=", this.b, ")");
    }
}
