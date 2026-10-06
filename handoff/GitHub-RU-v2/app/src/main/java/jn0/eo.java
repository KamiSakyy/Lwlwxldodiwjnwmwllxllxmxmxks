package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eo implements aaShadow.v0 {
    public go a;
    public String b;
    public String c;

    public eo(go goVar, String str, String str2) {
        this.a = goVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo)) {
            return false;
        }
        eo eoVar = (eo) obj;
        return k71.k.b(this.a, eoVar.a) && k71.k.b(this.b, eoVar.b) && k71.k.b(this.c, eoVar.c);
    }

    public final int hashCode() {
        go goVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((goVar == null ? 0 : goVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(organization=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
