package ox0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v {
    public final String a;
    public final String b;

    public v(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("OnRepositoryVulnerabilityAlert(id=", this.a, ", permalink=", this.b, ")");
    }
}
