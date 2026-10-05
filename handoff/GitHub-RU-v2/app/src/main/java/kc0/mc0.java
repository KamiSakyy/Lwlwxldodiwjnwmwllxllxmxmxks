package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mc0 implements aa.v0 {
    public final qc0 a;

    public mc0(qc0 qc0Var) {
        this.a = qc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mc0) && k71.k.b(this.a, ((mc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
