package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lz implements aaShadow.v0 {
    public mz a;
    public String b;
    public String c;

    public lz(mz mzVar, String str, String str2) {
        this.a = mzVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz)) {
            return false;
        }
        lz lzVar = (lz) obj;
        return k71.k.b(this.a, lzVar.a) && k71.k.b(this.b, lzVar.b) && k71.k.b(this.c, lzVar.c);
    }

    public final int hashCode() {
        mz mzVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((mzVar == null ? 0 : mzVar.hashCode()) * 31, this.b, 31);
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
