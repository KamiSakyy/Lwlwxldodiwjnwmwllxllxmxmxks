package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pa {
    public final na a;

    public pa(na naVar) {
        this.a = naVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pa) && k71.k.b(this.a, ((pa) obj).a);
    }

    public final int hashCode() {
        na naVar = this.a;
        if (naVar == null) {
            return 0;
        }
        return naVar.hashCode();
    }

    public final String toString() {
        return "OnDiscussionComment(discussion=" + this.a + ")";
    }
}
