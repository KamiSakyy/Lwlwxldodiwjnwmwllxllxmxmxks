package fb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public final String a;
    public final String b;

    public u(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return x.i.g("OnSecurityAdvisory(id=", this.a, ", notificationsPermalink=", this.b, ")");
    }
}
