package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tb implements aaShadow.v0 {
    public vb a;
    public String b;
    public String c;

    public tb(vb vbVar, String str, String str2) {
        this.a = vbVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb)) {
            return false;
        }
        tb tbVar = (tb) obj;
        return k71.k.b(this.a, tbVar.a) && k71.k.b(this.b, tbVar.b) && k71.k.b(this.c, tbVar.c);
    }

    public final int hashCode() {
        vb vbVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((vbVar == null ? 0 : vbVar.hashCode()) * 31, this.b, 31);
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
