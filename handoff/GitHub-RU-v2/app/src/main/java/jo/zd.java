package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zd {
    public final String a;
    public final m10.gb0 b;

    public zd(String str, m10.gb0 gb0Var) {
        this.a = str;
        this.b = gb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd)) {
            return false;
        }
        zd zdVar = (zd) obj;
        return k71.k.b(this.a, zdVar.a) && this.b == zdVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EnterpriseSupportContact(link=" + this.a + ", linkType=" + this.b + ")";
    }
}
