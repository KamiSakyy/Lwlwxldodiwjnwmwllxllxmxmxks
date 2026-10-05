package com.github.rudroid.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.github.rudroid.main.MainActivity;
import com.github.rudroid.views.LoadingViewFlipper;
import com.github.rudroid.widget.agenttasks.AgentTasksWidgetWorker;
import com.github.rudroid.widget.contribution.ContributionWidgetWorker;
import com.github.rudroid.widget.pullrequests.PullRequestsWidgetWorker;
import java.io.File;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class m implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ Context s;

    public /* synthetic */ m(Context context, int i) {
        this.r = i;
        this.s = context;
    }

    public final Object a() {
        int i = this.r;
        a0 a0Var = a0.a;
        Context context = this.s;
        switch (i) {
            case 0:
                LoadingViewFlipper.a aVar = LoadingViewFlipper.Companion;
                return new com.github.rudroid.utilities.b(context);
            case 1:
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = new Intent(context, (Class<?>) MainActivity.class);
                }
                context.startActivity(launchIntentForPackage);
                return a0Var;
            case 2:
                Intent launchIntentForPackage2 = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage2 == null) {
                    launchIntentForPackage2 = new Intent(context, (Class<?>) MainActivity.class);
                }
                context.startActivity(launchIntentForPackage2);
                return a0Var;
            case 3:
                AgentTasksWidgetWorker.Companion.getClass();
                AgentTasksWidgetWorker.a.a(context);
                return a0Var;
            case 4:
                ContributionWidgetWorker.Companion.getClass();
                ContributionWidgetWorker.a.a(context);
                return a0Var;
            case 5:
                PullRequestsWidgetWorker.Companion.getClass();
                PullRequestsWidgetWorker.a.a(context);
                return a0Var;
            case 6:
                Bitmap.Config[] configArr = w9.f.a;
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir.mkdirs();
                return cacheDir;
            default:
                Bitmap.Config[] configArr2 = w9.f.a;
                File cacheDir2 = context.getCacheDir();
                if (cacheDir2 == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir2.mkdirs();
                return cacheDir2;
        }
    }
}
