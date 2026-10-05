package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sk implements aa.m0 {
    public final tk a;

    public sk(tk tkVar) {
        this.a = tkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sk) && k71.k.b(this.a, ((sk) obj).a);
    }

    public final int hashCode() {
        tk tkVar = this.a;
        if (tkVar == null) {
            return 0;
        }
        return tkVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationAsDone=" + this.a + ")";
    }
}
