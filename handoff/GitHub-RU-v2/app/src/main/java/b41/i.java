package b41;

import android.os.Bundle;
import com.google.android.play.core.install.InstallException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i extends hShadow {
    @Override // b41.h, c41.i
    public final void c(Bundle bundle) {
        super.c(bundle);
        int i = bundle.getInt("error.code", -2);
        w21.g gVar = this.h;
        if (i != 0) {
            gVar.b(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            gVar.c(null);
        }
    }
}
