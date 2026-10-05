package a7;

import android.os.Bundle;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class m implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f581r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Bundle f582s;

    public /* synthetic */ m(int i, Bundle bundle) {
        this.f581r = i;
        this.f582s = bundle;
    }

    public final Object k(Object obj) {
        boolean containsKey;
        String str = (String) obj;
        switch (this.f581r) {
            case k5.f.J /* 0 */:
                k71.k.g(str, "key");
                Bundle bundle = this.f582s;
                k71.k.g(bundle, "source");
                containsKey = bundle.containsKey(str);
                break;
            default:
                k71.k.g(str, "argName");
                Bundle bundle2 = this.f582s;
                k71.k.g(bundle2, "source");
                containsKey = bundle2.containsKey(str);
                break;
        }
        return Boolean.valueOf(!containsKey);
    }
}
