package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ho {
    public String a;
    public String b;

    public ho(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho)) {
            return false;
        }
        ho hoVar = (ho) obj;
        return k71.k.b(this.a, hoVar.a) && k71.k.b(this.b, hoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Deployment(id=", this.a, ", __typename=", this.b, ")");
    }
}
