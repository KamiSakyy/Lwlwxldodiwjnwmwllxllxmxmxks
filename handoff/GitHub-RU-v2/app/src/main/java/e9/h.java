package e9;

import android.net.NetworkRequest;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class h {
    public static int[] a(NetworkRequest networkRequest) {
        k71.k.g(networkRequest, "request");
        int[] capabilities = networkRequest.getCapabilities();
        k71.k.f(capabilities, "getCapabilities(...)");
        return capabilities;
    }

    public static int[] b(NetworkRequest networkRequest) {
        k71.k.g(networkRequest, "request");
        int[] transportTypes = networkRequest.getTransportTypes();
        k71.k.f(transportTypes, "getTransportTypes(...)");
        return transportTypes;
    }
}
