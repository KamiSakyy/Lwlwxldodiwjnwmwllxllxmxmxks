package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sz {
    public rz a;
    public String b;
    public String c;

    public sz(rz rzVar, String str, String str2) {
        this.a = rzVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz)) {
            return false;
        }
        sz szVar = (sz) obj;
        return k71.k.b(this.a, szVar.a) && k71.k.b(this.b, szVar.b) && k71.k.b(this.c, szVar.c);
    }

    public final int hashCode() {
        rz rzVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((rzVar == null ? 0 : rzVar.hashCode()) * 31, this.b, 31);
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
