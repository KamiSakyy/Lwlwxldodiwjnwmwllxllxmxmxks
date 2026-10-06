package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tu {
    public String a;
    public String b;

    public tu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu)) {
            return false;
        }
        tu tuVar = (tu) obj;
        return k71.k.b(this.a, tuVar.a) && k71.k.b(this.b, tuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Ref(__typename=", this.a, ", id=", this.b, ")");
    }
}
