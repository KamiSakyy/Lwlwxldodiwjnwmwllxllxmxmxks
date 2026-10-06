package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o7 {
    public final String a;
    public final String b;

    public o7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        return k71.k.b(this.a, o7Var.a) && k71.k.b(this.b, o7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ReplyTo1(id=", this.a, ", __typename=", this.b, ")");
    }
}
