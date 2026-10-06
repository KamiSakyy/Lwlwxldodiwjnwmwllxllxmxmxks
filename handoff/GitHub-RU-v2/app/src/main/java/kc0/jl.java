package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jl {
    public kl a;

    public jl(kl klVar) {
        this.a = klVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jl) && k71.k.b(this.a, ((jl) obj).a);
    }

    public final int hashCode() {
        kl klVar = this.a;
        if (klVar == null) {
            return 0;
        }
        return klVar.hashCode();
    }

    public final String toString() {
        return "MinimizeComment(minimizedComment=" + this.a + ")";
    }
}
