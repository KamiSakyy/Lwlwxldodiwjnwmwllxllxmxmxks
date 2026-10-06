package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cl {
    public String a;
    public String b;
    public dl c;

    public cl(String str, String str2, dl dlVar) {
        this.a = str;
        this.b = str2;
        this.c = dlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl)) {
            return false;
        }
        cl clVar = (cl) obj;
        return k71.k.b(this.a, clVar.a) && k71.k.b(this.b, clVar.b) && k71.k.b(this.c, clVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", onDiscussion=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
