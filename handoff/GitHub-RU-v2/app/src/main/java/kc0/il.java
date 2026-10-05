package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class il implements aa.m0 {
    public final jl a;

    public il(jl jlVar) {
        this.a = jlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof il) && k71.k.b(this.a, ((il) obj).a);
    }

    public final int hashCode() {
        jl jlVar = this.a;
        if (jlVar == null) {
            return 0;
        }
        return jlVar.hashCode();
    }

    public final String toString() {
        return "Data(minimizeComment=" + this.a + ")";
    }
}
