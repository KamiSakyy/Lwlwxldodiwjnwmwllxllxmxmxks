package w2;

import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: /home/user/work/p/classes.dex */
public final class i implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f33053a;

    public i(Context context) {
        Object systemService = context.getSystemService("clipboard");
        k71.k.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f33053a = (ClipboardManager) systemService;
    }
}
