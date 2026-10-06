package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fw implements aaShadow.v0 {
    public final iw a;

    public fw(iw iwVar) {
        this.a = iwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fw) && k71.k.b(this.a, ((fw) obj).a);
    }

    public final int hashCode() {
        iw iwVar = this.a;
        if (iwVar == null) {
            return 0;
        }
        return iwVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
