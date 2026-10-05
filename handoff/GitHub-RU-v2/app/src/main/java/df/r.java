package df;

/* loaded from: /home/user/work/p/classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f21793a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21794b;

    public r(String str, String str2) {
        k71.k.g(str, "login");
        k71.k.g(str2, "avatarURL");
        this.f21793a = str;
        this.f21794b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.f21793a, rVar.f21793a) && k71.k.b(this.f21794b, rVar.f21794b);
    }

    public final int hashCode() {
        return this.f21794b.hashCode() + (this.f21793a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ProjectUsers(login=", this.f21793a, ", avatarURL=", this.f21794b, ")");
    }
}
