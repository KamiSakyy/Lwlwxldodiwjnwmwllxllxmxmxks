package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import b9.f;
import com.github.rudroid.fragments.i4;
import d51.d;
import java.util.concurrent.Executor;
import l51.h;
import m11.j;
import m11.s;
import w11.a;

/* loaded from: /home/user/work/p/classes4.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int r = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        s.b(getApplicationContext());
        h a = j.a();
        a.J(string);
        a.u = a.b(i);
        if (string2 != null) {
            a.t = Base64.decode(string2, 0);
        }
        d dVar = s.a().d;
        ((Executor) dVar.e).execute(new i4(dVar, a.i(), i2, new f(15, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
