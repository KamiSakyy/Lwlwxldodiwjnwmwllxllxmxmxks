package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hx implements aaShadow.v0 {
    public final jx a;

    public hx(jx jxVar) {
        this.a = jxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx) && k71.k.b(this.a, ((hx) obj).a);
    }

    public final int hashCode() {
        jx jxVar = this.a;
        if (jxVar == null) {
            return 0;
        }
        return jxVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
