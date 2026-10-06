package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ey implements aaShadow.v0 {
    public iy a;
    public String b;
    public String c;

    public ey(iy iyVar, String str, String str2) {
        this.a = iyVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey)) {
            return false;
        }
        ey eyVar = (ey) obj;
        return k71.k.b(this.a, eyVar.a) && k71.k.b(this.b, eyVar.b) && k71.k.b(this.c, eyVar.c);
    }

    public final int hashCode() {
        iy iyVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((iyVar == null ? 0 : iyVar.hashCode()) * 31, this.b, 31);
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
