package b6;

import android.R;
import android.os.Build;
import android.widget.RemoteViews;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class p {
    public static void a(RemoteViews remoteViews, int i, n6.g gVar) {
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalArgumentException("setClipToOutline is only available on SDK 31 and higher".toString());
        }
        remoteViews.setBoolean(i, "setClipToOutline", true);
        if (gVar instanceof n6.b) {
            remoteViews.setViewOutlinePreferredRadius(i, ((n6.b) gVar).f29638a, 1);
        } else if (gVar instanceof n6.e) {
            remoteViews.setViewOutlinePreferredRadiusDimen(i, R.dimen.system_app_widget_background_radius);
        } else {
            throw new IllegalStateException(("Rounded corners should not be " + gVar.getClass().getCanonicalName()).toString());
        }
    }

    public static void b(RemoteViews remoteViews, int i, n6.g gVar) {
        if (gVar instanceof n6.f) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
            return;
        }
        if (gVar instanceof n6.c) {
            remoteViews.setViewLayoutHeight(i, 0.0f, 0);
            return;
        }
        if (gVar instanceof n6.b) {
            remoteViews.setViewLayoutHeight(i, ((n6.b) gVar).f29638a, 1);
        } else if (gVar instanceof n6.e) {
            remoteViews.setViewLayoutHeightDimen(i, R.dimen.system_app_widget_background_radius);
        } else {
            if (!gVar.equals(n6.d.f29640a)) {
                throw new NoWhenBranchMatchedException();
            }
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        }
    }

    public static void c(RemoteViews remoteViews, int i, n6.g gVar) {
        if (gVar instanceof n6.f) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
            return;
        }
        if (gVar instanceof n6.c) {
            remoteViews.setViewLayoutWidth(i, 0.0f, 0);
            return;
        }
        if (gVar instanceof n6.b) {
            remoteViews.setViewLayoutWidth(i, ((n6.b) gVar).f29638a, 1);
        } else if (gVar instanceof n6.e) {
            remoteViews.setViewLayoutWidthDimen(i, R.dimen.system_app_widget_background_radius);
        } else {
            if (!gVar.equals(n6.d.f29640a)) {
                throw new NoWhenBranchMatchedException();
            }
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        }
    }
}
