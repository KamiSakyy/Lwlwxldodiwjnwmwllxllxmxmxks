package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yd {
    public String a;
    public String b;
    public zd c;

    public yd(String str, String str2, zd zdVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = zdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd)) {
            return false;
        }
        yd ydVar = (yd) obj;
        return k71.k.b(this.a, ydVar.a) && k71.k.b(this.b, ydVar.b) && k71.k.b(this.c, ydVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        zd zdVar = this.c;
        return i + (zdVar == null ? 0 : zdVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Object(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
