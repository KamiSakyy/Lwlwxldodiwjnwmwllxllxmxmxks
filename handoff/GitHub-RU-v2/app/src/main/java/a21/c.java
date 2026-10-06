package a21;

import android.content.Context;
import android.os.Build;
import b1.m;
import c21.uShadow;
import com.google.android.gms.internal.measurement.h0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public Context a;
    public String b;
    public m c;
    public c21.m d;
    public b21.a e;
    public int f;
    public rb0.b g;
    public b21.d h;

    public c(Context context, m mVar, c21.m mVar2, b bVar) {
        uShadow.h(context, "Null context is not permitted.");
        uShadow.h(mVar, "Api must not be null.");
        uShadow.h(bVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        uShadow.h(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = mVar;
        this.d = mVar2;
        this.e = new b21.a(mVar, mVar2, attributionTag);
        b21.d d = b21.d.d(applicationContext);
        this.h = d;
        this.f = d.y.getAndIncrement();
        this.g = bVar.a;
        h0 h0Var = d.D;
        h0Var.sendMessage(h0Var.obtainMessage(7, this));
    }

}
