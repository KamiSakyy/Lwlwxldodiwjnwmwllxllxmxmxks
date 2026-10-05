package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wq {
    public final String a;
    public final String b;
    public final ud0.a c;

    public wq(String str, String str2, ud0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq)) {
            return false;
        }
        wq wqVar = (wq) obj;
        return k71.k.b(this.a, wqVar.a) && k71.k.b(this.b, wqVar.b) && k71.k.b(this.c, wqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Author(__typename=", this.a, ", id=", this.b, ", actorFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
