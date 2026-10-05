package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cw {
    public final String a;
    public final String b;

    public cw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw)) {
            return false;
        }
        cw cwVar = (cw) obj;
        return k71.k.b(this.a, cwVar.a) && k71.k.b(this.b, cwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Parent1(id=", this.a, ", __typename=", this.b, ")");
    }
}
