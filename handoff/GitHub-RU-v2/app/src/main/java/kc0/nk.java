package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nk implements aaShadow.v0 {
    public final ok a;

    public nk(ok okVar) {
        this.a = okVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nk) && k71.k.b(this.a, ((nk) obj).a);
    }

    public final int hashCode() {
        ok okVar = this.a;
        if (okVar == null) {
            return 0;
        }
        return okVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
