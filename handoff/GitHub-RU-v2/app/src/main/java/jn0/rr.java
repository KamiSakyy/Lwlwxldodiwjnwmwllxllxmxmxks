package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rr implements aaShadow.v0 {
    public wr a;
    public String b;
    public String c;

    public rr(wr wrVar, String str, String str2) {
        this.a = wrVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr)) {
            return false;
        }
        rr rrVar = (rr) obj;
        return k71.k.b(this.a, rrVar.a) && k71.k.b(this.b, rrVar.b) && k71.k.b(this.c, rrVar.c);
    }

    public final int hashCode() {
        wr wrVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((wrVar == null ? 0 : wrVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
