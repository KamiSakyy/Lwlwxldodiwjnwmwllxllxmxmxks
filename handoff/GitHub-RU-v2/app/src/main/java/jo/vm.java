package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vm {
    public final String a;
    public final zt.d b;

    public vm(String str, zt.d dVar) {
        this.a = str;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm)) {
            return false;
        }
        vm vmVar = (vm) obj;
        return k71.k.b(this.a, vmVar.a) && k71.k.b(this.b, vmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node3(__typename=" + this.a + ", mentionableItem=" + this.b + ")";
    }
}
