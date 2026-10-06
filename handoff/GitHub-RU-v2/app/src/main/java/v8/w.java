package v8;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32842a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f32843b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f32844c = new AtomicInteger(-256);

    /* renamed from: d, reason: collision with root package name */
    public boolean f32845d;

    public w(Context context, WorkerParameters workerParameters) {
        this.f32842a = context;
        this.f32843b = workerParameters;
    }

    public abstract x3.k a();

    public abstract x3.k b();
    public Object d = null;
}
