package o4;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
