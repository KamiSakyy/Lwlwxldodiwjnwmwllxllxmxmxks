package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cs implements aaShadow.v0 {
    public final ps a;
    public final String b;
    public final String c;

    public cs(ps psVar, String str, String str2) {
        this.a = psVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs)) {
            return false;
        }
        cs csVar = (cs) obj;
        return k71.k.b(this.a, csVar.a) && k71.k.b(this.b, csVar.b) && k71.k.b(this.c, csVar.c);
    }

    public final int hashCode() {
        ps psVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((psVar == null ? 0 : psVar.hashCode()) * 31, this.b, 31);
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
