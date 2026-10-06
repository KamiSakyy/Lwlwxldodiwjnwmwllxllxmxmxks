package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fm {
    public int a;
    public String b;
    public bm c;
    public cm d;
    public String e;
    public String f;

    public fm(int i, String str, bm bmVar, cm cmVar, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = bmVar;
        this.d = cmVar;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm)) {
            return false;
        }
        fm fmVar = (fm) obj;
        return this.a == fmVar.a && k71.k.b(this.b, fmVar.b) && k71.k.b(this.c, fmVar.c) && k71.k.b(this.d, fmVar.d) && k71.k.b(this.e, fmVar.e) && k71.k.b(this.f, fmVar.f);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(Integer.hashCode(this.a) * 31, this.b, 31);
        bm bmVar = this.c;
        return this.f.hashCode() + com.github.rudroid.copilot.h1.i((this.d.hashCode() + ((i + (bmVar == null ? 0 : bmVar.hashCode())) * 31)) * 31, this.e, 31);
    }

    public final String toString() {
        StringBuilder n = x.i.n(this.a, "Discussion(number=", ", title=", this.b, ", author=");
        n.append(this.c);
        n.append(", category=");
        n.append(this.d);
        n.append(", id=");
        return x.i.k(n, this.e, ", __typename=", this.f, ")");
    }
}
