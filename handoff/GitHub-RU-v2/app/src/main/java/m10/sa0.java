package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sa0 {
    public final aa1.b a = aa.t0.d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa0) && k71.k.b(this.a, ((sa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SubscribeToCopilotLimitedInput(clientMutationId=" + this.a + ")";
    }
}
