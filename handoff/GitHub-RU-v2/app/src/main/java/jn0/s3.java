package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s3 {
    public final String a;
    public final r3 b;
    public final String c;

    public s3(String str, r3 r3Var, String str2) {
        this.a = str;
        this.b = r3Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return k71.k.b(this.a, s3Var.a) && k71.k.b(this.b, s3Var.b) && k71.k.b(this.c, s3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r3 r3Var = this.b;
        return this.c.hashCode() + ((hashCode + (r3Var == null ? 0 : r3Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(id=");
        sb.append(this.a);
        sb.append(", savedReplies=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
