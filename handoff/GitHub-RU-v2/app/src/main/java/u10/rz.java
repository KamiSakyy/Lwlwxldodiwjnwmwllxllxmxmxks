package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rz {
    public String a;
    public String b;

    public rz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz)) {
            return false;
        }
        rz rzVar = (rz) obj;
        return k71.k.b(this.a, rzVar.a) && k71.k.b(this.b, rzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("SpokenLanguage(name=", this.a, ", code=", this.b, ")");
    }
}
