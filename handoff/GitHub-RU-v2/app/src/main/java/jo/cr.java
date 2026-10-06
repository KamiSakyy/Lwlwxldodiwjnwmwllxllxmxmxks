package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cr {
    public final String a;
    public final String b;

    public cr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr)) {
            return false;
        }
        cr crVar = (cr) obj;
        return k71.k.b(this.a, crVar.a) && k71.k.b(this.b, crVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Comment(id=", this.a, ", __typename=", this.b, ")");
    }
}
