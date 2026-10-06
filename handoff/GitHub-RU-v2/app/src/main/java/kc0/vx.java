package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vx {
    public sx a;
    public String b;
    public String c;

    public vx(sx sxVar, String str, String str2) {
        this.a = sxVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx)) {
            return false;
        }
        vx vxVar = (vx) obj;
        return k71.k.b(this.a, vxVar.a) && k71.k.b(this.b, vxVar.b) && k71.k.b(this.c, vxVar.c);
    }

    public final int hashCode() {
        sx sxVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((sxVar == null ? 0 : sxVar.hashCode()) * 31, this.b, 31);
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
