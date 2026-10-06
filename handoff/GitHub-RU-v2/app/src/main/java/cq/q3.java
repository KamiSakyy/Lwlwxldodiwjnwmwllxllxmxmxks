package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q3 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final eq.g h;

    public q3(String str, String str2, String str3, String str4, String str5, String str6, boolean z, eq.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return k71.k.b(this.a, q3Var.a) && k71.k.b(this.b, q3Var.b) && k71.k.b(this.c, q3Var.c) && k71.k.b(this.d, q3Var.d) && k71.k.b(this.e, q3Var.e) && k71.k.b(this.f, q3Var.f) && this.g == q3Var.g && k71.k.b(this.h, q3Var.h);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int i2 = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.d, 31), this.e, 31);
        String str2 = this.f;
        return this.h.hashCode() + x.i.e((i2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RecommendedOrganisationFeedFragment(__typename=", this.a, ", id=", this.b, ", name=");
        f1.e.x(o, this.c, ", login=", this.d, ", url=");
        f1.e.x(o, this.e, ", description=", this.f, ", viewerIsFollowing=");
        o.append(this.g);
        o.append(", avatarFragment=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }

    public Object e;
}
