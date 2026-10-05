package le;

import com.github.service.models.response.type.SubscriptionState;

/* loaded from: /home/user/work/p/classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28446a;

    /* renamed from: b, reason: collision with root package name */
    public final SubscriptionState f28447b;

    /* renamed from: c, reason: collision with root package name */
    public final SubscriptionState f28448c;

    public a0(boolean z10, SubscriptionState subscriptionState, SubscriptionState subscriptionState2) {
        k71.k.g(subscriptionState, "unsubscribeState");
        this.f28446a = z10;
        this.f28447b = subscriptionState;
        this.f28448c = subscriptionState2;
    }

    public static a0 a(a0 a0Var, boolean z10) {
        SubscriptionState subscriptionState = a0Var.f28447b;
        SubscriptionState subscriptionState2 = a0Var.f28448c;
        a0Var.getClass();
        k71.k.g(subscriptionState, "unsubscribeState");
        return new a0(z10, subscriptionState, subscriptionState2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f28446a == a0Var.f28446a && this.f28447b == a0Var.f28447b && this.f28448c == a0Var.f28448c;
    }

    public final int hashCode() {
        int hashCode = (this.f28447b.hashCode() + (Boolean.hashCode(this.f28446a) * 31)) * 31;
        SubscriptionState subscriptionState = this.f28448c;
        return hashCode + (subscriptionState == null ? 0 : subscriptionState.hashCode());
    }

    public final String toString() {
        return "SubscribableNotification(isSubscribed=" + this.f28446a + ", unsubscribeState=" + this.f28447b + ", subscribeAction=" + this.f28448c + ")";
    }
}
