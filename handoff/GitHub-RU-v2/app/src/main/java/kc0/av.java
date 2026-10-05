package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class av implements aa.v0 {
    public final bv a;

    public av(bv bvVar) {
        this.a = bvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof av) && k71.k.b(this.a, ((av) obj).a);
    }

    public final int hashCode() {
        bv bvVar = this.a;
        if (bvVar == null) {
            return 0;
        }
        return bvVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
