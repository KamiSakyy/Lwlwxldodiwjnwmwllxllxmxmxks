package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final Boolean a;

    public c(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && k71.k.b(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.e(this.a, "MobilePushNotificationSettings(getsLiveActivityCopilotCodingAgentV2=", ")");
    }
}
