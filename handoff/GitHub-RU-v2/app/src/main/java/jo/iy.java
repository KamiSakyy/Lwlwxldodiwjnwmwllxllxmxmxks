package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class iy implements aaShadow.v0 {
    public final ky a;
    public final String b;
    public final String c;

    public iy(ky kyVar, String str, String str2) {
        this.a = kyVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy)) {
            return false;
        }
        iy iyVar = (iy) obj;
        return k71.k.b(this.a, iyVar.a) && k71.k.b(this.b, iyVar.b) && k71.k.b(this.c, iyVar.c);
    }

    public final int hashCode() {
        ky kyVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((kyVar == null ? 0 : kyVar.hashCode()) * 31, this.b, 31);
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
