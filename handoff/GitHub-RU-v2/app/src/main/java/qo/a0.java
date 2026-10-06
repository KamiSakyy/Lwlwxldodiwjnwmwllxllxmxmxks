package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0Shadow {
    public String a;
    public vo.a b;

    public Object a0(String str, vo.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0Shadow)) {
            return false;
        }
        a0Shadow a0Var = (a0Shadow) obj;
        return k71.k.b(this.a, a0Var.a) && k71.k.b(this.b, a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", checkStepFragment=" + this.b + ")";
    }
}
