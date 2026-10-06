package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gz {
    public final String a;
    public final fz b;
    public final String c;

    public gz(String str, fz fzVar, String str2) {
        this.a = str;
        this.b = fzVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz)) {
            return false;
        }
        gz gzVar = (gz) obj;
        return k71.k.b(this.a, gzVar.a) && k71.k.b(this.b, gzVar.b) && k71.k.b(this.c, gzVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fz fzVar = this.b;
        return this.c.hashCode() + ((hashCode + (fzVar == null ? 0 : fzVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Comparison(id=");
        sb.append(this.a);
        sb.append(", compare=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
