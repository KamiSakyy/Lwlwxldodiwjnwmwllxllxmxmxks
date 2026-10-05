package ua;

import android.content.Context;
import com.github.service.models.response.WorkflowRunEvent;
import ic.vh;
import java.time.ZonedDateTime;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32278a;

        static {
            int[] iArr = new int[WorkflowRunEvent.values().length];
            try {
                iArr[WorkflowRunEvent.PULL_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkflowRunEvent.SCHEDULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkflowRunEvent.PUSH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkflowRunEvent.WORKFLOW_DISPATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f32278a = iArr;
        }
    }

    public static final String a(WorkflowRunEvent workflowRunEvent, Context context, String str, ZonedDateTime zonedDateTime, boolean z10) {
        k.g(workflowRunEvent, "<this>");
        k.g(context, "context");
        k.g(str, "creatorLogin");
        k.g(zonedDateTime, "timeStamp");
        String j10 = vh.j(context, zonedDateTime, true, !z10);
        int i = a.f32278a[workflowRunEvent.ordinal()];
        if (i == 1) {
            String string = context.getString(2131951711, str, j10);
            k.f(string, "getString(...)");
            return string;
        }
        if (i == 2) {
            String string2 = context.getString(2131951715);
            k.f(string2, "getString(...)");
            return string2;
        }
        if (i == 3) {
            String string3 = context.getString(2131951713, str, j10);
            k.f(string3, "getString(...)");
            return string3;
        }
        if (i != 4) {
            String string4 = context.getString(2131951709, str, j10);
            k.f(string4, "getString(...)");
            return string4;
        }
        String string5 = context.getString(2131951717, str, j10);
        k.f(string5, "getString(...)");
        return string5;
    }
}
