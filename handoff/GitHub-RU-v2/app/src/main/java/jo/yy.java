package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yy implements aaShadow.v0 {
    public final hz a;
    public final String b;
    public final String c;

    public yy(hz hzVar, String str, String str2) {
        this.a = hzVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy)) {
            return false;
        }
        yy yyVar = (yy) obj;
        return k71.k.b(this.a, yyVar.a) && k71.k.b(this.b, yyVar.b) && k71.k.b(this.c, yyVar.c);
    }

    public final int hashCode() {
        hz hzVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((hzVar == null ? 0 : hzVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repositoryOwner=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
