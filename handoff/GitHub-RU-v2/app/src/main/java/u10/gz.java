package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gz {
    public final bz a;
    public final String b;
    public final String c;

    public gz(bz bzVar, String str, String str2) {
        this.a = bzVar;
        this.b = str;
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
        bz bzVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((bzVar == null ? 0 : bzVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(dashboard=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
