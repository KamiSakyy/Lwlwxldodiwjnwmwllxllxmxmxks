package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p1 {
    public String a;
    public String b;

    public p1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return k71.k.b(this.a, p1Var.a) && k71.k.b(this.b, p1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("OnProjectV2SingleSelectField(id=", this.a, ", name=", this.b, ")");
    }
}
