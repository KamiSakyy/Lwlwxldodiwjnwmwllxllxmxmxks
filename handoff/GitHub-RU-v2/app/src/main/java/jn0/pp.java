package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pp {
    public final String a;
    public final mp b;
    public final String c;

    public pp(String str, mp mpVar, String str2) {
        this.a = str;
        this.b = mpVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp)) {
            return false;
        }
        pp ppVar = (pp) obj;
        return k71.k.b(this.a, ppVar.a) && k71.k.b(this.b, ppVar.b) && k71.k.b(this.c, ppVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mp mpVar = this.b;
        return this.c.hashCode() + ((hashCode + (mpVar == null ? 0 : mpVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ref(id=");
        sb.append(this.a);
        sb.append(", compare=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
