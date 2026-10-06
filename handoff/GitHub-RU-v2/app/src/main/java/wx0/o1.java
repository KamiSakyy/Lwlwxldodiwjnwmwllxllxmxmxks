package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o1 {
    public String a;
    public String b;

    public o1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return k71.k.b(this.a, o1Var.a) && k71.k.b(this.b, o1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("OnProjectV2IterationField(id=", this.a, ", name=", this.b, ")");
    }
}
