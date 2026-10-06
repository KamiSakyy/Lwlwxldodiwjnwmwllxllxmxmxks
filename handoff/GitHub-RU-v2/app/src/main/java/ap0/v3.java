package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v3 {
    public String a;
    public String b;

    public v3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj;
        return k71.k.b(this.a, v3Var.a) && k71.k.b(this.b, v3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Owner(id=", this.a, ", avatarUrl=", this.b, ")");
    }
}
