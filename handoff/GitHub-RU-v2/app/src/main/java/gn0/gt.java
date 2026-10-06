package gn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gt {
    public jt a;
    public pt b;
    public String c;
    public aa1.b d;
    public aa1.b e;
    public pu f;

    public gt(jt jtVar, pt ptVar, String str, aa1.b bVar, aa1.b bVar2, pu puVar) {
        k71.k.g(str, "name");
        this.a = jtVar;
        this.b = ptVar;
        this.c = str;
        this.d = bVar;
        this.e = bVar2;
        this.f = puVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt)) {
            return false;
        }
        gt gtVar = (gt) obj;
        if (this.a != gtVar.a) {
            return false;
        }
        Object obj2 = aa.t0.d;
        return obj2.equals(obj2) && this.b == gtVar.b && k71.k.b(this.c, gtVar.c) && this.d.equals(gtVar.d) && this.e.equals(gtVar.e) && this.f == gtVar.f;
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
