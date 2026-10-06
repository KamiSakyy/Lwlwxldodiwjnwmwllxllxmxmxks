package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ym {
    public sm a;

    public ym(sm smVar) {
        this.a = smVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym) && k71.k.b(this.a, ((ym) obj).a);
    }

    public final int hashCode() {
        sm smVar = this.a;
        if (smVar == null) {
            return 0;
        }
        return smVar.hashCode();
    }

    public final String toString() {
        return "OnIssue(mentionableItems=" + this.a + ")";
    }
}
