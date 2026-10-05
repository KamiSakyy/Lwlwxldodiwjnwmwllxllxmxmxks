package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import l3.a0;
import la0.d;
import z7.b;

/* loaded from: /home/user/work/p/classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // z7.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // z7.b
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new a0(this, context.getApplicationContext()));
        return new d(7);
    }
}
