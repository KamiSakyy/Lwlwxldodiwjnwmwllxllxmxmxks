package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yk {
    public final String a;
    public final String b;

    public yk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk)) {
            return false;
        }
        yk ykVar = (yk) obj;
        return k71.k.b(this.a, ykVar.a) && k71.k.b(this.b, ykVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ReplyTo(id=", this.a, ", __typename=", this.b, ")");
    }
}
