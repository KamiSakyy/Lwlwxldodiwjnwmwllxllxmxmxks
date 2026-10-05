package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pf implements aa.v0 {
    public final nf a;

    public pf(nf nfVar) {
        this.a = nfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf) && k71.k.b(this.a, ((pf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(codeSearch=" + this.a + ")";
    }
}
