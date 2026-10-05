package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yx {
    public final ux a;
    public final xx b;
    public final String c;
    public final String d;

    public yx(ux uxVar, xx xxVar, String str, String str2) {
        this.a = uxVar;
        this.b = xxVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx)) {
            return false;
        }
        yx yxVar = (yx) obj;
        return k71.k.b(this.a, yxVar.a) && k71.k.b(this.b, yxVar.b) && k71.k.b(this.c, yxVar.c) && k71.k.b(this.d, yxVar.d);
    }

    public final int hashCode() {
        ux uxVar = this.a;
        int hashCode = (uxVar == null ? 0 : uxVar.hashCode()) * 31;
        xx xxVar = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (xxVar != null ? xxVar.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(defaultBranchRef=");
        sb.append(this.a);
        sb.append(", refs=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
