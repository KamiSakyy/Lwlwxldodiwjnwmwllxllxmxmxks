package o6;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.collect.m;
import sy.c0;
import v8.w;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends c0 {

    /* renamed from: r, reason: collision with root package name */
    public m f29992r;

    public a(m mVar) {
        this.f29992r = mVar;
    }

    public final w h(Context context, String str, WorkerParameters workerParameters) {
        v61.a aVar = (v61.a) this.f29992r.get(str);
        if (aVar == null) {
            return null;
        }
        return ((b) aVar.get()).a(context, workerParameters);
    }
}
