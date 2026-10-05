package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qf {
    public final String a;
    public final String b;
    public final rf c;

    public qf(String str, String str2, rf rfVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = rfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf)) {
            return false;
        }
        qf qfVar = (qf) obj;
        return k71.k.b(this.a, qfVar.a) && k71.k.b(this.b, qfVar.b) && k71.k.b(this.c, qfVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        rf rfVar = this.c;
        return i + (rfVar == null ? 0 : rfVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Object(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
