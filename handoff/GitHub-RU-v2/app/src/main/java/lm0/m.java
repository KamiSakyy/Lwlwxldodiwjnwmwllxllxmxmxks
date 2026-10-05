package lm0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m {
    public final l a;

    public m(l lVar) {
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && k71.k.b(this.a, ((m) obj).a);
    }

    public final int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public final String toString() {
        return "UpdateRepository(repository=" + this.a + ")";
    }
}
