package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ej {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final eq.g e;
    public final qx.z f;

    public ej(String str, String str2, String str3, boolean z, eq.g gVar, qx.z zVar) {
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
        if (!(obj instanceof ej)) {
            return false;
        }
        ej ejVar = (ej) obj;
        return k71.k.b(this.a, ejVar.a) && k71.k.b(this.b, ejVar.b) && k71.k.b(this.c, ejVar.c) && this.d == ejVar.d && k71.k.b(this.e, ejVar.e) && k71.k.b(this.f, ejVar.f);
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
