package y8;

import a5.k0;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import k71.k;
import v8.x;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34283a = 0;

    static {
        k.f(x.b("SystemJobScheduler"), "tagWithPrefix(...)");
    }

    public static final JobScheduler a(Context context) {
        k.g(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        k.e(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? k0.b(jobScheduler) : jobScheduler;
    }
}
