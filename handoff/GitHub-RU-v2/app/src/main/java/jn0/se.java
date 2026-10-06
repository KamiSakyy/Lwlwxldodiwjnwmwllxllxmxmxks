package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class se {
    public String a;
    public String b;
    public le c;

    public se(String str, String str2, le leVar) {
        this.a = str;
        this.b = str2;
        this.c = leVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se)) {
            return false;
        }
        se seVar = (se) obj;
        return k71.k.b(this.a, seVar.a) && k71.k.b(this.b, seVar.b) && k71.k.b(this.c, seVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        le leVar = this.c;
        return i + (leVar == null ? 0 : leVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", id=", this.b, ", dashboard=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
