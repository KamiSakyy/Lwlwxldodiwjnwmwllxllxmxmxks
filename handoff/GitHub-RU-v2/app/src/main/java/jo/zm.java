package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zm {
    public final qm a;

    public zm(qm qmVar) {
        this.a = qmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm) && k71.k.b(this.a, ((zm) obj).a);
    }

    public final int hashCode() {
        qm qmVar = this.a;
        if (qmVar == null) {
            return 0;
        }
        return qmVar.hashCode();
    }

    public final String toString() {
        return "OnPullRequest(mentionableItems=" + this.a + ")";
    }
}
