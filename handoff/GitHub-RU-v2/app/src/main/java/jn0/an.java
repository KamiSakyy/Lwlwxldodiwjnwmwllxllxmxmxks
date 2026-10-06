package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class an {
    public final bn a;

    public an(bn bnVar) {
        this.a = bnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof an) && k71.k.b(this.a, ((an) obj).a);
    }

    public final int hashCode() {
        bn bnVar = this.a;
        if (bnVar == null) {
            return 0;
        }
        return bnVar.hashCode();
    }

    public final String toString() {
        return "MinimizeComment(minimizedComment=" + this.a + ")";
    }
}
