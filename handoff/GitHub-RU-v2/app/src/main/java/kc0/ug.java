package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ug {
    public final String a;
    public final String b;
    public final oj0.h c;

    public ug(String str, String str2, oj0.h hVar) {
        this.a = str;
        this.b = str2;
        this.c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug)) {
            return false;
        }
        ug ugVar = (ug) obj;
        return k71.k.b(this.a, ugVar.a) && k71.k.b(this.b, ugVar.b) && k71.k.b(this.c, ugVar.c);
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
