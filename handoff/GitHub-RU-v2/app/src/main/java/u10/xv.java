package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xv {
    public uv a;
    public String b;
    public String c;

    public xv(uv uvVar, String str, String str2) {
        this.a = uvVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv)) {
            return false;
        }
        xv xvVar = (xv) obj;
        return k71.k.b(this.a, xvVar.a) && k71.k.b(this.b, xvVar.b) && k71.k.b(this.c, xvVar.c);
    }

    public final int hashCode() {
        uv uvVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((uvVar == null ? 0 : uvVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(milestones=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
