package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class of {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final e30.c e;
    public final ea0.z f;

    public of(String str, String str2, String str3, boolean z, e30.c cVar, ea0.z zVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = cVar;
        this.f = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of)) {
            return false;
        }
        of ofVar = (of) obj;
        return k71.k.b(this.a, ofVar.a) && k71.k.b(this.b, ofVar.b) && k71.k.b(this.c, ofVar.c) && this.d == ofVar.d && k71.k.b(this.e, ofVar.e) && k71.k.b(this.f, ofVar.f);
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
