package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class li {
    public String a;
    public String b;
    public uu0.o c;

    public li(String str, String str2, uu0.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li)) {
            return false;
        }
        li liVar = (li) obj;
        return k71.k.b(this.a, liVar.a) && k71.k.b(this.b, liVar.b) && k71.k.b(this.c, liVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", issueTemplateFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
