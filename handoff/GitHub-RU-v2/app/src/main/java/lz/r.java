package lz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public String a;
    public String b;

    public r(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("OnRepositoryAdvisory(id=", this.a, ", url=", this.b, ")");
    }
}
