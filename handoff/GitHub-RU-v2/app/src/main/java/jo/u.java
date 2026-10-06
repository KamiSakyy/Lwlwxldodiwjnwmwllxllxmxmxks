package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u implements aaShadow.m0 {
    public final s a;

    public u(s sVar) {
        this.a = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && k71.k.b(this.a, ((u) obj).a);
    }

    public final int hashCode() {
        s sVar = this.a;
        if (sVar == null) {
            return 0;
        }
        return sVar.hashCode();
    }

    public final String toString() {
        return "Data(addDiscussionPollVote=" + this.a + ")";
    }
}
