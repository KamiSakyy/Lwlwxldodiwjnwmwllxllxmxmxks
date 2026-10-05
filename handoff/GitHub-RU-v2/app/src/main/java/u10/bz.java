package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bz {
    public final fz a;
    public final String b;
    public final String c;

    public bz(fz fzVar, String str, String str2) {
        this.a = fzVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return false;
        }
        bz bzVar = (bz) obj;
        return k71.k.b(this.a, bzVar.a) && k71.k.b(this.b, bzVar.b) && k71.k.b(this.c, bzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dashboard(shortcuts=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
