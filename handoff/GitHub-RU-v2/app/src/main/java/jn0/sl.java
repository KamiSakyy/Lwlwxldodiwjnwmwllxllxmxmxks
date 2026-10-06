package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sl {
    public ml a;

    public sl(ml mlVar) {
        this.a = mlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sl) && k71.k.b(this.a, ((sl) obj).a);
    }

    public final int hashCode() {
        ml mlVar = this.a;
        if (mlVar == null) {
            return 0;
        }
        return mlVar.hashCode();
    }

    public final String toString() {
        return "OnDiscussion(mentionableItems=" + this.a + ")";
    }
}
