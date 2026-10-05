package e9;

import android.net.NetworkRequest;
import v8.x;

/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22145b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f22146a;

    static {
        k71.k.f(x.b("NetworkRequestCompat"), "tagWithPrefix(...)");
    }

    public i(NetworkRequest networkRequest) {
        this.f22146a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && k71.k.b(this.f22146a, ((i) obj).f22146a);
    }

    public final int hashCode() {
        Object obj = this.f22146a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f22146a + ')';
    }
}
