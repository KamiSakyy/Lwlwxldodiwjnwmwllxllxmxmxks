package w2;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* loaded from: /home/user/work/p/classes.dex */
public final class h implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public i f33047a;

    public h(i iVar) {
        this.f33047a = iVar;
    }

    public final void a(b1 b1Var) {
        ClipboardManager clipboardManager = this.f33047a.f33053a;
        if (b1Var != null) {
            clipboardManager.setPrimaryClip(b1Var.f32980a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            u0.a(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
