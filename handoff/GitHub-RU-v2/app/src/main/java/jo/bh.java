package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bh implements aaShadow.v0 {
    public final fh a;
    public final String b;
    public final String c;

    public bh(fh fhVar, String str, String str2) {
        this.a = fhVar;
        this.b = str;
        this.c = str2;
    }

    public static bh a(bh bhVar, fh fhVar) {
        String str = bhVar.b;
        String str2 = bhVar.c;
        bhVar.getClass();
        return new bh(fhVar, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh)) {
            return false;
        }
        bh bhVar = (bh) obj;
        return k71.k.b(this.a, bhVar.a) && k71.k.b(this.b, bhVar.b) && k71.k.b(this.c, bhVar.c);
    }

    public final int hashCode() {
        fh fhVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((fhVar == null ? 0 : fhVar.hashCode()) * 31, this.b, 31);
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
