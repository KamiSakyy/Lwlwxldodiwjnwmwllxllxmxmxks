package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l2 {
    public final String a;

    public l2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2) && k71.k.b(this.a, ((l2) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("ApproveActionRequiredWorkflowRuns(clientMutationId=", this.a, ")");
    }
}
