package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class su {
    public String a;
    public String b;
    public hu c;

    public su(String str, String str2, hu huVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = huVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su)) {
            return false;
        }
        su suVar = (su) obj;
        return k71.k.b(this.a, suVar.a) && k71.k.b(this.b, suVar.b) && k71.k.b(this.c, suVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        hu huVar = this.c;
        return i + (huVar == null ? 0 : huVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Target(__typename=", this.a, ", id=", this.b, ", onTag=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
