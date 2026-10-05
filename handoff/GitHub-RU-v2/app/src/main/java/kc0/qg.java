package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qg {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ud0.c e;
    public final wk0.z f;

    public qg(String str, String str2, String str3, boolean z, ud0.c cVar, wk0.z zVar) {
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
        if (!(obj instanceof qg)) {
            return false;
        }
        qg qgVar = (qg) obj;
        return k71.k.b(this.a, qgVar.a) && k71.k.b(this.b, qgVar.b) && k71.k.b(this.c, qgVar.c) && this.d == qgVar.d && k71.k.b(this.e, qgVar.e) && k71.k.b(this.f, qgVar.f);
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
