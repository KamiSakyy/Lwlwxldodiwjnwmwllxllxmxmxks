package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class aj {
    public final ui a;

    public aj(ui uiVar) {
        this.a = uiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj) && k71.k.b(this.a, ((aj) obj).a);
    }

    public final int hashCode() {
        ui uiVar = this.a;
        if (uiVar == null) {
            return 0;
        }
        return uiVar.hashCode();
    }

    public final String toString() {
        return "OnIssue(mentionableItems=" + this.a + ")";
    }
}
