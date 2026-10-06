package fb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public final String a;
    public final String b;

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
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return x.i.g("OnRepositoryDependabotAlertsThread(id=", this.a, ", notificationsPermalink=", this.b, ")");
    }
}
