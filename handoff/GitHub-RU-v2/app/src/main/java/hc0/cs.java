package hc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cs {
    public final es a;
    public final ks b;
    public final String c;
    public final aa1.b d;
    public final aa1.b e;
    public final lt f;

    public cs(es esVar, ks ksVar, String str, aa1.b bVar, aa1.b bVar2, lt ltVar) {
        k71.k.g(str, "name");
        this.a = esVar;
        this.b = ksVar;
        this.c = str;
        this.d = bVar;
        this.e = bVar2;
        this.f = ltVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs)) {
            return false;
        }
        cs csVar = (cs) obj;
        if (this.a != csVar.a) {
            return false;
        }
        Object obj2 = aa.t0.d;
        return obj2.equals(obj2) && this.b == csVar.b && k71.k.b(this.c, csVar.c) && this.d.equals(csVar.d) && this.e.equals(csVar.e) && this.f == csVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + f1.e.a(this.e, f1.e.a(this.d, com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((aa.t0.d.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.c, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchShortcutAttributes(color=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(aa.t0.d);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", query=");
        f1.e.w(sb, this.d, ", scopingRepository=", this.e, ", searchType=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public Object e;
}
