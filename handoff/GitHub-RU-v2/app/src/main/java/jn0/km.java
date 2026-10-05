package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class km implements aa.m0 {
    public final mm a;

    public km(mm mmVar) {
        this.a = mmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof km) && k71.k.b(this.a, ((km) obj).a);
    }

    public final int hashCode() {
        mm mmVar = this.a;
        if (mmVar == null) {
            return 0;
        }
        return mmVar.hashCode();
    }

    public final String toString() {
        return "Data(mergePullRequest=" + this.a + ")";
    }
}
