package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w8 {
    public final String a;
    public final v8 b;
    public final String c;

    public w8(String str, v8 v8Var, String str2) {
        this.a = str;
        this.b = v8Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8)) {
            return false;
        }
        w8 w8Var = (w8) obj;
        return k71.k.b(this.a, w8Var.a) && k71.k.b(this.b, w8Var.b) && k71.k.b(this.c, w8Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v8 v8Var = this.b;
        return this.c.hashCode() + ((hashCode + (v8Var == null ? 0 : v8Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewerLatestReviewRequest(id=");
        sb.append(this.a);
        sb.append(", requestedByActor=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
