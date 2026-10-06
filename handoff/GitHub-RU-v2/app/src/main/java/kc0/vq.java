package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vq {
    public String a;
    public String b;
    public ud0.a c;

    public vq(String str, String str2, ud0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq)) {
            return false;
        }
        vq vqVar = (vq) obj;
        return k71.k.b(this.a, vqVar.a) && k71.k.b(this.b, vqVar.b) && k71.k.b(this.c, vqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Author1(__typename=", this.a, ", id=", this.b, ", actorFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
