package com.github.rudroid;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.github.rudroid.widget.agenttasks.AgentTasksWidgetWorker;

/* loaded from: /home/user/work/p/classes.dex */
public final class i implements com.github.rudroid.widget.agenttasks.x {
    public final v8.w a(Context context, WorkerParameters workerParameters) {
        return new AgentTasksWidgetWorker(context, workerParameters);
    }
}
