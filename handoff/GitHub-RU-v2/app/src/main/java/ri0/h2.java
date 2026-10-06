package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h2 {
    public String a;
    public String b;

    public h2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return k71.k.b(this.a, h2Var.a) && k71.k.b(this.b, h2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("HeadRepositoryOwner(id=", this.a, ", login=", this.b, ")");
    }
}
