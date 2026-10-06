package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pm implements aaShadow.v0 {
    public final wm a;
    public final String b;
    public final String c;

    public pm(wm wmVar, String str, String str2) {
        this.a = wmVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm)) {
            return false;
        }
        pm pmVar = (pm) obj;
        return k71.k.b(this.a, pmVar.a) && k71.k.b(this.b, pmVar.b) && k71.k.b(this.c, pmVar.c);
    }

    public final int hashCode() {
        wm wmVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((wmVar == null ? 0 : wmVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
