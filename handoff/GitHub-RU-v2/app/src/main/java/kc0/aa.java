package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class aa implements aa.v0 {
    public final ba a;

    public aa(ba baVar) {
        this.a = baVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa) && k71.k.b(this.a, ((aa) obj).a);
    }

    public final int hashCode() {
        ba baVar = this.a;
        if (baVar == null) {
            return 0;
        }
        return baVar.hashCode();
    }

    public final String toString() {
        return "Data(discussionCategory=" + this.a + ")";
    }



}
