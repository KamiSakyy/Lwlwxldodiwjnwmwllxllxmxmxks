package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vf implements aaShadow.v0 {
    public bg a;
    public String b;
    public String c;

    public vf(bg bgVar, String str, String str2) {
        this.a = bgVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf)) {
            return false;
        }
        vf vfVar = (vf) obj;
        return k71.k.b(this.a, vfVar.a) && k71.k.b(this.b, vfVar.b) && k71.k.b(this.c, vfVar.c);
    }

    public final int hashCode() {
        bg bgVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((bgVar == null ? 0 : bgVar.hashCode()) * 31, this.b, 31);
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
