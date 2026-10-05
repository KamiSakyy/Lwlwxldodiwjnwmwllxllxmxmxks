package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ck {
    public final wj a;

    public ck(wj wjVar) {
        this.a = wjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ck) && k71.k.b(this.a, ((ck) obj).a);
    }

    public final int hashCode() {
        wj wjVar = this.a;
        if (wjVar == null) {
            return 0;
        }
        return wjVar.hashCode();
    }

    public final String toString() {
        return "OnIssue(mentionableItems=" + this.a + ")";
    }
}
