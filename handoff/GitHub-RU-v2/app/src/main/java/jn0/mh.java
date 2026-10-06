package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mh implements aaShadow.v0 {
    public nh a;
    public bi b;
    public ci c;
    public di d;
    public zh e;
    public kh f;
    public String g;
    public String h;

    public mh(nh nhVar, bi biVar, ci ciVar, di diVar, zh zhVar, kh khVar, String str, String str2) {
        this.a = nhVar;
        this.b = biVar;
        this.c = ciVar;
        this.d = diVar;
        this.e = zhVar;
        this.f = khVar;
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh)) {
            return false;
        }
        mh mhVar = (mh) obj;
        return k71.k.b(this.a, mhVar.a) && k71.k.b(this.b, mhVar.b) && k71.k.b(this.c, mhVar.c) && k71.k.b(this.d, mhVar.d) && k71.k.b(this.e, mhVar.e) && k71.k.b(this.f, mhVar.f) && k71.k.b(this.g, mhVar.g) && k71.k.b(this.h, mhVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        kh khVar = this.f;
        return this.h.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (khVar == null ? 0 : khVar.hashCode())) * 31, this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(issues=");
        sb.append(this.a);
        sb.append(", pullRequests=");
        sb.append(this.b);
        sb.append(", repos=");
        sb.append(this.c);
        sb.append(", users=");
        sb.append(this.d);
        sb.append(", organizations=");
        sb.append(this.e);
        sb.append(", code=");
        sb.append(this.f);
        sb.append(", id=");
        return x.i.k(sb, this.g, ", __typename=", this.h, ")");
    }
}
