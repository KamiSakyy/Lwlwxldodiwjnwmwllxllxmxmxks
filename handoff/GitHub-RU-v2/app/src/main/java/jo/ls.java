package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ls implements aaShadow.v0 {
    public final ks a;
    public final is b;
    public final ms c;
    public final rs d;
    public final String e;
    public final String f;

    public ls(ks ksVar, is isVar, ms msVar, rs rsVar, String str, String str2) {
        this.a = ksVar;
        this.b = isVar;
        this.c = msVar;
        this.d = rsVar;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls)) {
            return false;
        }
        ls lsVar = (ls) obj;
        return k71.k.b(this.a, lsVar.a) && k71.k.b(this.b, lsVar.b) && k71.k.b(this.c, lsVar.c) && k71.k.b(this.d, lsVar.d) && k71.k.b(this.e, lsVar.e) && k71.k.b(this.f, lsVar.f);
    }

    public final int hashCode() {
        ks ksVar = this.a;
        int hashCode = (ksVar == null ? 0 : ksVar.hashCode()) * 31;
        is isVar = this.b;
        int hashCode2 = (hashCode + (isVar == null ? 0 : isVar.hashCode())) * 31;
        ms msVar = this.c;
        int hashCode3 = (hashCode2 + (msVar == null ? 0 : msVar.hashCode())) * 31;
        rs rsVar = this.d;
        return this.f.hashCode() + com.github.rudroid.copilot.h1.i((hashCode3 + (rsVar != null ? rsVar.hashCode() : 0)) * 31, this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(created=");
        sb.append(this.a);
        sb.append(", assigned=");
        sb.append(this.b);
        sb.append(", mentioned=");
        sb.append(this.c);
        sb.append(", requested=");
        sb.append(this.d);
        sb.append(", id=");
        return x.i.k(sb, this.e, ", __typename=", this.f, ")");
    }
}
