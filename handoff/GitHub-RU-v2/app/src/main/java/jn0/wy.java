package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wy implements aa.v0 {
    public final bz a;
    public final String b;
    public final String c;

    public wy(bz bzVar, String str, String str2) {
        this.a = bzVar;
        this.b = str;
        this.c = str2;
    }

    public static wy a(wy wyVar, bz bzVar) {
        String str = wyVar.b;
        String str2 = wyVar.c;
        wyVar.getClass();
        return new wy(bzVar, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy)) {
            return false;
        }
        wy wyVar = (wy) obj;
        return k71.k.b(this.a, wyVar.a) && k71.k.b(this.b, wyVar.b) && k71.k.b(this.c, wyVar.c);
    }

    public final int hashCode() {
        bz bzVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((bzVar == null ? 0 : bzVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
