package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ia implements aaShadow.m0 {
    public final ja a;

    public ia(ja jaVar) {
        this.a = jaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia) && k71.k.b(this.a, ((ia) obj).a);
    }

    public final int hashCode() {
        ja jaVar = this.a;
        if (jaVar == null) {
            return 0;
        }
        return jaVar.hashCode();
    }

    public final String toString() {
        return "Data(disablePullRequestAutoMerge=" + this.a + ")";
    }
}
