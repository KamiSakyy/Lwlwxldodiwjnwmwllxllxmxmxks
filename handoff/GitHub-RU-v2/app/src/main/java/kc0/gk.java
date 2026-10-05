package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gk implements aa.v0 {
    public final jk a;

    public gk(jk jkVar) {
        this.a = jkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gk) && k71.k.b(this.a, ((gk) obj).a);
    }

    public final int hashCode() {
        jk jkVar = this.a;
        if (jkVar == null) {
            return 0;
        }
        return jkVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
