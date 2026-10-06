package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mp {
    public String a;
    public String b;

    public mp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp)) {
            return false;
        }
        mp mpVar = (mp) obj;
        return k71.k.b(this.a, mpVar.a) && k71.k.b(this.b, mpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ReplyTo(id=", this.a, ", __typename=", this.b, ")");
    }
}
