package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h8 {
    public final String a;
    public final String b;
    public final String c;

    public h8(String str, String str2, String str3) {
        k71.k.g(str, "achievableSlug");
        k71.k.g(str2, "title");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return k71.k.b(this.a, h8Var.a) && k71.k.b(this.b, h8Var.b) && k71.k.b(this.c, h8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("AchievementBadge(achievableSlug=", this.a, ", title=", this.b, ", badgeImageUrl="), this.c, ")");
    }
}
