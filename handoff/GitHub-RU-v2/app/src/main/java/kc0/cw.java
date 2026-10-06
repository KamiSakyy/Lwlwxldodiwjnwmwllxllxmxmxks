package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cw {
    public final bw a;
    public final String b;
    public final String c;

    public cw(bw bwVar, String str, String str2) {
        this.a = bwVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw)) {
            return false;
        }
        cw cwVar = (cw) obj;
        return k71.k.b(this.a, cwVar.a) && k71.k.b(this.b, cwVar.b) && k71.k.b(this.c, cwVar.c);
    }

    public final int hashCode() {
        bw bwVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((bwVar == null ? 0 : bwVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(defaultBranchRef=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
