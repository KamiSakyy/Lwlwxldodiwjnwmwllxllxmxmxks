package ox0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w {
    public final String a;
    public final String b;

    public w(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && k71.k.b(this.b, wVar.b);
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
