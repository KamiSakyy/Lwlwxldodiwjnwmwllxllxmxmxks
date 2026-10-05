package b9;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import v8.x;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3849a = 0;

    static {
        k71.k.f(x.b("NetworkStateTracker"), "tagWithPrefix(...)");
    }

    public static final z8.e a(ConnectivityManager connectivityManager) {
        boolean z10;
        NetworkCapabilities networkCapabilities;
        k71.k.g(connectivityManager, "<this>");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (SecurityException unused) {
                x.a().getClass();
            }
            if (networkCapabilities != null) {
                z10 = networkCapabilities.hasCapability(16);
                return new z8.e(z11, z10, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
            }
            z10 = false;
            return new z8.e(z11, z10, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        } catch (SecurityException unused2) {
            x.a().getClass();
            return new z8.e(false, false, false, true);
        }
    }
}
