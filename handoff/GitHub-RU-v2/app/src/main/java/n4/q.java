package n4;

import android.app.Notification;
import android.graphics.drawable.Icon;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class q {
    public static void a(Notification.ProgressStyle progressStyle, int i) {
        progressStyle.setProgress(i);
    }

    public static void b(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    public static void c(Notification.ProgressStyle progressStyle, boolean z10) {
        progressStyle.setProgressIndeterminate(z10);
    }

    public static void d(Notification.ProgressStyle progressStyle, List<r> list) {
        for (r rVar : list) {
            rVar.getClass();
            progressStyle.addProgressPoint(new Notification.ProgressStyle.Point(50).setColor(rVar.f29475a).setId(0));
        }
    }

    public static void e(Notification.ProgressStyle progressStyle, List<s> list) {
        for (s sVar : list) {
            progressStyle.addProgressSegment(new Notification.ProgressStyle.Segment(sVar.f29476a).setColor(sVar.f29477b).setId(0));
        }
    }

    public static void f(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    public static void g(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    public static void h(Notification.ProgressStyle progressStyle, boolean z10) {
        progressStyle.setStyledByProgress(z10);
    }
}
