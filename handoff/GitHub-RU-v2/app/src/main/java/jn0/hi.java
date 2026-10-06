package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hi {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public cp0.g e;
    public fw0.z f;

    public hi(String str, String str2, String str3, boolean z, cp0.g gVar, fw0.z zVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = gVar;
        this.f = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi)) {
            return false;
        }
        hi hiVar = (hi) obj;
        return k71.k.b(this.a, hiVar.a) && k71.k.b(this.b, hiVar.b) && k71.k.b(this.c, hiVar.c) && this.d == hiVar.d && k71.k.b(this.e, hiVar.e) && k71.k.b(this.f, hiVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", id=", this.b, ", login=");
        com.github.rudroid.m0.x(o, this.c, ", isEmployee=", this.d, ", avatarFragment=");
        o.append(this.e);
        o.append(", homeRecentActivity=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
