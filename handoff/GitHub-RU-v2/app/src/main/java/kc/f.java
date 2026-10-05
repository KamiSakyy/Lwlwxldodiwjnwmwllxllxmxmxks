package kc;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a0;
import androidx.lifecycle.d1;
import java.util.LinkedHashMap;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f27845r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Bundle f27846s;

    public f(a0 a0Var, Bundle bundle) {
        this.f27845r = a0Var;
        this.f27846s = bundle;
    }

    public final Object a() {
        Intent intent;
        a0 a0Var = this.f27845r;
        t6.d dVar = new t6.d(a0Var.g0());
        k.i w32 = a0Var.w3();
        Bundle bundle = this.f27846s;
        if (w32 != null && (intent = w32.getIntent()) != null) {
            bundle.putString("EXTRA_URL", intent.getStringExtra("EXTRA_URL"));
            bundle.putBoolean("EXTRA_IS_IN_APP_NAVIGATION", intent.getBooleanExtra("EXTRA_IS_IN_APP_NAVIGATION", false));
            bundle.putString("EXTRA_USER_PRESET", intent.getStringExtra("EXTRA_USER_PRESET"));
        }
        i80.d dVar2 = d1.f2840c;
        LinkedHashMap linkedHashMap = dVar.f32100a;
        Bundle bundle2 = (Bundle) linkedHashMap.get(dVar2);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putAll(bundle);
        linkedHashMap.put(dVar2, bundle2);
        return dVar;
    }
}
