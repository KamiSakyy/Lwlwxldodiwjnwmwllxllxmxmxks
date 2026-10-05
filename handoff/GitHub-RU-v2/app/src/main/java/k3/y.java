package k3;

import android.graphics.Typeface;

/* loaded from: /home/user/work/p/classes.dex */
public final class y implements x {
    public static Typeface c(String str, s sVar, int i) {
        if (i == 0 && k71.k.b(sVar, s.f27694w) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), sVar.f27698r, i == 1);
    }

    @Override // k3.x
    public final Typeface a(s sVar, int i) {
        return c(null, sVar, i);
    }

    @Override // k3.x
    public final Typeface b(u uVar, s sVar, int i) {
        return c(uVar.f27700u, sVar, i);
    }
}
